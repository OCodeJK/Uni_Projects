document.getElementById("reservation-form").addEventListener("submit", function(event) {
    const creditCardInput = document.getElementById("credit-card").value;

    if (!validateCreditCard(creditCardInput)) {
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