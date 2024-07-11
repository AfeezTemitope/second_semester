const Stack = require('./Stack')


test('test that stack can add one element', ()=>{
    const stack = new Stack()
    stack.pushIt(2)
    expect(stack.items).toEqual([2] )
})

test('test that stack can add more than one element', ()=>{
    const stack = new Stack()
    stack.pushIt(2)
    stack.pushIt(2)
    stack.pushIt(2)
    stack.pushIt(2)
    expect(stack.items).toEqual([2,2,2,2] )
})

test('test that stack can add more than one element numbers and text', ()=>{
    const stack = new Stack()
    stack.pushIt(2)
    stack.pushIt("bad")
    stack.pushIt(2)
    stack.pushIt("ore")
    expect(stack.items).toEqual([2,"bad",2,"ore"] )
})

test('test that stack can push number to an array of number', ()=>{
    const stack = new Stack()
    stack.items = [2,3,4]
    stack.pushIt(2)
    expect(stack.items).toEqual([2, 3, 4, 2])
})

test('test that stack can push string to an array of number', ()=>{
    const stack = new Stack()
    stack.items = [2,3,4]
    stack.pushIt(2)
    expect(stack.items).toEqual([2, 3, 4, 2])
})


test('test that stack can remove an element', ()=>{
    const stack = new Stack()
    stack.items = [2, 5, 6]
    stack.pop()
    expect(stack.items).toEqual([2, 5])
})

test('test that array is empty', ()=>{
    const stack = new Stack()
    //stack.items = []
    //stack.isEmpty()
    expect(stack.isEmpty()).toEqual(true)
})

test('test that array is not empty', ()=>{
    const stack = new Stack()
    stack.items = [2,3]
    expect(stack.isEmpty()).toEqual(false)
})


test('test that it can add to stack', () => {
    const stack = new Stack()
    stack.pushIt(1)
    stack.pushIt(2)
    stack.pushIt(3)
expect(stack.peek()).toBe(1)
    
  })



  