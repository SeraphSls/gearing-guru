package br.com.gearing.guru.domain.model.calculation.car;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwdCar implements Car {



    private double gearRatio; // Relação de marcha
    private double diferential; // Relação do diferencial
    private double tire; // Tamanho do pneu em polegadas
    private double torque; // T


    @Override
    public double gearRatio() {
        return gearRatio;
    }

    @Override
    public double diferentialRatio() {
        return diferential;
    }

    @Override
    public double tireSize() {
        return tire;
    }

    @Override
    public double torque() {
        return torque;
    }

    @Override
    public double carHorsePower() {
        return 0;
    }


    @Override
    public double calculateRpm(double speed) {
        return 0;
    }

    @Override
    public double calculateTotalRatio() {
        return gearRatio() * diferentialRatio();
    }

    @Override
    public double calculateHorsePower(double speed) {
        double rpm = calculateRPM(speed);
        return (torque * rpm) / 7127; // Usar o divisor correto para torque em lb-ft e rpm
    }

    public double calculateRPM(double speed) {
        return (convertMsToKm(speed) * 60) / (calculateTireCircunference() / calculateTotalRatio());
    }




}
