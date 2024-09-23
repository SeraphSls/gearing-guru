package br.com.gearing.guru.adapters.web;

import br.com.gearing.guru.application.usecases.carcases.CalculationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {


    private  final CalculationUseCase calculationUseCase;

    @Autowired
    public CarController(CalculationUseCase calculationUseCase) {
        this.calculationUseCase = calculationUseCase;
    }
}
