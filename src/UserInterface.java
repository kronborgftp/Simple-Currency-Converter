import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class UserInterface {
    Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    Converter converter = new Converter();

    public void startProgram() {

        int choice = 0;

        while (choice != 6) {

            System.out.println("""
                    1. Convert from USD \s
                    2. Convert from DKK \s
                    3. Convert from EUR \s
                    4. Convert from JPY \s
                    5. Convert from GBP \s
                    6. Exit the program""");

            choice = getIntInput();

            switch (choice) {
                case 1 -> {converter.usdConverter();}
                case 2 -> {converter.dkkConverter();}
                case 3 -> {converter.eurConverter();}
                case 4 -> {converter.jpyConverter();}
                case 5 -> {converter.gbpConverter();}
                case 6 -> System.out.println("Have a nice day.");
                default -> System.out.println("Please choose on of the options above");
            }
        }
    }


    private int getIntInput() {
        while (true) {
            try {
                return keyboard.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter an integer");
                keyboard.nextLine();
            }
        }
    }
}
