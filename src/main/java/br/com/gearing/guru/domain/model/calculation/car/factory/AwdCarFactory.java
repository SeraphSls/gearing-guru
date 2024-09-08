package br.com.gearing.guru.domain.model.calculation.car.factory;

import br.com.gearing.guru.domain.model.calculation.car.AwdCar;
import br.com.gearing.guru.domain.model.calculation.car.Car;

public class AwdCarFactory implements  CarFactory{


    @Override
    public Car create(double gearRatio,
                      double diferential,
                      double tire,
                      double torque) {
        return new AwdCar();
    }
}