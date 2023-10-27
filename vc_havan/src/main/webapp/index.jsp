<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<style>
img {
    height: 289px;
    width: 175px;
}
</style>
</head>
<c:import url="include/header.jsp"><c:param name="title" value="Home Page"/></c:import>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">

    <main>
        <section id="welcome">
            <h2>Welcome to VC Groups</h2>
            <p>We are a prominent player in our industry and have been for a considerable period, mentioning our establishment year. We also highlight our mission and key achievements, giving our visitors a glimpse of our journey. Importantly, we emphasize our unique selling points, show casing what sets us apart in the market. </p>
<br><br>
        <section id="featured-products">
            <h2>Featured Services</h2>
            <br>
            <div class="product">
                <img src="Images/develop.jpg" alt="Service 1" style="height:289 px,width:175 px">
                <h3>Develops</h3>              
            </div>
            <br><br>
            <div class="product">
                <img src="Images/automate.png" alt="Service 2">
                <h3>Automate</h3>
            </div>
            <br><br>
            <div class="product">
                <img src="Images/maintain.jpg" alt="Service 3">
                <h3>Maintain</h3>
            </div>
        </section>
    </main>
		</div>
	</div>
</div>
<c:import url="include/footer.jsp"></c:import>



