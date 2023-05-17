package games.controller;

import games.model.Games;
import games.repository.GamesRepository;
import games.util.Colors;

import java.util.ArrayList;

public class GamesController implements GamesRepository {

    private ArrayList<Games> gamesList = new ArrayList<Games>();

    @Override
    public void create(Games game) {
        gamesList.add(game);
        System.out.println("The game " + game.getName() + " was registered!" + Colors.TEXT_RESET);
    }

    @Override
    public void searchAll() {
        if (gamesList.isEmpty()) {
            System.out.println(Colors.TEXT_PURPLE_BOLD_BRIGHT + "There are no registered games!" + Colors.TEXT_RESET);
        } else {
            System.out.println(Colors.TEXT_PURPLE_BOLD_BRIGHT + "All games: \n" + Colors.TEXT_RESET);
            for (var game : gamesList) {
                game.informations();
                System.out.println("\n");
            }
        }
    }

    @Override
    public void searchByName(String name) {
        var game = searchInTheCollection(name);

        if (game != null)
            game.informations();
        else
            System.out.println(Colors.TEXT_PURPLE_BOLD_BRIGHT + "The game " + name + " was not found!" + Colors.TEXT_RESET);
    }

    @Override
    public void update(String name, Games game) {
        var searchGame = searchInTheCollection(name);

        if (searchGame != null){
            gamesList.set(gamesList.indexOf(searchGame), game);
            System.out.println("The game " + name + " was updated!");
        } else
            System.out.println("The game " + name + " was not found!");
    }

    @Override
    public void delete(String name) {
        var game = searchInTheCollection(name);

        if (game != null){
            if (gamesList.remove(game))
                System.out.println("The game " + name + " was deleted!" + Colors.TEXT_RESET);
        } else
            System.out.println("The game " + name + " was not found!" + Colors.TEXT_RESET);
    }

    // Secondary methods
    public Games searchInTheCollection(String name) {

        for (var game : gamesList){
            if (game.getName().equalsIgnoreCase(name))
                return gamesList.get(gamesList.indexOf(game));
        }

        return null;
    }
}
