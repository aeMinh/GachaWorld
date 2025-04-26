<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.gachaworld.gachaworld.model.Product" %>
<html>
<head>
    <title>GachaWorld - Products</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>

<%
    List<Product> products = (List<Product>) request.getAttribute("products");
    if (products == null) {
%>
<p style="color: red;"> Không tìm thấy danh sách sản phẩm! (products = null)</p>
<%
} else if (products.isEmpty()) {
%>
<p style="color: orange;"> Danh sách sản phẩm trống! (products = empty list)</p>
<%
} else {
    for (Product p : products) {
%>
<div style="margin-bottom: 20px;">
    <h3><%= p.getName() %></h3>
    <p>Mô tả: <%= p.getDescription() %></p>
    <p>Giá: <%= p.getPrice() %> USD</p>
    <p>Số lượng còn: <%= p.getStock() %></p>
    <hr>
</div>
<%
        }
    }
%>


</body>
</html>
