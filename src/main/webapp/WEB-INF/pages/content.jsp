<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        div.main {
            float: left;
            border: black thin;
        }
        nav.logo {
            float: left;
            height: 56px;
            padding: 0;
        }
        nav.logo image {
            height: 100%;
        }
    </style>
</head>
<body>
<nav>
    <a class="logo" href="/"><img src="/image/piaoshuhui.png" alt="logo"></a>
</nav>

<div class="main"  style="width: 20%;color:red;">
    <div class="login" style="height: 30%; background: rgba(153,113,253,0.12)">
        <h1>这是登录窗口</h1>
    </div>
    <h1> headline one</h1>
</div>
<div class="main" style="width: 40%;color:dodgerblue;">
    <h1> headline two</h1>
</div>
<div class="main" style="width: 40%;color:yellow;">
    <h1> headline three</h1>
</div>
</body>
</html>