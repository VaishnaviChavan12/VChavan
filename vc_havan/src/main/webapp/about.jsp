<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="include/header.jsp"><c:param name="title" value="List Users"/></c:import>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <style>


.team-member {
    text-align: center;
    margin: 20px;
}

.team-member img {
    border-radius: 50%;
    height: 200px;
    width: 200px;

}
    </style>
</head>
<body>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
    <section id="introduction">
        <h2>Our Story</h2>
        <p>Welcome to our beautiful journey...</p>
    </section>

    <section id="team">
        <h2>Meet the Team</h2>
        <div class="team-member">
            <img src="Images/owner.jpg" alt="Vaishnavi Chavan">
            <h3>Vaishnavi Chavan</h3>
            <p>Founder and CEO</p>
        </div>

    </section>

    <section id="mission">
        <h2>Our Mission</h2>
        <p>At our company, we strive for beauty in every aspect...</p>
    </section>

    <section id="contact">
        <h2>Contact Us</h2>
        <p>If you have any questions or inquiries, feel free to contact us:</p>
        <address>
            <strong>Email: </strong><a href="mailto:vaishnavi.sc.2001@example.com">vaishnavi.sc.2001@example.com</a><br>
            <strong>Phone: </strong>+91 906759****<br>
            <strong>Address: </strong>N-24 At.On world City.Free Minded Country.Happiness Overload<br>
            <strong>LinkID IN:</strong> https://www.linkedin.com/in/chavan-vaishnavi/
        </address>
    </section>
    </main>
    </div>
	</div>
</div>

<c:import url="include/footer.jsp"></c:import>
