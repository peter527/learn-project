<#macro layout>
<!doctype html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Example</title>
        <link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="/one/">One</a></li>
                        <li><a href="/two/">Two</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h1>Example</h1>
            <#nested>
        </div>
        <script src="/webjars/jquery/1.11.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
</#macro>