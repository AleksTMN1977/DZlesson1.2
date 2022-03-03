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

        var weight1boxer = 78.2;
        var weight2boxer = 82.7;
        double totalWeight = weight1boxer + weight2boxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        double weightDifference = (weight1boxer - weight2boxer) % weight2boxer;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");



    }
}
