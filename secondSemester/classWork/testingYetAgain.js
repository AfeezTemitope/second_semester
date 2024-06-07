// function countOccurrences(numbers) {
//     const occurrences = {};
//     for (const num of numbers) {
//       if (num in occurrences) {
//         occurrences[num] += 1;
//       } else {
//         occurrences[num] = 1;
//       }
//     }
//     return occurrences;
//   }
  function countOccurrences(numbers) {
    const occurrences = {};
    for (let i = 0; i < numbers.length; i++) {
      const num = numbers[i];
      if (num in occurrences) {
        occurrences[num] += 1;
      } else {
        occurrences[num] = 1;
      }  
    }
    return occurrences;
  }
//   console.log(countOccurrences([2,4,5,6,4,3,4,2]))

  module.exports = {countOccurrences}


  