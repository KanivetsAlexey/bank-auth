<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Open an account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/open_account.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</head>

<body>
<div class="page-wrapper">
    <header class="head">
        <div class="logo-wrapper">
            <a href="#" class="logo-link">
                <img src="../resources/img/logo.svg" alt="" class="logo">
            </a>
        </div>

        <div class="header-links pull-right">
            <a id="Find_a_Banking_Center_2017mOAA2RS" href="http://locators.bankofamerica.com/locator/locator/LocatorAction.do" target="_blank" data-bactmln="Find_a_Banking_Center_2017mOAA2RS_Desktop">Find a financial center <span>»</span></a>
            <a id="CSR_2017mOAA2RS" data-dart-cat="2015_011" href="http://about.bankofamerica.com/en-us/global-impact/csr-report.html" target="_blank" data-bactmln="CSR_2017mOAA2RS_Desktop">Our corporate social responsibility <span>»</span></a>
        </div>
    </header>

    <div class="row inform-block">
        <div class="col-md-9">
            <h1>Open an account that fits your needs</h1>
            <p>From setting up a checking or savings account to finding the right home loan, Bank of America can help. And for your investment needs, Merrill Edge<sup>®</sup> offers online tools and resources to help you take control of your finances.</p>
        </div>
        <div class="col-md-3">
            <div class="more-information pull-right">
                <p>For more information,
                    <br>roll over the tiles below</p>
            </div>
        </div>
    </div>

    <main class="main">
        <div class="cards">
            <div class="card"><img src="../resources/img/card-1.png" alt="">
                <div class="inform">
                    <h4>Home Loans</h4>
                    <p>Browse our wide selection and apply for a card with the features you want.</p>
                    <a href="${contextPath}/registration" class="start-link">Get started</a></div>
            </div>
            <div class="card"><img src="../resources/img/card2.png" alt="">
                <div class="inform">
                    <h4>Home Loans</h4>
                    <p>Browse our wide selection and apply for a card with the features you want.</p>
                    <a href="${contextPath}/registration" class="start-link">Get started</a></div>
            </div>
            <div class="card"><img src="../resources/img/card3.png" alt="">
                <div class="inform">
                    <h4>Home Loans</h4>
                    <p>Browse our wide selection and apply for a card with the features you want.</p>
                    <a href="${contextPath}/registration" class="start-link">Get started</a></div>
            </div>
            <div class="card"><img src="../resources/img/card4.png" alt="">
                <div class="inform">
                    <h4>Home Loans</h4>
                    <p>Browse our wide selection and apply for a card with the features you want.</p>
                    <a href="${contextPath}/registration" class="start-link">Get started</a></div>
            </div>
            <div class="card"><img src="../resources/img/card5.png" alt="">
                <div class="inform">
                    <h4>Home Loans</h4>
                    <p>Browse our wide selection and apply for a card with the features you want.</p>
                    <a href="${contextPath}/registration" class="start-link">Get started</a></div>
            </div>
            <div class="card"><img src="../resources/img/card6.png" alt="">
                <div class="inform">
                    <h4>Home Loans</h4>
                    <p>Browse our wide selection and apply for a card with the features you want.</p>
                    <a href="${contextPath}/registration" class="start-link">Get started</a></div>
            </div>
        </div>
    </main>
</div>



<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
