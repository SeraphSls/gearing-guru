package br.com.gearing.guru.domain.model.car.factory;

import br.com.gearing.guru.domain.model.car.gearing.AwdCarGearing;
import br.com.gearing.guru.domain.model.car.gearing.CarGearing;
import br.com.gearing.guru.domain.model.car.gearing.FwdCarGearing;
import br.com.gearing.guru.domain.model.car.gearing.RdwCarGearing;

public class AllCarFactory implements CarFactory {



    @Override
    public CarGearing createAwd(double gearRatio, double diferential, double tire, double torque) {
        return new AwdCarGearing(gearRatio,diferential,tire,torque);
    }

    @Override
    public CarGearing createRdw(double gearRatio, double diferential, double tire, double torque) {
        return new RdwCarGearing(gearRatio,diferential,tire,torque);
    }

    @Override
    public CarGearing createFwd(double gearRatio, double diferential, double tire, double torque) {
        return new FwdCarGearing(gearRatio,diferential,tire,torque);
    }
}
