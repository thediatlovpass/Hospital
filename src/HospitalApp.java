import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        printMenu();
        Hospital hospital = new Hospital();
        hospital.menuService();
    }

    public static void printMenu() {
        System.out.println("=== Witamy w programie Rejestracja Pacjentów ===");
        System.out.println(0 + " - wyjście z programu");
        System.out.println(1 + " - dopisanie pacjenta");
        System.out.println(2 + " - wyświetlenie listy zapisanych pacjentów");
    }
}
