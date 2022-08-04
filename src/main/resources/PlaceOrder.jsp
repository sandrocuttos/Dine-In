%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-eqUIv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script type="text/javascript">
        function sample()
        {
            for(var i=0; i < document.form1.frUIt.length; i++)
            {
                if(!document.f.dish[i].checked)
                {
                    alert("Please Select Your favorite tdishs size");
                    return false;
                }
                else
                {
                    alert("Click OK to display your choice");
                    return true;
                }
            }
        }
    </script>
    <title>Demo</title>
</head>
<body>
<form name="f" onsubmit="sample()">
    <h3>Select your favorite dish</h3>
    <p><input type="checkbox" name="dish" value="Sushi"/>S</p>
    <p><input type="checkbox" name="dish" value="Milk tea"/>M</p>
    <p><input type="checkbox" name="dish" value="Large tea"/>L</p&gt
    <p><input type="checkbox" name="dish" value="Coffee"/>XL</p>
    <p><input type="checkbox" name="dish" value="pear"/>XXL</p>
    <p><input type="submit" value="submit"/>
</form>
<%
    String s[]= request.getParameterValues("dish");
    if(s != null)
    {
%>


    <c:forEach var="res" items="${<your array/List>/resList}">
    <tr>
    <td><html:checkbox property="select" value="<some value>"/></td>
    <td>${<your list.element>}</td>
    <td>${res.empName}</td>
    <td>${res.mailID}</td>
    </tr>
    </c:forEach>
%>
</body>
</html>