package ro.ase.ie.cts.lab.patterns.behavioral.memento;

import java.util.ArrayList;

public class SavedGamesMemento {
    ArrayList<GameSessionSnapshot> savedGames =
            new ArrayList<>();

    public void addSavedGame(GameSessionSnapshot savedGame) {
        this.savedGames.add(savedGame);
    }

    public void getSavedGame(long timestamp) {
        //search a saved game by its timestamp and return
    }
}