package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        double result= number01 / (double) number02;// resultado de int/int == int
        System.out.println(number01+" + "+number02+" = "+ (number01+number02));
        System.out.println(result);

        // %
        int remainder = 23 % 2;
        System.out.println(remainder);

        // < > <= >= == !=
        boolean isTenBiggerThanTwenty =  10 > 20;
        boolean isTenLessThanTwenty =  10 < 20;
        boolean isTenEqualTwenty =  10 == 20;
        boolean isTenEqualTen=  10 == 10;
        boolean isTenDifferentFromTen=  10 != 10;

        System.out.println("isTenBiggerThanTwenty = "+isTenBiggerThanTwenty);
        System.out.println("isTenLessThanTwenty = "+ isTenLessThanTwenty);
        System.out.println("isTenEqualTwenty = "+ isTenEqualTwenty);
        System.out.println("isTenEqualTen = "+ isTenEqualTen);
        System.out.println("isTenDifferentFromTen = "+ isTenDifferentFromTen);


        //&&(and) //(or) !

        int age = 29;
        float salary = 3500F;
        boolean islegallyOlderThan30 = age >=  30 && salary >= 4612;
        boolean islegallyYoungerThan30 = age < 30 && salary  > 3381;

        System.out.println(islegallyOlderThan30);
        System.out.println(islegallyYoungerThan30);

        double totalCurrentAccountValue = 200;
        double totalSavingsAccountValue = 1000;
        float objectToBuy = 5000F;

        boolean canAfford =totalCurrentAccountValue > objectToBuy || totalSavingsAccountValue > totalCurrentAccountValue;
        System.out.println("can Afford "+canAfford);


        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int counter = 0;
        counter++;
        counter++;
        counter--;
        System.out.println(counter);

        int counter2 = 0;
        System.out.println(counter2++);
        System.out.println(++counter2);

    }
}
