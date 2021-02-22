<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
  <head>
  <style>  
.error{color:red}  
</style> 
  </head>
  <body>
        <h1>Add New User</h1>  
       <form:form action="add" method="post" modelAttribute="u" >    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td> 
          <td><form:errors path="name" cssClass="error"/></td> 
         </tr>    
         <tr>    
          <td>Phone No :</td>    
          <td><form:input path="phoneno" /></td> 
          <td><form:errors path="phoneno" cssClass="error"/></td>  
         </tr>   
         <tr>    
          <td>User Id :</td>    
          <td><form:input path="userid" /></td> 
          <td><form:errors path="userid" cssClass="error"/></td> 
         </tr> 
         <tr>    
          <td>Email Id :</td>    
          <td><form:input path="emailid" /></td>  
          <td><form:errors path="emailid" cssClass="error"/></td> 
         </tr> 
         <tr>    
          <td>City :</td>    
          <td><form:input path="city" /></td>  
         </tr> 
         <tr>    
          <td>State :</td>    
          <td><form:input path="state" /></td>  
         </tr>
         <tr>    
          <td>Landmark :</td>    
          <td><form:input path="landmark" /></td>  
         </tr>
         <tr>    
          <td>Pincode :</td>    
          <td><form:input path="pincode" /></td>  
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>
       </body>