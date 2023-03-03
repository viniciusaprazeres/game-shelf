package games;

import games.util.Colors;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int option;

        System.out.println(Colors.TEXT_PURPLE_BOLD_BRIGHT + "============================================================================================");
        System.out.println("                                                     ");
        System.out.println("  ________                                    _________ .__               .__      _____  ");
        System.out.println(" /  _____/  _____      _____     ____        /   _____/ |  |__     ____   |  |   _/ ____\\ ");
        System.out.println("/   \\  ___  \\__  \\    /     \\  _/ __ \\       \\_____  \\  |  |  \\  _/ __ \\  |  |   \\   __\\  ");
        System.out.println("\\    \\_\\  \\  / __ \\_ |  Y Y  \\ \\  ___/       /        \\ |   Y  \\ \\  ___/  |  |__  |  |    ");
        System.out.println(" \\______  / (____  / |__|_|  /  \\___  >     /_______  / |___|  /  \\___  > |____/  |__|   ");
        System.out.println("        \\/       \\/        \\/       \\/              \\/       \\/       \\/");
        System.out.println("                                                     ");
        System.out.println("============================================================================================");
        System.out.println("                                                     ");
        System.out.println("                                1 - Register                          ");
        System.out.println("                                2 - List all              ");
        System.out.println("                                3 - Search by the number              ");
        System.out.println("                                4 - Update information             ");
        System.out.println("                                5 - Erase from the shelf                        ");
        System.out.println("                                6 - Exit                                 ");
        System.out.println("                                                     ");
        System.out.println("============================================================================================");
        System.out.println("                                                     ");

        System.out.println("Enter with the number option: ");
        option = read.nextInt();

    }
}
