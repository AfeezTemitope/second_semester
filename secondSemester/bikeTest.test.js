const Bike = require('./Bike'); 
let bike;
beforeEach(() => {
    bike = new Bike();
    bike.turnOn();
});

test('bike can turn on',() =>{
    expect(bike.isOn).toBe(true);
})

test('bike can turn off', () =>{
    bike.turnOff();
    expect(bike.isOn).toBe(false);
})

test('Bike can accelerate with gear 1', () => {
    bike.setAcceleration(22);
    bike.setGear(1);
    bike.increaseByGear();
    expect(bike.getAcceleration()).toBe(23);
});

test('Bike can accelerate with gear 2', () => {
    bike.setAcceleration(22);
    bike.setGear(2);
    bike.increaseByGear();
    expect(bike.getAcceleration()).toBe(24);
});

test('Bike can accelerate with gear 3', () => {
    bike.setAcceleration(22);
    bike.setGear(3);
    bike.increaseByGear();
    expect(bike.getAcceleration()).toBe(25);
});

test('Bike can accelerate with gear 4', () => {
    bike.setAcceleration(22);
    bike.setGear(4);
    bike.increaseByGear();
    expect(bike.getAcceleration()).toBe(26);
});

test('Bike can decrease with gear 1', () => {
    bike.setAcceleration(22);
    bike.setGear(1);
    bike.decreaseByGear();
    expect(bike.getAcceleration()).toBe(21);
});

test('Bike can decrease with gear 2', () => {
    bike.setAcceleration(22);
    bike.setGear(2);
    bike.decreaseByGear();
    expect(bike.getAcceleration()).toBe(20);
});

test('Bike can decrease with gear 3', () => {
    bike.setAcceleration(22);
    bike.setGear(3);
    bike.decreaseByGear();
    expect(bike.getAcceleration()).toBe(19);
});

test('Bike can decrease with gear 4', () => {
    bike.setAcceleration(22);
    bike.setGear(4);
    bike.decreaseByGear();
    expect(bike.getAcceleration()).toBe(18);
});

test('Gear changes with acceleration', () => {
    bike.turnOn();
    bike.setAcceleration(25);
    expect(bike.getGear()).toBe(2);
});
