package br.com.gearing.guru.domain.model.calculation.car;


public interface Car {


    // recupera os valores de cada parametro
    double gearRatio(); // Relação de marcha
    double diferentialRatio(); // Relação do diferencial
    double tireSize(); // Tamanho do pneu em polegadas
    double torque(); // Torque em lb-ft
    double carHorsePower(); // valor do whp após o calculo
    double calculateTotalRatio();
    double calculateRpm(double speed);
    double calculateHorsePower(double speed);


    default double convertMsToKm(double speed) {
        return speed * 0.2778;
    }
    default double calculateTireCircunference() {
        // Convertendo o diâmetro do pneu para metros (26 polegadas = 0.6604 metros)
        return Math.PI * (tireSize() * 0.0254);

    }




}
