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

//sets up a admin account on startup
localStorage.setItem('admin_username', "admin");
localStorage.setItem('admin_password', "admin123");

//Register-form retriever
function registerUser() {
    var user_register = document.getElementById("register_username").value;
    var pass_register = document.getElementById("register_password").value;

    register = document.getElementById("register_form");
    register.addEventListener("click", function (event){
        event.preventDefault();

        if (localStorage.getItem('username') == user_register){
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
    login.addEventListener("submit", function (event) {
        event.preventDefault();

        //Register form user credentials in Local Storage
        var storedUsername = localStorage.username;
        var storedPassword = localStorage.password;

        //Retrieve the already made admin account in Local Storage
        var storedadminUser = localStorage.admin_username;
        var storedadminPass = localStorage.admin_password;
        
        //get the DOM attribute username and password from login form
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;

        //Authentication
        if (username == storedUsername || password == storedPassword) {
            alert("Login Successful!");
            window.location.assign("index.html");

        } else if (username == storedadminUser && password == storedadminPass){
            alert("Welcome back Employee!");
            window.location.assign("index.html");

        } else {
            alert("Incorrect credentials.");
        }
    });
}

//Permanent login for now because admin_username is in localStorage on start up
function checkLoginStatus(){
    //check if the key "username" is in localStorage
    if ("username" in localStorage) {
        const loginBtn = document.getElementById("loginBtn");
        const signupBtn = document.getElementById("signupBtn");
        const logoutBtn = document.getElementById("logoutBtn");
        const reservationBtn = document.getElementById("reservationBtn");
        const returningBtn = document.getElementById("returningBtn");

        loginBtn.classList.add("hidden");
        signupBtn.classList.add("hidden");

        logoutBtn.classList.remove("hidden");
        reservationBtn.classList.remove("hidden");
        returningBtn.classList.remove("hidden");

    } else if ("admin_username" in localStorage) {
        const loginBtn = document.getElementById("loginBtn");
        const signupBtn = document.getElementById("signupBtn");
        const logoutBtn = document.getElementById("logoutBtn");
        const reservationBtn = document.getElementById("reservationBtn");
        const returningBtn = document.getElementById("returningBtn");
        const fileReportBtn = document.getElementById("fileReportBtn");

        loginBtn.classList.add("hidden");
        signupBtn.classList.add("hidden");

        logoutBtn.classList.remove("hidden");
        reservationBtn.classList.remove("hidden");
        returningBtn.classList.remove("hidden");
        fileReportBtn.classList.remove("hidden");
    }
}

checkLoginStatus();

function logOut(){
    //check if the "username" key is in localStorage
    if ("username" in localStorage){
        localStorage.removeItem("username");
        localStorage.removeItem("password");
        alert("Logging out...");
        window.location.assign('index.html');
    }
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
