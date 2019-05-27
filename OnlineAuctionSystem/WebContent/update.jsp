<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<%@page import="com.oop.model.Payment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.oop.service.impl.PaymentServiceImpl"%>
<%@page import="com.oop.service.PaymentService"%>

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

.previous {
    background-color: #ffffff;
    color: rgb(0, 0, 0);
}

.next {
    background-color: none;
    color: black;
    float: right;
       border: none;
   outline:none;
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

/*.des{
    height: auto;
    width: auto;
    border-collapse: collapse;
    border: 2px solid rgb(63, 63, 63);
    padding: 1px;
	font-family: Trebuchet MS;
	color: white;
	background-color: black;
	opacity: 0.8;

}*/

span {
    background-color: black;
	padding: 5px;
}

#nextprev {
	background-color: white;
	border: 1px solid black;
}
  
 
 .form{
  margin:150px;
  
  padding: 50px;
  font-family:arial;
  background-image: url('img/beautiful-blue-blur.jpg');
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  
  

  
  
  

}

  
legend{
        font-style:normal;
        font-size:3.5em;
        color:black;
        }

        

   
input{
        width:450px;
        height:30px;
        border-style: none;
        background:rgb(184, 184, 184);
        
        

        
    }

  
  .in1{

    width:150px;
    height:30px;
    box-align: center;

    
    
  }
  #op1{
       width:450px;
        height:30px;
        border-style: none;
        background:rgb(184, 184, 184);
        color:black;
        

  }
 .p1{
  color:black;
  font-style:Normal;
  font-size:15px;

 }

 .payM input{
        width:250px;
        height:20px;
        background: white;
        margin-left: 50px;
        font-size:20px;
        
    }

    .payM label{
      
      position: absolute;
      left:630px;
      top:1185px;
    }

   
   
submit{
 hover:black;

}


 
 


 
   


 </style>
 
 </head>





  
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
                    <a href="#pablo" class="nav-link">Login</a>
                  </li>
                  <li class="nav-item">
                    <a href="#pablo" class="nav-link">Register</a>
                  </li>
                   <li class="nav-item">
                    <a href="#pablo" class="nav-link">CustomerCare</a>
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


    <body>
          
             <form method="Post" action="UpdatePaymentServlet">
          <div class="form">
        
              <fieldset > 
                  <legend >Billing Information:</legend><br>
                        </fieldset>  
             
              <fieldset>          
              <pre class="p1">
              				
              				<%
							PaymentService detl = new PaymentServiceImpl();
							int s1 = (Integer)request.getAttribute("getCID");
							int pid = s1;
							ArrayList<Payment> list = detl.searchCID(pid);

							%>

       
        <%
                 for(Payment pem : list){
        %>
                    
                 
                                                 
                              *First name:           <input type="text" placeholder="<%=pem.getFirstName() %>" name="firstname"  ><br><br>
                              *Last name:            <input type="text" placeholder="<%=pem.getLastName() %>" name="lastname"><br><br>
                              *Address :             <input type="text" placeholder="<%=pem.getAddress() %>" name="address" ><br><br>
                              *Email:                <input type="text" placeholder="<%=pem.getEmail() %>" name="email"  > <br><br>  
                              *City:                 <input type="text" placeholder="<%=pem.getCity() %>" class="in1" name="city" >   *State:  <input type="text" class="in1" placeholder="<%=pem.getState() %>" name="state"><br><br>
                              
                              *Country:              <select name="Country" placeholder="<%=pem.getCountry() %>" id="op1">
                                                <option value="United States of America">United States America</option>
                                                <option value="SriLanka">SriLanka</option>
                                                <option value="india">India</option>
                                                <option value="Australia">Australia</option>
                                                <option value="Japan">Japan</option> 
                                                
                                        </select> 
                                        
                                   
                 
                              *Postal code:          <input type="text" placeholder="<%=pem.getPostalCode() %>" name="postalcode" ><br><br>

                              *Contact number:       <input type="text" placeholder="<%=pem.getContactNumber() %>" name="contactnumber" ><br><br> 


                              Fax:                   <input type="text" placeholder="<%=pem.getFax() %>" name="fax" ><br><br></pre>
                                       
                              <pre class="payM"> 
                                         
                                                                 
                              Payment Method:        <!--   <input id="op1" type="text" name="card" value=""> --></br><br><br>
                              
                              
                              
                              
                                                       <label for="card-radio"> <img src="img/Payment/card.png" style="width:128px;height:128px; position: absolute; top:200px; left:150px; "></label><br><br>
                                                       
                                                       
                                                       <input id="op1" type="text" placeholder="<%=pem.getFirstName() %>" name="card" value="paypal" checked></br>
                                                       <label for="card-radio"><img src="img/Payment/paypal1.jpg" style="width:135px;height:128px; position: absolute; top:350px; left:150px;" ></label>   
                                                      
                                                    	<input type="hidden" value="<%=pem.getPaymentId() %>" name="paymentId"  >
                                                       <input type="submit" value="Confirm and Pay"  style="position: absolute; top:1780px; left:950px; width:200px; height: 40px;background: rgb(19, 19, 66); color:white;font-size:15px;">
                                                       <input type="submit" value="Cancel"  style="position: absolute; top:1780px; left:710px; width:200px; height: 40px;background: rgb(19, 19, 66); color:white;font-size:15px;"> 
                                                       
                          </pre>
                            </div>
                           
                          </fieldset>
                          
                             
                    
              
              
            <%} %>
          
          
           
          </form>
          
          
           <footer class="footer footer-black">
            <div class="container">
              <a class="footer-brand" href="#pablo"> </a>
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



          
