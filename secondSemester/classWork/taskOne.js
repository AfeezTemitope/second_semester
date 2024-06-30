const calculateArea = (width, breadth) => {
    if (width < 0 || breadth < 0) {
        return 0;
    }
    return width * breadth;
}
const convertToFarenheit = (celsius)=> {
    return celsius * 9/5 + 32
}

const isEven = (number) => number > 0 && number % 2 === 0;

const leapYear =(year) =>{
    if (year % 4 !== 0) {
        return false;
    } else if (year % 100 !== 0) {
        return true;
    } else if (year % 400 !== 0) {
        return false;
    } else {
        return true;
    }
}

const countVowelSounds = (word) => {
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    let count = 0;
    for (let i = 0; i < word.length; i++) {
    const char = word.toLowerCase()[i];
    if (vowels.includes(char)) {
    count++;
    }
    }
    return count;
    }
    
    

module.exports = {calculateArea, convertToFarenheit, isEven, leapYear, countVowelSounds}

