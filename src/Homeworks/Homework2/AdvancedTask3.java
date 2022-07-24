package Homeworks.Homework2;

// Задание №3:
// Дано:
// В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
// Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
// Если у машины проблема с двигателем, то чинят и берут 10 000.
// Если у машины проблема с электрикой, то чинят и берут 5000.
// Если у машины проблема с коробкой передач, то чинят и берут 4000.
// Если у машины проблема с колесами, то чинят и берут 2000.
// Если две детали сломаны, то на общий счет идет скидка 10%.
// Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
// Если нет бензина и что-то сломано, то за консультацию денег не берут.
// Ситуации, что бензин есть и ничего не сломано - быть не может.
// Ожидаемый результат: выведен на экран счет клиенту.

public class AdvancedTask3 {
    public static void main(String[] args) {
        System.out.println("\nПродвинутый уровень\nЗадача №3");

        boolean hasFuel = false;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        //
        int consultationPrice = 1000;
        int electricPrice = 5000;
        int motorPrice = 10000;
        int transmissionPrice = 4000;
        int wheelsPrice = 2000;
        double baseDiscount = 0.9;
        double highDiscount = 0.8;
        //
        boolean hasProblems = hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem;
        int problemCount = 0;
        double discount = 1.0;
        int price = 0;

        if (!hasProblems) {
            if (!hasFuel) price = consultationPrice;
        } else {
            if (hasElectricsProblem) {
                price += electricPrice;
                problemCount++;
            }
            if (hasMotorProblem) {
                price += motorPrice;
                problemCount++;
            }
            if (hasTransmissionProblem) {
                price += transmissionPrice;
                problemCount++;
            }
            if (hasWheelsProblem) {
                price += wheelsPrice;
                problemCount++;
            }
            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                discount = highDiscount;
            } else if (problemCount > 1) {
                discount = baseDiscount;
            }
        }
        price *= discount;
        System.out.println("Счёт за работы = " + price);
    }
}
