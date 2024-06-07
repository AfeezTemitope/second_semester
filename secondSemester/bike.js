class Bike {
    constructor() {
        this.acceleration = 0;
        this.isOn = false;
        this.gear = 1;
    }

    turnOn() {
        this.isOn = true;
    }

    turnOff() {
        this.isOn = false;
    }

    isOn() {
        return this.isOn;
    }

    setAcceleration(acceleration) {
        this.acceleration = acceleration;
        this.gearSpeed();
    }

    getAcceleration() {
        return this.acceleration;
    }

    setGear(gear) {
        if(this.isOn && gear >= 1 && gear <= 4) this.gear = gear;
    }

    getGear() {
        return this.gear;
    }

    increaseByGear() {
        if (this.isOn && this.acceleration >= 0) this.acceleration += this.gear;
        this.gearSpeed();
    }

    decreaseByGear() {
        if(this.isOn && this.acceleration >= this.gear) this.acceleration -= this.gear;
        this.gearSpeed();
    }

    gearSpeed() {
        if (this.acceleration >= 0 && this.acceleration <= 20) {
            this.gear = 1;
        } else if (this.acceleration >= 21 && this.acceleration <= 30) {
            this.gear = 2;
        } else if (this.acceleration >= 31 && this.acceleration <= 40) {
            this.gear = 3;
        } else if (this.acceleration >= 41) {
            this.gear = 4;
        }
    }
}
module.exports = Bike
