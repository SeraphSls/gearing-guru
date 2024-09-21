package br.com.gearing.guru.domain.model.car.gearing;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public  class Car {

    private double gearRatio;
    private double diferentialRatio;
    private double tireSize;
    private double torque;

    public Car(double gearRatio, double diferentialRatio, double tireSize, double torque) {
        this.gearRatio = gearRatio;
        this.diferentialRatio = diferentialRatio;
        this.tireSize = tireSize;
        this.torque = torque;
    }
}
