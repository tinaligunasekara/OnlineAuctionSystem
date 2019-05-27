<%@page import="com.oop.model.User"%>
<%@page import="com.oop.service.UserService"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.oop.service.impl.UserServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
  <title>OnlineAuctionSystem</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- Material Kit CSS -->
  <link href="assets/css/material-kit.min1036.css?v=2.0.5" rel="stylesheet" />

</head>

<body>
   <nav class="navbar  bg-white   fixed-top  navbar-expand-lg " id="sectionsNav">
    <div class="container">
      <div class="navbar-translate">
        <a class="navbar-brand" href="index.html">
          Admin User Management </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="sr-only">Toggle navigation</span>
          <span class="navbar-toggler-icon"></span>
          <span class="navbar-toggler-icon"></span>
          <span class="navbar-toggler-icon"></span>
        </button>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="navbar-nav ml-auto">
          <li class="dropdown nav-item">
            <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
              <i class="material-icons">apps</i> Components
            </a>
            <div class="dropdown-menu dropdown-with-icons">
              <a href="presentation.html" class="dropdown-item">
                <i class="material-icons">layers</i> Presentation
              </a>
              <a href="index.html" class="dropdown-item">
                <i class="material-icons">line_style</i> All Components
              </a>
              <a href="docs/2.1/getting-started/introduction.html" class="dropdown-item">
                <i class="material-icons">content_paste</i> Documentation
              </a>
            </div>
          </li>
          <li class="dropdown nav-item">
            <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
              <i class="material-icons">view_day</i> Sections
            </a>
            <div class="dropdown-menu dropdown-with-icons">
              <a href="sections.html#headers" class="dropdown-item">
                <i class="material-icons">dns</i> Headers
              </a>
              <a href="sections.html#features" class="dropdown-item">
                <i class="material-icons">build</i> Features
              </a>
              <a href="sections.html#blogs" class="dropdown-item">
                <i class="material-icons">list</i> Blogs
              </a>
              <a href="sections.html#teams" class="dropdown-item">
                <i class="material-icons">people</i> Teams
              </a>
              <a href="sections.html#projects" class="dropdown-item">
                <i class="material-icons">assignment</i> Projects
              </a>
              <a href="sections.html#pricing" class="dropdown-item">
                <i class="material-icons">monetization_on</i> Pricing
              </a>
              <a href="sections.html#testimonials" class="dropdown-item">
                <i class="material-icons">chat</i> Testimonials
              </a>
              <a href="sections.html#contactus" class="dropdown-item">
                <i class="material-icons">call</i> Contacts
              </a>
            </div>
          </li>
          <li class="dropdown nav-item">
            <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
              <i class="material-icons">view_carousel</i> Examples
            </a>
            <div class="dropdown-menu dropdown-with-icons">
              <a href="examples/about-us.html" class="dropdown-item">
                <i class="material-icons">account_balance</i> About Us
              </a>
              <a href="examples/blog-post.html" class="dropdown-item">
                <i class="material-icons">art_track</i> Blog Post
              </a>
              <a href="examples/blog-posts.html" class="dropdown-item">
                <i class="material-icons">view_quilt</i> Blog Posts
              </a>
              <a href="examples/contact-us.html" class="dropdown-item">
                <i class="material-icons">location_on</i> Contact Us
              </a>
              <a href="examples/landing-page.html" class="dropdown-item">
                <i class="material-icons">view_day</i> Landing Page
              </a>
              <a href="examples/login-page.html" class="dropdown-item">
                <i class="material-icons">fingerprint</i> Login Page
              </a>
              <a href="examples/pricing.html" class="dropdown-item">
                <i class="material-icons">attach_money</i> Pricing Page
              </a>
              <a href="examples/shopping-cart.html" class="dropdown-item">
                <i class="material-icons">shopping_basket</i> Shopping Cart
              </a>
              <a href="examples/ecommerce.html" class="dropdown-item">
                <i class="material-icons">store</i> Ecommerce Page
              </a>
              <a href="examples/product-page.html" class="dropdown-item">
                <i class="material-icons">shopping_cart</i> Product Page
              </a>
              <a href="examples/profile-page.html" class="dropdown-item">
                <i class="material-icons">account_circle</i> Profile Page
              </a>
              <a href="examples/signup-page.html" class="dropdown-item">
                <i class="material-icons">person_add</i> Signup Page
              </a>
              <a href="examples/error.html" class="dropdown-item">
                <i class="material-icons">error</i> Error Page
              </a>
            </div>
          </li>
          <li class="button-container nav-item iframe-extern">
            <a target="_blank" class="btn  btn-primary   btn-round btn-block">
              <i class="material-icons"></i> Logout
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  
  

  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/bg3.jpg')">
    <div class="container">
      <div class="row">
        <div class="col-md-8 ml-auto mr-auto">
          <div class="brand text-center">
            <h1></h1>
            <h3 class="title text-center">Subtitle</h3>
          </div>
        </div>

      </div>
    </div>
  </div>
  <div class="main main-raised">
    <div class="container">
      <div class="section text-center">
      
		  <h2>Users</h2>

  <div style="align-content: center">
    <table class="table">
    <thead>
     <tr>
       
        <td>User ID</td>
        <td>User Name</td>
        <td>First Name</td>
        <td>Last Name</td>  
        <td>Gender</td>      
        <td>E-mail</td>
        <td>Mobile number</td>
        <td class="text-right">Password</td>
      </tr>
      
      <%
      	UserService serv = new UserServiceImpl();
    
      
      	ArrayList<User> list = serv.getAllUsers();
      
      	if(list!=null){
      		
      	
    	 
      %>
      </thead>
      <tbody>
      <%
      		for(User u1 :list){
      %>
      <tr>
			
		<td><%=u1.getUserId() %></td>
        <td><%=u1.getUserName() %></td>
        <td><%=u1.getFname() %></td>  
        <td><%=u1.getLname() %></td>      
         <td><%=u1.getGender() %></td>
        <td><%=u1.getEmail() %></td>
         <td><%=u1.getMobile() %></td>
        <td><%=u1.getPassword()%></td>
	    <td>
	    <form action="DeleteUserServlet" method="post">
	    
	    	<input type = "hidden" name="deletevalue" value = "<%=u1.getUserId() %>">
	    	<button class="btn btn-primary btn-round " class="space" id="as1">DELETE</button>
	    </form>
      </tr>
      <%
      } 
      	}
      %>
    </tbody>
    </table>
  </div>
  
   <div class="container">
    <div class=" text-center">
      <h1 class="title"></h1>
    </div>
    
  </div>
</div>

      </div>
	  

    </div>
  
  <footer class="footer footer-default">
    <div class="container">
      <nav class="float-left">
        <ul>
          <li>
            <a href="https://www.creative-tim.com/">
              Creative Tim
            </a>
          </li>
        </ul>
      </nav>
      <div class="copyright float-right">
        &copy;
        <script>
          document.write(new Date().getFullYear())
        </script>, made with <i class="material-icons">favorite</i> by
        <a href="https://www.creative-tim.com/" target="blank">Creative Tim</a> for a better web.
      </div>
    </div>
  </footer>


  <!--   Core JS Files   -->
  <script src="assets/js/core/jquery.min.js" type="text/javascript"></script>
  <script src="assets/js/core/popper.min.js" type="text/javascript"></script>
  <script src="assets/js/core/bootstrap-material-design.min.js" type="text/javascript"></script>
  <script src="assets/js/plugins/moment.min.js"></script>
  <!--	Plugin for the Datepicker, full documentation here: https://github.com/Eonasdan/bootstrap-datetimepicker -->
  <script src="assets/js/plugins/bootstrap-datetimepicker.js" type="text/javascript"></script>
  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
  <script src="assets/js/plugins/nouislider.min.js" type="text/javascript"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDGat1sgDZ-3y6fFe6HD7QUziVC6jlJNog"></script>
  <!-- Place this tag in your head or just before your close body tag. -->
  <script async defer src="../../buttons.github.io/buttons.js"></script>
  <!--	Plugin for Sharrre btn -->
  <script src="assets/js/plugins/jquery.sharrre.js" type="text/javascript"></script>
  <!--	Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
  <script src="assets/js/plugins/bootstrap-tagsinput.js"></script>
  <!--	Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
  <script src="assets/js/plugins/bootstrap-selectpicker.js" type="text/javascript"></script>
  <!--	Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
  <script src="assets/js/plugins/jasny-bootstrap.min.js" type="text/javascript"></script>
  <!--	Plugin for Small Gallery in Product Page -->
  <script src="assets/js/plugins/jquery.flexisel.js" type="text/javascript"></script>
  <!-- Plugins for presentation and navigation  -->
  <script src="assets/demo/modernizr.js" type="text/javascript"></script>
  <script src="assets/demo/vertical-nav.js" type="text/javascript"></script>
  <!-- Place this tag in your head or just before your close body tag. -->
  <script async defer src="../../buttons.github.io/buttons.js"></script>
  <!-- Js With initialisations For Demo Purpose, Don't Include it in Your Project -->
  <script src="assets/demo/demo.js" type="text/javascript"></script>
  <!-- Control Center for Material Kit: parallax effects, scripts for the example pages etc -->
  <script src="assets/js/material-kit.min1036.js?v=2.1.1" type="text/javascript"></script>

</body>

</html>