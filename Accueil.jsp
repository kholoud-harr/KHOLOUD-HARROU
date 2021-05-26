<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Création d&#39;un design étape par étape - Etape n°1 : Le code xhtml</title>
<style>
ul {
 padding:0;
 margin:0;
 list-style-type:none;
 }
li {
 float:left; /*pour IE*/
 border-left:1px solid black;
 }
ul li a {
 display:block;
 float:left;   
 width:100px;
 line-height:50px; /*hauteur de l'image de fond*/
 background:black url(images/noir-1.png) repeat-x;
 color:#DCDCDC;
 text-decoration:none;
 text-align:center;
 }
ul li a:hover {
 background:black url(images/noir-2.png) repeat-x;
 color:white;
 }  
</style>
  </head>
  
  <body>
  <div id="conteneur">    
    <h1 id="header"><a href="#" title="Colored Design - Accueil"><span>Colored Design</span></a></h1>

    <nav>
     <ul>
 <li><a href="#">Item 1</a></li>
 <li><a href="#">Item 2</a></li>
 <li><a href="#">Item plus long</a></li>
</ul>
    </nav>
    
   
  </div>
 

</body>
</html>