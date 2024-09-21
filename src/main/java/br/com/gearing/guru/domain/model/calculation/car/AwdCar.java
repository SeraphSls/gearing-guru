package br.com.gearing.guru.domain.model.calculation.car;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car")
@Entity
public class AwdCar implements Car {


    @Column(nullable = false)
    private double gearRatio;
    @Column(nullable = false)// Relação de marcha
    private double diferential;
    @Column(nullable = false)// Relação do diferencial
    private double tire;
    @Column(nullable = false)// Tamanho do pneu em polegadas
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
