package br.com.gearing.guru.domain.model.car.gearing;


public  class Car {

    protected double gearRatio;
    protected double diferentialRatio;
    protected double tireSize;
    protected double torque;

    public Car(double gearRatio, double diferentialRatio, double tireSize, double torque) {
        this.gearRatio = gearRatio;
        this.diferentialRatio = diferentialRatio;
        this.tireSize = tireSize;
        this.torque = torque;
    }


}
