//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задача 1
        for (int i = 1; i <= 10; i = i +1) {
            System.out.println(i);
        }
        // Задача 2
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println(a);
        }
        //Задача 3
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }
        // Задача 4
        for (int q = 10; q >= -10; q = q -1) {
            System.out.println(q);
        }
        // Задача 5
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println (year + " год является высокосным");
        }// Задача 6
        for (int r = 7; r <= 98; r = r + 7) {
            System.out.println(r);
        }
        // Задача 7
        for (int g = 1; g <= 512; g=g*2){
            System.out.println(g);
        }
        //Задача 8
        int money = 29000;
        int total = 0;
        for (int o = 1; o <=12; o= o+1) {
            total = total+money;
            System.out.println("Месяц " + o + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 9
        double monthlyRate = 0.01;          // 1% в месяц (12% годовых / 12 месяцев)
        int total2 = 0;
        for (int month = 1; month <= 12; month++) {
            total2 = (int) (total2 + (total2*monthlyRate));
            total2 = total2 + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total2 + " рублей");
        }
        //Задача 10
        int number = 2;
//
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }
}
