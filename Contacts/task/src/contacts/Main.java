package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter the surname of the person:");
        String surname = scanner.nextLine();
        System.out.println(surname);

        System.out.println("Enter the number:");
        String number = scanner.nextLine();
        System.out.println(number);

        System.out.println("A record created!");
        System.out.println("A Phone Book with a single record created!");
    }

}

class Contacts {
    Record rec;

    Contacts(Record rec) {
        this.rec = rec;
    }
}

class Record {
    String name;
    String surname;
    String number;

    Record(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }
}
