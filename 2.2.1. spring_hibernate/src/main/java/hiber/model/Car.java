package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    @Column
    private String model;
    @Column
    int series;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        if(this == null) {
            return "The car was not found in the database.";
        }
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
