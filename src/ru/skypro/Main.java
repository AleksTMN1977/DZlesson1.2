package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code
        System.out.println("Задача 1");
        byte a = 12;
        short b = 12356;
        int c = - 528;
        long d = 56L;
        float e = 36.6f;
        double g = 3.14;
        char h = 15;
        boolean aIsAdult = a > 5;
        System.out.println(aIsAdult);

        System.out.println("Задача 2");
        var weight1boxer = 78.2;
        var weight2boxer = 82.7;
        double totalWeight = weight1boxer + weight2boxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        double weightDifference = weight2boxer % weight1boxer;
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

        System.out.println("Задача 6");
            int x = 12;
            int y = 27;
            int z = 44;
            int m = 15;
            int n = 9;
            int result = - x * (y + (z - m * n));
            System.out.println(result);

            System.out.println("Задача 7");
            int k = 5;
            int l = 7;
            k = k * l;
            l = k / l;
            k = k / l;
            System.out.println("k = " + k + " l = " + l);

            System.out.println("Задача 8");
            int q = 859;
            int w;
            w = q / 10 % 10;
            System.out.println("w =   " + w);



    }
}
