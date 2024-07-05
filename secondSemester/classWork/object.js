function print(afeez){
    console.log(afeez)
}

// let animal = {
//     name : "unknwon",
//     color : "blue",
//     sound : function(){
//         return `${this.name} made a fucking sound bby`
//     }
// }

// let cat = Object.create(animal)
// cat.name = "pussyCat",
// cat.color = "red";
// console.log(cat)


// // or we go the other route

// let dog = {}
// Object.setPrototypeOf(dog,animal)
// dog.name = 'bullDog'
// console.log(dog)

let car = {
    brand: "Toyota",
    model: "Corolla",
    startEngine: function() {
    return ` ${this.brand} + " " + ${this.model} `
    }
    }

    let motor = Object.create(car)
    car.brand = "afeezCar"
    car.model = "cohort20"
    print(motor)

    let motors = {}
    Object.setPrototypeOf(motors,car)
    motors.brand = 'afeez'
    motors.model = 'c20'
    print(motors)



function Person (name,age){
        this.name = name
        this.age = age
    

    this.describe = function (){
        print(`My name is ${this.name} and i am ${this.age} years`)
    }

}

const afeez = new Person('bad-afeez',26)
afeez.describe()
// print(afeez)