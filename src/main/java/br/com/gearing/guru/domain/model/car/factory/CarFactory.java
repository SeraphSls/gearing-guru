package br.com.gearing.guru.domain.model.car.factory;

import br.com.gearing.guru.domain.model.car.gearing.CarGearing;

public interface CarFactory {

    CarGearing createAwd(double gearRatio,
                         double diferential,
                         double tire,
                         double torque);

    CarGearing createRdw(double gearRatio,
                         double diferential,
                         double tire,
                         double torque);

    CarGearing createFwd(double gearRatio,
                         double diferential,
                         double tire,
                         double torque);



}
