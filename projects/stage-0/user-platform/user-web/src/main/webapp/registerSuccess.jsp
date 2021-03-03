<head>
    <jsp:directive.include
            file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
    <title>My Home Page</title>
</head>
<body>
<%
    String   s   =(String)request.getAttribute( "name");
%>
<div class="container-lg">
    <!-- Content here -->
    Hello,<%=s%> registerSuccess!
</div>
</body>