package br.com.gearing.guru.domain.model.car.gearing;



public class FwdCarGearing extends Car implements CarGearing{

    public FwdCarGearing(double gearRatio, double diferentialRatio, double tireSize, double torque) {
        super(gearRatio, diferentialRatio, tireSize, torque);
    }

    @Override
    public double calculateTotalRatio() {
        return  gearRatio * diferentialRatio;
    }

    @Override
    public double calculateRpm(double speed) {
        return 0;
    }

    @Override
    public double calculateHorsePower(double speed) {
        return 0;
    }

    @Override
    public double convertMsToKm(double speed) {
        return CarGearing.super.convertMsToKm(speed);
    }

    @Override
    public double calculateTireCircunference() {
        return CarGearing.super.calculateTireCircunference(222);
    }
}
