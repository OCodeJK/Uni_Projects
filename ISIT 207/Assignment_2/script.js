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

localStorage.setItem('username', "admin");
localStorage.setItem('password', "admin123");

//Register-form retriever
function registerUser() {
    var user_register = document.getElementById("register_username").value;
    var pass_register = document.getElementById("register_password").value;

    register = document.getElementById("register_form");
    register.addEventListener("click", function (event){
        event.preventDefault();

        if (localStorage.getItem('username')){
            alert("Username already exists");
            register.reset(); //reset register form
        } else {
            localStorage.setItem('username', user_register);
            localStorage.setItem('password', pass_register);

            window.location.assign('reservation.html');
        }
    });
    
}

//Login-form retriever
function commenceLogin() {
    login = document.getElementById("login_form");
    login.addEventListener("click", function (event) {
        event.preventDefault();

        //Register form user credentials in Local Storage
        var storedUsername = localStorage.getItem('username');
        var storedPassword = localStorage.getItem('password');

        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;

        if (username == storedUsername || password == storedPassword) {
            alert("Login Successful!");
            window.location.assign("reservation.html");
        } else {
            alert('Incorrect credentials.');
        }
    });
}

function logOut(){
    localStorage.clear();
    alert("Logging out...")
    window.location.assign('index.html');
}


//Reservation-form retriever
reservation = document.getElementById("reseveration_form");
reservation && reservation.addEventListener("click", function (event) {
    
    event.preventDefault();
    const creditCard = document.getElementById("credit_card").value;

    if (!validateCreditCard(creditCard)) {
        alert("Please enter a valid credit card number.");
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
