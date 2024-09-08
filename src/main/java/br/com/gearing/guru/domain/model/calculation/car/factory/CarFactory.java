package br.com.gearing.guru.domain.model.calculation.car.factory;

import br.com.gearing.guru.domain.model.calculation.car.Car;

public interface CarFactory {

    Car create(double gearRatio,
               double diferential,
               double tire,
               double torque);



}
