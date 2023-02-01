package java_fundamentals.code_challenge;
import java.util.Scanner;

public class CodeChallenge1 {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            System.out.println();

            if (option == 1) {
                addGuest();
            }
            else if (option == 2) {
                removeGuest();
            }
            else if (option == 3) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);
    }

    public static void displayGuests(){
        System.out.println("__________________\n- Guests -");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
//            System.out.println((i + 1) + ". " + (guests[i] == null ?  "--" : guests[i]));
            if(guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }

        if (isEmpty){
            System.out.println("Guest list is empty.");
        }
    }

    public static void displayMenu(){
        System.out.println("__________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");
    }

    public static int getOption(){
        System.out.print("Option: ");
        int option = scanner.nextInt();
        return option;
    }

    public static void addGuest(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.next();
                break;
            }
        }
    }

    public static void removeGuest(){
        System.out.print("Name: ");
        String name = scanner.next();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(name)) {
                guests[i] = null;
                break;
            }
        }
    }

    public static void insertNames(){
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }
}
