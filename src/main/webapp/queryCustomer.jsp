<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#btn").click(function(){
                $.ajax({
                    url:"customer/queryCustomer.do",
                    success:function(resp){
                        $("#info").html("");
                        $.each(resp,function(i,n){
                            $("#info").append("<tr>")
                            .append("<td>"+n.id+"</tr>")
                            .append("<td>"+n.name+"</tr>")
                            .append("<td>"+n.age+"<td>")
                            .append("</tr>")
                        })
                    }
                })
            })
        })
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
            <tr>
                <td>编号:</td>
                <td>姓名:</td>
                <td>年龄:</td>
            </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
        <input type="button" value="发起Ajax请求" id="btn" />
    </div>
</body>
</html>
