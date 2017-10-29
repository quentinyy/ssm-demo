<%--
  Created by IntelliJ IDEA.
  User: 17734
  Date: 2017/10/28
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</head>
<script>
    $(document).ready(function(){
        var params = '{"id":1,"name":"lishi"}';
        $.ajax({
            url: '${pageContext.request.contextPath}/findBy.action',
            type:'POST',
            data:params,
            contentType :'application/json',
            dataType:'json',
            success: function(data){
                alert(data.id+"-"+data.name);
            }});
    });

</script>
<body>
    <%--<form action="/pic.action" method="post" enctype="multipart/form-data">--%>
        <%--<input type="file" name="pic">--%>
        <%--<input type="submit" value="提交">--%>
    <%--</form>--%>
</body>
</html>
