<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
  <title>Proyecto</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/index.js"></script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     
   
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#sobre">SOBRE NOSOTROS</a></li>
         <li><a href="#productos">DESTACADOS</a></li>
        <li><a href="#online">COMPRA</a></li>
        <li><a href="#contacto">CONTACTA</a></li>
         <li><a href="#donde">DONDE ESTAMOS</a></li>
        <li><a href="login.jsp">LOG IN</a></li>
       
        
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron text-center">
  <h1>ClothShoes</h1> 
  <p>Tu armario Online</p> 
  <form>
    <div class="input-group">
      <input type="email" class="form-control" size="50" placeholder="Suscribete" required>
      <div class="input-group-btn">
        <button type="button" class="btn btn-danger">Enviar</button>
      </div>
    </div>
  </form>
</div>

<!-- Sobre -->
<div id="sobre" class="container-fluid">
  <div class="row">
    <div class="col-sm-8">
      <h2>Sobre@</h2><br>
      <h4>ClothShoes es una tienda online dedidacada a todo aquel que quiera ir a la ultima sin dejarse la cartera de por medio. Ofrecemos ropa de calidad fabricada en España a los mejores precios.</h4><br>      
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-signal logo"></span>
    </div>
  </div>
</div>

<div class="container-fluid bg-grey">
  <div class="row">
    
<!-- Contenido -->
<div id="productos" class="container-fluid text-center bg-grey">
  <h2>Destacados</h2><br>
  <div class="row text-center slideanim">
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="img/modelo1.jpg" alt="Paris" width="400" height="30">
        <p><strong>159&#8364</strong></p>
        <p>Falda azul marcax</p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="img/modelo2.jpg" alt="New York" width="400" height="300">
        <p><strong>59&#8364</strong></p>
        <p>Cazadora ante marcax</p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="img/modelo3.jpg" alt="San Francisco" width="400" height="300">
        <p><strong>75&#8364</strong></p>
        <p>Camiseta manga larga marcax</p>
      </div>
    </div>
  </div><br>
  
  <h2>Lo que opinan nuestros clientes:</h2>
  <div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <h4>"Volvere a comprar aquí­!!!!!"<br><span>Javier Martin Marin</span></h4>
      </div>
      <div class="item">
        <h4>"Buena tienda, calidad precio inmejorable"<br><span>Pilar Tapia Alonso</span></h4>
      </div>
      <div class="item">
        <h4>"WOW!!!!!!"<br><span>Jose Maria Cruz</span></h4>
      </div>
    </div>

    
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Anterior</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Siguiente</span>
    </a>
  </div>
</div>


<!-- T.online -->
<div id="online" class="container-fluid">
  <div class="text-center">
    <h2>Tienda Online</h2>
  </div>
  <div class="row slideanim">
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-heading">
          <h1>Falda</h1>
        </div>
        <div class="panel-body">
          <img src="img/modelo1.jpg" alt="Paris" width="320" height="300"><img/>
        </div>
        <div class="panel-footer">
          <h3>19</h3>
          <h4>Marcax</h4>
          <button class="btn btn-lg">Comprar</button>
        </div>
      </div>      
    </div>     
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-heading">
          <h1>Camiseta</h1>
        </div>
        <div class="panel-body">
           <img src="img/modelo1.jpg" alt="Paris" width="320" height="300"><img/>
        </div>
        <div class="panel-footer">
          <h3>29</h3>
          <h4>Marcax</h4>
          <button class="btn btn-lg">Comprar</button>
        </div>
      </div>      
    </div>       
    <div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center">
        <div class="panel-heading">
          <h1>Bolso</h1>
        </div>
        <div class="panel-body">
          <img src="img/modelo1.jpg" alt="Paris" width="320" height="300"><img/>
        </div>
        <div class="panel-footer">
          <h3>49</h3>
          <h4>Marcax</h4>
          <button class="btn btn-lg">Comprar</button>
        </div>
      </div>      
    </div>    
  </div>
</div>



<!--Area Contacto -->
<div id="contacto" class="container-fluid bg-grey">
  <h2 class="text-center">CONTACTO</h2>
  <div class="row">
    <div class="col-sm-5">
      <p>Contacta con nosotros, las 24 horas del dia</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Salamanca, España</p>
      <p><span class="glyphicon glyphicon-phone"></span> 616185417</p>
      <p><span class="glyphicon glyphicon-envelope"></span> josecruzigle@mail.com</p>
    </div>
    <form action="ServletRegistroUsuarios" method="post"> 
    <div class="col-sm-7 slideanim">
      <div class="row">
        <div class="col-sm-6 form-group">   
          <input class="form-control" id="name" name="campoNombre" placeholder="Nombre" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="campoEmail" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="campoComentario" placeholder="Comentario" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Enviar</button>
        </div>
      </div>
  </form>
  </div>
</div>
 
<!-- Maps -->
<div id="donde" ></div>
<div id="googleMap" style="height:400px;width:100%;"></div>
<script>
function myMap() {
var myCenter = new google.maps.LatLng(40.9652457, -5.6618177,17);
var mapProp = {center:myCenter, zoom:12, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};
var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);
var marker = new google.maps.Marker({position:myCenter});
marker.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key= AIzaSyAN3PFguF6C_Np7AdcCjXwCOThMOA6pmOA&callback=myMap"></script>


<footer class="container-fluid text-center">
  <a href="#myPage" title="To Top">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a>
  
</footer>



</body>
</html>
  