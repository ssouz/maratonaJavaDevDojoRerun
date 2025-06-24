package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula03TIposPrimitivosExercicio {

    static Scanner sc = new Scanner(System.in);
    static String name;
    static String address;
    static double salary;
    static String salaryReceiptDate;
    static boolean checkanswer;

    public static void main(String[] args) {

        checkanswer = inputUser();

        if (checkanswer) {
            System.out.println(printer());
        }
    }

    static boolean inputUser() {
        try {
            name = sc.nextLine();
            address = sc.nextLine();
            salary = sc.nextDouble();
            salaryReceiptDate = sc.next();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    static String printer() {
        return "Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salario de " + salary
                + ", na data " + salaryReceiptDate;
    }
}
