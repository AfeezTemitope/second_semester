const multiplesOfArray = (arr) => {
    const result = new Array(arr.length);
    for (let i = 0; i < arr.length; i++) {
      result[i] = arr[i] * 2;
    }
    return result;
  }
  module.exports = multiplesOfArray;
  