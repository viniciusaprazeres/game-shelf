package games.controller;

import games.model.Games;
import games.repository.GamesRepository;

import java.util.ArrayList;

public class GamesController implements GamesRepository {

    private ArrayList<Games> gamesList = new ArrayList<Games>();

    @Override
    public void create(Games game) {
        gamesList.add(game);
        System.out.println("The game was registered!");
    }

    @Override
    public void searchAll() {
        for (var game: gamesList)
            game.informations();
            System.out.println("\n");
    }

    @Override
    public void searchByName(String name) {
        var game = searchInTheCollection(name);

        if (game != null)
            game.informations();
        else
            System.out.println("The game: " + name + " was not found!");
    }

    @Override
    public void update(Games game) {
        var searchGame = searchInTheCollection(game.getName());

        if (searchGame != null){
            gamesList.set(gamesList.indexOf(searchGame), game);
            System.out.println("The game: " + game.getName() + " was updated!");
        } else
            System.out.println("The game: " + game.getName() + " was not found!");
    }

    @Override
    public void delete(String name) {
        var game = searchInTheCollection(name);

        if (game != null){
            if (gamesList.remove(game))
                System.out.println("The game: " + name + " was deleted!");
        } else
            System.out.println("The game: " + name + " was not found!");
    }

    // Secondary methods
    public Games searchInTheCollection(String name) {
            if (gamesList.contains(name)) {
                return gamesList.get(gamesList.indexOf(name));
            }

        return null;
    }
}
