

<%@page import="com.oop.model.Bid"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.oop.service.BidService"%>
<%@page import="com.oop.service.impl.BidServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <title>Auction System</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <!--     Fonts and icons     -->
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <!-- Material Kit CSS -->
    <link href="assets/css/material-kit.min1036.css?v=2.0.5" rel="stylesheet" />

    <style>
        .img{
            height: 200px;
            width: 200px;
            cursor: pointer;
            border: 1px solid white;

        }
        .tableHead{
            font-size: 50px;
            padding: 50px;
            font-family: Trebuchet MS;
            color: white;
            letter-spacing: 4px;
            text-transform: uppercase;

        }
        table{
            text-align: center;
            width: 85%;

        }
        b{

            font-size: 28px;
        }
        .previous {
            background-color: #ffffff;
            color: rgb(0, 0, 0);
        }

        .next {
            background-color: none;
            color: black;
            float: right;
            border: none;
            outline: none;
            cursor: pointer;
            padding: 14px 40px;
            font-family : Trebuchet MS;
            font-size: 20px;
            width: 17%;
            text-decoration: none;
        }

        .next:hover {
            color: #A7A7A7;
        }

        .prev {
            background-color: none;
            color: black;
            float: left;
            border: none;
            outline: none;
            cursor: pointer;
            padding: 14px 40px;
            font-family : Trebuchet MS;
            font-size: 20px;
            width: 17%;
            text-decoration: none;
        }

        .prev:hover {
            color: #A7A7A7;
        }

        .des{
            height: auto;
            width: auto;
            border-collapse: collapse;
            border: 2px solid rgb(63, 63, 63);
            padding: 1px;
            font-family: Trebuchet MS;
            color: white;
            background-color: black;
            opacity: 0.8;

        }

        span {
            background-color: black;
            padding: 5px;
        }

        #nextprev {
            background-color: white;
            border: 1px solid black;
        }
    </style>

</head>




<body>

<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <div class="page-header header-filter" style="background-image: url('img/a1.png');">
                <div class="container">

                </div>
            </div>
        </div>
        <div class="carousel-item">
            <div class="page-header header-filter" style="background-image: url('img/b1.jpg');">
                <div class="container">

                </div>
            </div>
        </div>
        <div class="carousel-item">
            <div class="page-header header-filter" style="background-image: url('img/b4.jpg');">
                <div class="container">

                </div>
            </div>
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <i class="material-icons">keyboard_arrow_left</i>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <i class="material-icons">keyboard_arrow_right</i>
        <span class="sr-only">Next</span>
    </a>
</div>
<!--  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/bg3.jpg')">
   <div class="container">
     <div class="row">
       <div class="col-md-8 ml-auto mr-auto">
         <div class="brand text-center">
           <h1>Slide show</h1>
           <h3 class="title text-center"></h3>
         </div>
       </div>

     </div>
   </div>
 </div> -->

<div class="main main-raised" style="background-image: url('img/back3.jpeg');">
    <nav class="navbar navbar-expand-lg bg-primary" class="nav1">
        <div class="container">
            <div class="navbar-translate">
                <a class="navbar-brand" href="index.jsp">Home</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="navbar-toggler-icon"></span>
                    <span class="navbar-toggler-icon"></span>
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a href="LoginJsp.jsp" class="nav-link">Login</a>
                    </li>
                    <li class="nav-item">
                        <a href="#pablo" class="nav-link">Register</a>
                    </li>
                    <li class="nav-item">
                        <a href="ContactUs.jsp" class="nav-link">Customcare</a>
                    </li>

                </ul>
                <form class="form-inline ml-auto">
                    <div class="form-group has-white">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-white btn-raised btn-fab btn-round">
                        <i class="material-icons">search</i>
                    </button>
                </form>
            </div>


        </div>
    </nav>

    <table>
        <tr>
            <th>
    <div class="row">
        <div class="col-md-4">
            <ul class="nav nav-pills nav-pills-primary flex-column">
                <li class="nav-item">
                    <a class="nav-link active" href="#tab1" data-toggle="tab">DASHBOARD</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#tab2" data-toggle="tab">PRODUCT</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#tab3" data-toggle="tab">BID</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#tab3" data-toggle="tab">USERS</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#tab3" data-toggle="tab">PAYMENT</a>
                </li>
            </ul>
        </div>

    </div>
            </th>
            <th>
    <div style="align-content: center">
    <table class="table">
        <thead>
        <tr>
            
            <th style="color: black;">bid_id</th>
            <th style="color: black;">user_id</th>
            <th style="color: black;">bid_init</th>
            <th style="color: black;">user_price</th>
            <th style="color: black;">p_id</th>
            <th class="text-right" style="color: black;">Actions</th>
        </tr>
        
        <%
			int sessionUserValue=1;
        	
		%>
        
        <%
        BidService serv = new BidServiceImpl();
        ArrayList<Bid> bidList = serv.getAllBids();
     
        
        %>
        
        </thead>
        
        <tbody>
        <%
        	for(Bid bid :bidList){
        %>
        <tr>
            
            <td><%=bid.getBidID() %></td>
            <td><%=sessionUserValue%></td>   
            <td><%=bid.getBidInit()%></td>
             <td><%=bid.getBidPrice()%></td>
              <td><%=bid.getpID()%></td>
            <!--  <td class="text-right">&euro; 99,225</td>-->
            
            
             <td class="td-actions text-right">
               <!--  <button type="button" rel="tooltip" class="btn btn-info">
                    <i class="material-icons">person</i>
                </button>
                <button type="button" rel="tooltip" class="btn btn-success">
                    <i class="material-icons">edit</i>
                </button>
                 <button type="button" rel="tooltip" class="btn btn-danger">
                    <i class="material-icons">close</i>
                </button> -->
               
                
                <form action="DeleteBidServlet" method="post">
                
                	<input type="hidden" name="deleteValue" value="<%=bid.getBidID() %>">
                	
                	<button class="btn btn-primary btn-round">Delete</button>
                	
                </form>
                
            </td>
        </tr>
        <%
        	}
        %>
       
        
        </tbody>
        
    </table>
    </div>
            </th>
        </tr>
    </table>
</div>

<footer class="footer footer-black">
    <div class="container">
        <a class="footer-brand" href="#pablo">Material Kit PRO</a>
        <ul class="pull-center">
            <li>
                <a href="#pablo">
                    Blog
                </a>
            </li>
            <li>
                <a href="#pablo">
                    Presentation
                </a>
            </li>
            <li>
                <a href="#pablo">
                    Discover
                </a>
            </li>
            <li>
                <a href="#pablo">
                    Payment
                </a>
            </li>
            <li>
                <a href="#pablo">
                    Contact Us
                </a>
            </li>
        </ul>
        <ul class="social-buttons float-right">
            <li>
                <a href="https://twitter.com/CreativeTim" target="_blank" class="btn btn-just-icon btn-link">
                    <i class="fa fa-twitter"></i>
                </a>
            </li>
            <li>
                <a href="https://www.facebook.com/CreativeTim" target="_blank" class="btn btn-just-icon btn-link">
                    <i class="fa fa-facebook-square"></i>
                </a>
            </li>
            <li>
                <a href="https://www.instagram.com/CreativeTimOfficial" target="_blank" class="btn btn-just-icon btn-link">
                    <i class="fa fa-instagram"></i>
                </a>
            </li>
        </ul>
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