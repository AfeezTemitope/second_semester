class Stack {
    constructor() {
      this.items = [];
    }
  
    pushIt(item) {
      this.items.push(item);
    }
  
    pop() {
      return this.items.pop();
    }
  
    peek() {
      return this.items[0]
    }
  
    isEmpty() {
      return this.items.length === 0
    }
    
  }

//   Array.prototype.push = function(...items) {
//     for (let item of items) {
//       this[this.length] = item;
//     }
//     return this.length;
//   };
  


  module.exports = Stack