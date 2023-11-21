package racing.view;

import racing.domain.Car;
import racing.domain.Cars;

public class ResultView {

    public void print(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }

}
