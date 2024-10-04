function hamburger() {
    var links = document.getElementById("links");
    var hamburger = document.getElementById("hamburger_icon");
    var cross = document.getElementById("cross_icon");

    if (links.style.display === "block") {
        links.style.display = "none";
    }
    else {
        links.style.display = "block";
        hamburger.style.display = "none";
        cross.style.display = "block";
    }
}
function cross() {
    var links = document.getElementById("links");
    var hamburger = document.getElementById("hamburger_icon");
    var cross = document.getElementById("cross_icon");

    if (cross.style.display === "block") {
        cross.style.display = "none";
        hamburger.style.display = "block";
        links.style.display = "none";
    }
}

//Login form retriever
document.getElementById("login_form").addEventListener("submit", function (event) {
    event.preventDefault();

    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username && password) {
        alert("Login Successful!");
        window.location.assign("reservation.html");
    } else {
        alert("Error, try again");
    }
});

//Reservation form retriever
document.getElementById("reservation_form").addEventListener("submit", function (event) {

    event.preventDefault();
    const creditCard = document.getElementById("credit_card").value;

    if (!validateCreditCard(creditCard)) {
        alert("Please enter a valid credit card number.");
        event.preventDefault(); // Prevent form submission
    }
    else {
        alert("Thank you for reserving with us!");
    }

});





function validateCreditCard(cardNumber) {
    // Basic validation for a 16-digit credit card number
    const regex = /^[0-9]{16}$/;
    return regex.test(cardNumber);
}
