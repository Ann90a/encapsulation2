import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Grande",
                1.7,
                "желтый",
                2015,
                "Россия"
        );
        lada.setRegNumber("р254рл199");
        System.out.println(lada.isCorrectRegNumber());
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия"
        );
        audi.setGears("фвтомат");
        audi.setKey(new Car.Key(true, true));
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия"
        );
        bmw.setSummerTyres(false);
        bmw.setInsurance(new Car.Insurance(LocalDate.now(), 30_000, "1425369"));
        bmw.getInsurance().checkExpireDate();
        bmw.getInsurance().checkNumber();
        Car kia = new Car(
                "Kia",
                "Sportage 4 поколение",
                2.4,
                "красный",
                2018,
                "Южная Корея"
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея"
        );

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
    }

    private static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() +
                        ", год выпуска: " + car.getProductionYear() +
                        ", страна сборки: " + car.getProductionCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getGears() +
                        ", тип кузова: " + car.getTypeOfBody() +
                        ", рег. гомер: " + car.getRegNumber() +
                        ", кол-во мест: " + car.getSeatsCount() +
                        ", " + (car.isSummerTyres() ? "летнеяя" : "зимняя") + " резина" +
                        ", " + (car.getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ") +
                        ", " + (car.getKey().isRemoteRunEngine() ? "даленный запуск" : "обычный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumber() +
                        ", стоимость страховки " + car.getInsurance().getCost() +
                        ", срок действия страховки " + car.getInsurance().getExpireDate()
        );
    }
}