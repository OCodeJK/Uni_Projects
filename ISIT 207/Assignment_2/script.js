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

//sets up a admin account for testing on startup
// localStorage.setItem('admin_username', "admin");
// localStorage.setItem('admin_password', "admin123");

//sets up a user account for testing on startup
localStorage.setItem('username', "Bob");
localStorage.setItem('password', '123');

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
    try {
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
    } catch (TypeError){
        return true;
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
reservation = document.getElementById("reservation_form");
reservation && reservation.addEventListener("submit", function (event) {
    
    event.preventDefault();
    const creditCard = document.getElementById("credit_card").value;
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    //TODO rental period using data format

    const carModel = document.getElementById("car_select").value;

    //concatenating every info to put into the txt file receipt
    let receipt = "AZoom Car Rental Receipt" //title
    + "\n\n" + "Credit-Card: ************" + creditCard.substr(creditCard.length - 4) + "\n" //Credit card info
    + "Name: " + name + "\n" //Name
    + "Email: " + email + "\n" //Email
    + "Duration: " //TODO insert rental period here
    + "Car Model: " + carModel; //Car Model


    function validateCreditCard(cardNumber) {
        // Basic validation for a 16-digit credit card number
        const regex = /^[0-9]{16}$/;
        return regex.test(cardNumber);
    }

    if (!validateCreditCard(creditCard)) {
        alert("Please enter a valid credit card number.");
    }
    else {
        let blobdtMIME = new Blob([receipt], { type: "text/plain" });
        let url = URL.createObjectURL(blobdtMIME);
        let anele = document.createElement("a");
        anele.setAttribute("download", "Reservation_Receipt");
        anele.href= url;
        anele.click();
        console.log(blobdtMIME);
        alert("Thank you for reserving with us!");
    }
});




