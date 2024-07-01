function validCardNumber(cardNumber) {
    cardNumber = cardNumber.replace(/-/g, "");
    if (cardNumber.length != 16) {
        return false;
    }
    for (let i = 0; i < cardNumber.length; i++) {
        if (isNaN(parseInt(cardNumber[i]))) {
            return false;
        }
    }
    let firstDigit = cardNumber.charAt(0);
    if (firstDigit == '4' || firstDigit == '5' || firstDigit == '6') {
        return true;
    } else {
        return false;
    }
}

let card = "4532-0123-4587-8901";
console.log(validCardNumber(card));
