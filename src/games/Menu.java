package games;

import games.controller.GamesController;
import games.model.EpicGamesStoreGames;
import games.model.SteamGames;
import games.model.XboxGames;
import games.util.Colors;

import java.awt.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        GamesController games = new GamesController();

        int option, recentReviews, allReviews, criticsRecommend, topCriticAverage;
        float price, reviews;
        String name, newName, description, developer, publisher, releaseDate, platform, openCriticRating;

        while (true){

            System.out.println(Colors.TEXT_CYAN_BOLD_BRIGHT + "============================================================================================");
            System.out.println("                                                     ");
            System.out.println("  ________                                    _________ .__               .__      _____  ");
            System.out.println(" /  _____/  _____      _____     ____        /   _____/ |  |__     ____   |  |   _/ ____\\ ");
            System.out.println("/   \\  ___  \\__  \\    /     \\  _/ __ \\       \\_____  \\  |  |  \\  _/ __ \\  |  |   \\   __\\  ");
            System.out.println("\\    \\_\\  \\  / __ \\_ |  Y Y  \\ \\  ___/       /        \\ |   Y  \\ \\  ___/  |  |__  |  |    ");
            System.out.println(" \\______  / (____  / |__|_|  /  \\___  >     /_______  / |___|  /  \\___  > |____/  |__|   ");
            System.out.println("        \\/       \\/        \\/       \\/              \\/       \\/       \\/");
            System.out.println("                                                      \\ ");
            System.out.println("                                           ,---.        \\");
            System.out.println("                                          ;     \\        ;");
            System.out.println("                                      .==\\\"/==.  `-.___.-'");
            System.out.println("                                    ((+) .  .:)");
            System.out.println("                                    |`.-(o)-.'|");
            System.out.println("                                    \\/  \\_/  \\/");
            System.out.println("============================================================================================" + Colors.TEXT_RESET);
            System.out.println("                                                     ");
            System.out.println("                                1 - Register a Game                          ");
            System.out.println("                                2 - List All              ");
            System.out.println("                                3 - Search By Name              ");
            System.out.println(Colors.TEXT_YELLOW_BOLD_BRIGHT + "                                4 - Update Informations             " + Colors.TEXT_RESET);
            System.out.println(Colors.TEXT_RED_BOLD_BRIGHT + "                                5 - Erase Game                        " + Colors.TEXT_RESET);
            System.out.println("                                6 - Exit                                 ");
            System.out.println("                                                     ");
            System.out.println(Colors.TEXT_CYAN_BOLD_BRIGHT + "============================================================================================" + Colors.TEXT_RESET);
            System.out.println("                                                     ");
            System.out.println("Enter with the number option: \n");

            try {
                option = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter integer numbers!");
                read.nextLine();
                option = 0;
            }

            if (option == 6) {
                System.out.println("Thank you for using Game Shelf. See you later!");
                read.close();
                System.exit(0);
            }

            switch (option) {

                case 1 -> {

                    System.out.println("Enter the informations for register \n");

                    System.out.println("Name: ");
                    read.skip("\\R?");
                    name = read.nextLine();

                    System.out.println("Description: ");
                    read.skip("\\R?");
                    description = read.nextLine();

                    System.out.println("Developer: ");
                    read.skip("\\R?");
                    developer = read.nextLine();

                    System.out.println("Publisher: ");
                    read.skip("\\R?");
                    publisher = read.nextLine();

                    System.out.println("Release date: ");
                    read.skip("\\R?");
                    releaseDate = read.nextLine();

                    System.out.println("Price: ");
                    price = read.nextFloat();

                    System.out.println("Platform (Steam | Epic Games Store | Xbox): ");
                    read.skip("\\R?");
                    platform = read.nextLine();

                    if (platform.equalsIgnoreCase("Steam")) {

                        platform = "Steam";

                        System.out.println("Recent reviews: ");
                        recentReviews = read.nextInt();

                        System.out.println("All reviews: ");
                        allReviews = read.nextInt();

                        games.create(new SteamGames(name, description, developer, publisher, releaseDate, price, platform, recentReviews, allReviews));

                        keyPress();

                    } else if (platform.equalsIgnoreCase("Epic Games Store")) {

                        platform = "Epic Games Store";

                        System.out.println("Critics Recommend: ");
                        criticsRecommend = read.nextInt();

                        System.out.println("Top Critic Average: ");
                        topCriticAverage = read.nextInt();

                        System.out.println("Open Critic Rating: ");
                        read.skip("\\R?");
                        openCriticRating = read.nextLine();

                        games.create(new EpicGamesStoreGames(name, description, developer, publisher, releaseDate, price, platform, criticsRecommend, topCriticAverage, openCriticRating));

                        keyPress();

                    } else if (platform.equalsIgnoreCase("Xbox")) {

                        platform = "Xbox";

                        System.out.println("Reviews: ");
                        reviews = read.nextFloat();

                        games.create(new XboxGames(name, description, developer, publisher, releaseDate, price, platform, reviews));

                        keyPress();

                    }

                }

                case 2 -> {

                    games.searchAll();
                    keyPress();

                }

                case 3 -> {

                    System.out.println("List of games by the name \n");

                    System.out.println("Name: ");
                    read.skip("\\R?");
                    name = read.nextLine();

                    games.searchByName(name);

                    keyPress();

                }

                case 4 -> {

                    System.out.println(Colors.TEXT_YELLOW_BOLD_BRIGHT + "Update \n");

                    System.out.println("Name of the game to search: ");
                    read.skip("\\R?");
                    name = read.nextLine();

                    if (games.searchInTheCollection(name) != null){

                        System.out.println("New name: ");
                        read.skip("\\R?");
                        newName = read.nextLine();

                        System.out.println("New description: ");
                        read.skip("\\R?");
                        description = read.nextLine();

                        System.out.println("New developer: ");
                        read.skip("\\R?");
                        developer = read.nextLine();

                        System.out.println("New publisher: ");
                        read.skip("\\R?");
                        publisher = read.nextLine();

                        System.out.println("New release date: ");
                        read.skip("\\R?");
                        releaseDate = read.nextLine();

                        System.out.println("New price: ");
                        price = read.nextFloat();

                        System.out.println("New platform (Steam | Epic Games Store | Xbox): ");
                        read.skip("\\R?");
                        platform = read.nextLine();

                        if (platform.equalsIgnoreCase("Steam")) {

                            platform = "Steam";

                            System.out.println("Recent reviews: ");
                            recentReviews = read.nextInt();

                            System.out.println("All reviews: ");
                            allReviews = read.nextInt();

                            games.update(name, new SteamGames(newName, description, developer, publisher, releaseDate, price, platform, recentReviews, allReviews));

                            keyPress();

                        } else if (platform.equalsIgnoreCase("Epic Games Store")) {

                            platform = "Epic Games Store";

                            System.out.println("Critics Recommend: ");
                            criticsRecommend = read.nextInt();

                            System.out.println("Top Critic Average: ");
                            topCriticAverage = read.nextInt();

                            System.out.println("Open Critic Rating: ");
                            read.skip("\\R?");
                            openCriticRating = read.nextLine();

                            games.update(name, new EpicGamesStoreGames(newName, description, developer, publisher, releaseDate, price, platform, criticsRecommend, topCriticAverage, openCriticRating));

                            keyPress();

                        } else if (platform.equalsIgnoreCase("Xbox")) {

                            platform = "Xbox";

                            System.out.println("Reviews: ");
                            reviews = read.nextFloat();

                            games.update(name, new XboxGames(newName, description, developer, publisher, releaseDate, price, platform, reviews));

                            keyPress();

                        }
                    } else
                        System.out.println("The game was not found!" + Colors.TEXT_RESET);

                }

                case 5 -> {

                    System.out.println(Colors.TEXT_RED_BOLD_BRIGHT + "Erase from the shelf\n");

                    System.out.println("Enter the name of the game: ");
                    read.skip("\\R?");
                    name = read.nextLine();

                    games.delete(name);

                    keyPress();

                }

                default -> {
                    System.out.println("\n Wrong option!");
                    keyPress();
                }
            }
        }
        
    }

    public static void keyPress() {

        try {

            System.out.println(Colors.TEXT_RESET + "\n\nPress Enter to continue...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("The typed key is not Enter!");
        }
    }

}
