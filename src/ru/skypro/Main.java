package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code
        byte a = 12;
        short b = 12356;
        int c = - 528;
        long d = 56l;
        float e = 36.6f;
        double g = 3.14;
        char h = 15;
        boolean j = 10 > 5;

        System.out.println("Задача 2");
        var weight1boxer = 78.2;
        var weight2boxer = 82.7;
        double totalWeight = weight1boxer + weight2boxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        double weightDifference = (weight1boxer - weight2boxer) % weight2boxer;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");

        System.out.println("Задача 3");
        double bananaWeight = 80;
        double milkWeight = 105;
        double icecreamWeight = 100;
        double eggWeight = 70;
        System.out.println("Масса завтрака спортсмена составит " + (5 * bananaWeight + 2 * milkWeight + 2 * icecreamWeight + 4 * eggWeight) / 1000 + " кг");

        System.out.println("Задача 4");
        int loseWeightTotal = 7000;
        int loseWight1 = 250;
        int loseWight2 = 500;
        System.out.println("При таком режиме питания спортсмен похудеет на 7 кг от " + loseWeightTotal / loseWight2 + " до " + loseWeightTotal / loseWight1 + " дней");
        System.out.println("чтобы добиться результата похудения, в среднем потребуется " + (loseWeightTotal / loseWight2 + loseWeightTotal / loseWight1)/2 + " день");

        System.out.println("Задача 5");
        var salaryM = 67760;
        var salaryD = 83690;
        var salaryK = 76230;
        System.out.println("После повышения зарплаты Маша будет получать " + (salaryM + salaryM * 0.1) + " рублей в месяц. Увеличение зарплаты за год составит " + salaryM * 0.1 *12 + " руб.");
        System.out.println("После повышения зарплаты Денис будет получать " + (salaryD + salaryD * 0.1) + " рублей в месяц. Увеличение зарплаты за год составит " + salaryD * 0.1 *12 + " руб.");
        System.out.println("После повышения зарплаты Кристина будет получать " + (salaryK + salaryK * 0.1) + " рублей в месяц. Увеличение зарплаты за год составит " + salaryK * 0.1 *12 + " руб.");




    }
}
