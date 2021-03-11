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
        <h3>Add New User</h3>  
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
          <td><input type="submit" name="save" value="Save" /></td>    
         </tr>    
        </table> 
        
          </form:form> 
          <h3>Delete User</h3> 
        <table>
        
        <form:form method="post" action="delete" modelAttribute="d">
		<tr><td><form:input path="userid" /></td>
		<td><form:errors path="userid" cssClass="error"/></td> 
		   
		<td ><input type="submit" name="dt" value="Delete" /></td>
		</form:form>
		    
        </table>
        
        <table>
        <br>
        
        <form:form method="post" action="listdata">
		<tr><td ><h3>List user data</h3> </td><td><input type="submit" name="lu" value="List Users" /></td></tr>
		</form:form><br>
		  <tr><td><h4>Below are the existing user data</h4></td></tr>   
        </table>
        <c:if test="${not empty lists}">
        <table border=1>
        <tr><td>User Id</td><td>Name</td><td>Phone No</td><td>Email Id</td>
        <td>City</td><td>State</td><td>Landmark</td><td>PinCode</td></tr>
            <c:forEach var="listValue" items="${lists}">
            <tr>
                <td>${listValue.userid}</td>
                <td>${listValue.name}</td>
                <td>${listValue.phoneno}</td>
                <td>${listValue.emailid}</td>
                <td>${listValue.city}</td>
                <td>${listValue.state}</td>
                <td>${listValue.landmark}</td>
                <td>${listValue.pincode}</td>
            </tr>
            </c:forEach>
        </table>
        </c:if>
           
      
       </body>