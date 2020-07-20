<%@ page import="club.banyuan.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="club.banyuan.entity.RecordHistory" %>
<%@ page import="club.banyuan.entity.Commodity" %><%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2020/7/11
  Time: 9:42 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>商品竞价</title>
    <link href="css/common.css" rel="stylesheet" type="text/css"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
</head>

<body>
<div class="wrap">
    <!-- main begin-->
    <div class="sale">
        <h1 class="lf">在线拍卖系统</h1>
        <div class="logout right"><%
            Object object = session.getAttribute("user");
            User user = (User) object;
            if (object != null) {
              %>
            欢迎,<a href="#"><%=user.getUsername()%>
            </a>
            <%}%>
            <a href="#" title="注销">
                ，注销</a></div>
    </div>
<div class="items sg-font lf">
    <%
        Object auction = request.getAttribute("commodity");
        Commodity commodity = (Commodity) auction;%>
    <ul class="rows">
        <li>名称：</li>
        <li class="borderno"><%=commodity.getCommodityName()%></li>
    </ul>
    <ul class="rows">
        <li>描述：</li>
        <li class="borderno"><%=commodity.getDescribe()%></li>
    </ul>
    <ul class="rows">
        <li>开始时间：</li>
        <li class="borderno"><%=commodity.getStartTime()%></li>
    </ul>
    <ul class="rows">
        <li>结束时间：</li>
        <li class="borderno"><%=commodity.getEndTime()%></li>
    </ul>
    <ul class="rows border-no">
        <li>起拍价：</li>
        <li class="borderno"><%=commodity.getInitialPrice()%></li>
    </ul>

</div>
<div class="rg borders"><img src="images/ad20.jpg" width="270" height="185" alt=""/></div>
<div class="cl"></div>
    <div class="top10 salebd">
        <form action="bid.do">
        <p>
            <label for="sale">出价：</label>
            <input type="text" name="auctionPrice" class="inputwd" id="sale" value="4000"/>
            <input type="hidden" name="userId" value="<%=user.getId()%>">
            <input type="hidden" name="comId" value="<%=commodity.getId()%>">
<%--            <%request.setAttribute("userId",user.getId());%>--%>
<%--            <%request.setAttribute("comId",commodity.getId());%>--%>
            <input type="submit" value="竞 拍" class="spbg buttombg f14  sale-buttom"/>
        </p>
        <p class="f14 red">不能低于最高竞拍价</p>
        </form>
    </div>
    <div class="top10">
        <input name="" type="submit" value="刷 新" class="spbg buttombg f14"/>
        <input name="" type="submit" value="返回列表" class="spbg buttombg f14"/>
    </div>
    <div class="offer">
<%--        <form action="">--%>
        <h3>出价记录</h3>
        <div class="items sg-font">
            <ul class="rows even strong">
                <li>竞拍时间</li>
                <li>竞拍价格</li>
                <li class="borderno">竞拍人</li>
            </ul>
            <%
                Object object1 = request.getAttribute("recordHistoryList");
                List<RecordHistory> recordHistoryList = (List<RecordHistory>) object1;
                for (int i = 0; i < recordHistoryList.size(); i++) {
                    if (i % 2 != 0) {%>
            <ul class="rows even">
                    <%}else{%>
                <ul class="rows">
                    <%}%>
                    <li><%=recordHistoryList.get(i).getAuctionTime()%></li>
                    <li><%=recordHistoryList.get(i).getAuctionPrice()%>
                    </li>
                    <li class="borderno"><%=user.getUsername()%>
                    </li>
                </ul>
                    <%}%>
<%--            </form>--%>
        </div>
    </div>
    <!-- main end-->
    </div>
</body>
</html>

