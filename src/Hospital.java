import java.util.Scanner;

public class Hospital {


    Scanner scanner = new Scanner(System.in);
    private final int maxPatients = 2;
    Patient[] patients = new Patient[maxPatients];
    int counterOfPatients = 0;

    public void menuService() {

        int menuPosition = scanner.nextInt();
        scanner.nextLine();
        switch (menuPosition) {
            case 0:
                closeApp();
            case 1:
                addPatientToQueue();
            case 2:
                printListOfPatients(patients);
        }
    }

    private void closeApp() {
        System.exit(0);
    }

    private void addPatientToQueue() {

        if (counterOfPatients < maxPatients) {
            Patient patient = new Patient();
            System.out.println("Podaj Imię pacjenta: ");
            patient.setName(scanner.nextLine());
            System.out.println("Podaj Nazwisko pacjenta: ");
            patient.setLastName(scanner.nextLine());
            System.out.println("Podaj PESEL pacjenta: ");
            patient.setPesel(scanner.nextInt());
            scanner.nextLine();
            patients[counterOfPatients] = patient;
            counterOfPatients++;
            HospitalApp.printMenu();
            menuService();
        } else {
            System.out.println("Limit pacjentów został wyczerpany");
            System.out.println("Powrót do Menu");
            HospitalApp.printMenu();
            menuService();
        }
    }

    private void printListOfPatients(Patient[] patients) {
        System.out.println("Lista pacjentów w kolejce: ");
        for (int i = 0; i < counterOfPatients; i++) {
            System.out.println("Pacjent nr:" + (i + 1) + ", Imię: " + patients[i].getName() +
                    ", Nazwisko: " + patients[i].getLastName() +
                    ", Pesel: " + patients[i].getPesel());
        }
        HospitalApp.printMenu();
        menuService();
    }
}


