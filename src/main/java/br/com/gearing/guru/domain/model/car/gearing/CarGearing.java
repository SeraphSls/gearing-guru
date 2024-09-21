package br.com.gearing.guru.domain.model.car.gearing;


public interface CarGearing {

    double calculateTotalRatio();
    double calculateRpm(double speed);
    double calculateHorsePower(double speed);
    default double convertMsToKm(double speed) {
        return speed * 0.2778;
    }
    default double calculateTireCircunference(double speed) {
        // Convertendo o diâmetro do pneu para metros (26 polegadas = 0.6604 metros)
        return Math.PI * (speed * 0.0254);

    }
    double calculateTireCircunference();
}
