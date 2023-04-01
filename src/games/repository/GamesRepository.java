package games.repository;

import games.model.Games;

public interface GamesRepository {

    // CRUD methods
    public void create(Games game);
    public void searchAll();
    public void searchByName(String name);
    public void update(Games game);
    public void delete(String name);
}
