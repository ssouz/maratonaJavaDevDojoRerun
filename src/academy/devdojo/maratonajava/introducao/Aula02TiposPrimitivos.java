package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int age = 10;
        long numeroGrande = 1000000; // 1000000L
        double salaryDouble = 20000.0D;
        float salaryFloat = 2500.0F;
        byte ageByte = -128;
        short ageShort = 10;
        boolean verdadeiro = true;
        char character = 65;

        float salaryFloat2 = (float) 2500.000000D;
        int age2 = (int) 100000000000L;


        System.out.println("character " + character);
        System.out.println("a idade é " + age);
        System.out.println("salaryFloat2 " + salaryFloat2);
        System.out.println("age2 " + age2);
    }

}
