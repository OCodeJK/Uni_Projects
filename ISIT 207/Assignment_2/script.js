document.getElementById("reservationForm").addEventListener("submit", function(event) {
    const creditCardInput = document.getElementById("creditCard").value;

    if (!validateCreditCard(creditCardInput)) {
        alert("Please enter a valid credit card number.");
        event.preventDefault(); // Prevent form submission
    }
});

function validateCreditCard(cardNumber) {
    // Basic validation for a 16-digit credit card number
    const regex = /^[0-9]{16}$/;
    return regex.test(cardNumber);
}