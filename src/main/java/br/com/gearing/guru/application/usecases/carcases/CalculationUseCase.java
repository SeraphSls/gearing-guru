package br.com.gearing.guru.application.usecases.carcases;

import br.com.gearing.guru.domain.model.calculation.car.AwdCar;
import br.com.gearing.guru.domain.model.calculation.car.Car;
import br.com.gearing.guru.domain.model.calculation.car.factory.AwdCarFactory;
import br.com.gearing.guru.domain.model.calculation.car.factory.CarFactory;

public class CalculationUseCase {

    AwdCarFactory factory;

    public void createCar() {

      Car car =  factory.create(2, 3, 4, 6);

    }


}
