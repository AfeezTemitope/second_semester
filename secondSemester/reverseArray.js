const arr = "semicolon"

function reverseArray(array) {
    let arr = array.split("")
    let reversed = []
    for (let i = arr.length - 1; i >= 0; i--) {
      reversed.push(arr[i]);
    }
    return reversed.join("")
  }
  console.log(reverseArray(arr))