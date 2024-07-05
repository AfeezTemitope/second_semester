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
  


  module.exports = removeDuplicates