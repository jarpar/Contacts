package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        String name = scanner.nextLine();

        System.out.println("Enter the surname of the person:");
        String surname = scanner.nextLine();

        System.out.println("Enter the number:");
        String number = scanner.nextLine();

        Record record = new Record(name, surname, number);
        Contacts contacts = new Contacts(record);

        System.out.println("A record created!\nA Phone Book with a single record created!");
        System.out.println(record);
    }

}

class Contacts {
    Record rec;

    Contacts(Record rec) {
        this.rec = rec;
    }
}

class Record {
    private String name;
    private String surname;
    private String number = "";

    public String getName() {
        return name;
    }

    public String hasNumber() {
        if (number.isEmpty()) {
            return "[no number]";
        } else {
            return number;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    Record(String name, String surname, String number) {
        setName(name);
        setSurname(surname);
        setNumber(number);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + hasNumber();
    }
}
