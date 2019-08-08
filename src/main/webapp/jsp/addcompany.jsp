<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>Add New company</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
        <div class="header">


                STOCK MARKET CHARTING  <img src="Images/logo.png" id="logo">
            
            </div>
<div class="navbar">
        <ul class="ul"> 
                <li class="li"><a href="uploadexceladmin.html" class="hyperlink">Import Data</a></li>
                <li class="li"><a href="managecompanies.html" class="hyperlink">Manage Company</a></li>
                <li class="li"><a href="https://www.google.com" class="hyperlink">ManageExchange</a></li>
                <li class="li"><a href="https://www.google.com" class="hyperlink">Update IPO Details</a></li>
                <li class="floatright-list"><a href="https://www.google.com" class="hyperlink">Logout</a></li>
        </ul>
        
</div>
<div class="container-addcompany"> 
<h3 class="addcompany-heading">Add Company</h3>
<div class="addcompany">
    <form>
        <table cellspacing="10px" width="60%">
            <tr>
             <td ><label for="company_name">Company Name</label></td>
            
             <td ><input type="text" id="company_name" name="company_name"></td>
            </tr>
            <tr>
            <td ><label for="ceo">CEO & Board Of Directors</label></td>
            <td><input type="text" name="ceo" id="ceo"></td>
           </tr>
           <tr>
            <td ><labe for="turnover">Turn Over</labe></td>
            <td><input type="text" name="turnover" id="turnover"></td>
           </tr>
           <tr>
            <td ><labe for="brief">Brief Description</labe></td>
            <td><input type="text" name="brief" id="brief"></td>
           
          </tr>
          <tr>
                <td ><labe for="date">IPO Date</labe></td>
                <td><input type="date" name="date" id="date"></td>
               
              </tr>
        </table>
    </form>
</div>
<div class="savebutton">
        <input type="button" value="save" name="ok" width="30px" class="buttonconfirm">
        </div>  
    </div>
    
    
</body>
</html>