<style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
      #floating-panel {
        position: absolute;
        top: 10px;
        left: 25%;
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
        text-align: center;
        font-family: 'Roboto','sans-serif';
        line-height: 30px;
        padding-left: 10px;
      }
    </style>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.*"%> 
<%@page import="java.util.*"%> 
<%@page import="javax.servlet.ServletResponse"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String id_solicitud_inspeccion = request.getParameter("id_solicitud_inspeccion");
    
java.sql.Connection cnx;//carga el driver
java.sql.Statement sta; //conectarse
java.sql.Statement sta2;
java.sql.Statement sta3;
java.sql.Statement sta4;
java.sql.Statement sta5;
java.sql.Statement sta6;
java.sql.ResultSet rs; //consuta por general
java.sql.ResultSet rs2;//consulta por usuario
java.sql.ResultSet rs3;// consultar servicio nombre
java.sql.ResultSet rs4;
java.sql.ResultSet rs5;
java.sql.ResultSet rs6;

try{


    Class.forName("org.postgresql.Driver");
    //out.println("Cargo el Drivers");
    
    try {
        cnx=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "postgresql");
    //    out.println("</br>Se conecto");
        sta=cnx.createStatement();
        
        rs=sta.executeQuery("SELECT * FROM solicitud_inspeccion WHERE id_solicitud_inspeccion='"+id_solicitud_inspeccion+"'");
        
      if(rs.next())
      {
        //out.println("</br>existe el id</br>");
          String Lat= rs.getString(6);
          String Long= rs.getString(7);
          String Cardinales= ""+Lat+" "+Long+"";
           //response.sendRedirect("frmininiciar.jsp?error=1");
               //out.println(Cardinales);
               %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <ui:composition template="../META-INF/include/template.xhtml">
        
<ui:define name="head">
        <title>Sistema de Bomberos</title>
        <!-- Custom styles for this template -->
<h:outputStylesheet name="../resources/css/starter-template.css"/>

</ui:define>
    <ui:define name="body">

<div id="floating-panel">
    <b> </b>
    <select id="mode">
      <option value="DRIVING">Carro</option>
      <option value="WALKING">Caminando</option>
    </select>
    </div>
    <div id="map"></div>
    <script>
      function initMap() {
        var directionsDisplay = new google.maps.DirectionsRenderer;
        var directionsService = new google.maps.DirectionsService;
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 14,
          center: {lat: -1.3480719, lng: -78.6729348}
        });
        directionsDisplay.setMap(map);

        calculateAndDisplayRoute(directionsService, directionsDisplay);
        document.getElementById('mode').addEventListener('change', function() {
          calculateAndDisplayRoute(directionsService, directionsDisplay);
        });
      }

      function calculateAndDisplayRoute(directionsService, directionsDisplay) {
        var selectedMode = document.getElementById('mode').value;
        directionsService.route({
          origin: {lat:-1.3495887, lng:-78.6676669},  // Haight.-1.3495887  -78.6676669
          destination: {lat:<%=Lat%>, lng:<%=Long%>},
      
          // Note that Javascript allows us to access the constant
          // using square brackets and a string value as its
          // "property."
          travelMode: google.maps.TravelMode[selectedMode]
        }, function(response, status) {
          if (status == 'OK') {
            directionsDisplay.setDirections(response);
          } else {
            window.alert('Directions request failed due to ' + status);
          }
        });
      }
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDsMoKoFZ-sI1_BEZ5H7B79YCITJT7JyYw&callback=initMap">
    </script>
     
  </body>

   

    </ui:define>
  </ui:composition>

<%
      }
      else
      {
        out.println("</br><h1><p align='center'>No existe el id</p></h1>");  
      }    
}
     catch (SQLException ex) {
       System.out.println("Problemas para conectarse");
    }
}
    
    


catch (ClassNotFoundException ex) {
                
                out.println("Problemas con el Driver");
            }

%>

