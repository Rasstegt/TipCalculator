<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tip Calculator</title>
<link rel="stylesheet" type="text/css" href="">
</head>
<body>
<h1>Tip Calculator</h1>
<form action="Calculator">
	Bill Amount: $<br/>
<input type="number" name="inputAmount" min="0">
<table>
    <tr>
        <th>
        <p>Select a Tip%:</p>
        </th>
        <th>
            <select name="options">
                <option value="0">None</option>
                <option value="5">5%</option>
                <option value="10">10%</option>
                <option value="15">15%</option>
                <option value="20">20%</option>
                <option value="25">25%</option>
            </select>
        </th>
    </tr>
</table>
<input type="submit" value="Calculate"> 
</form>
</body>
</html>