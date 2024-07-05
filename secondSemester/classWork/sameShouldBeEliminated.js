function removeDuplicates(arr) {
    const result = [];
    for (let i = 0; i < arr.length; i++) {
      if (!result.includes(arr[i])) {
        result.push(arr[i]);
      }
    }
    return result;
  }


  function removeDuplicate(arr) {
    const set = new Set();
    const result = [];
    for (let i = 0; i < arr.length; i++) {
      if (!set.has(arr[i])) {
        set.add(arr[i]);
        result.push(arr[i]);
      }
    }
    return result;
  }

  function removeDuplicatesBeginner(arr) {
    const concatenatedArray = arr.concat(); 
    return concatenatedArray.filter((item, pos) => concatenatedArray.indexOf(item) === pos);
}

function removeDuplicatesPro(arr) {
  return arr.filter((obj, index, self) => {
      return index === self.findIndex((otherObj) => obj.className === otherObj.className);
  });
}


  


  module.exports = removeDuplicates