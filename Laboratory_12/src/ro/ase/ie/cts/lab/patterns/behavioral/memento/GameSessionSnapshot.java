package ro.ase.ie.cts.lab.patterns.behavioral.memento;

public class GameSessionSnapshot {

    int level;
    String hero;
    int points;
    int difficultyLevel;

    //to identify this snapshot in time
    long timestamp;

    public GameSessionSnapshot(int level, String hero, int points, int difficultyLevel) {
        super();
        this.level = level;
        this.hero = hero;
        this.points = points;
        this.difficultyLevel = difficultyLevel;

        this.timestamp = System.currentTimeMillis();
    }

    public int getLevel() {
        return level;
    }

    public String getHero() {
        return hero;
    }

    public int getPoints() {
        return points;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public long getTimestamp() {
        return timestamp;
    }



}
