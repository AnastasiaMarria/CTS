package ro.ase.ie.cts.lab.patterns.behavioral.memento;

public class GameSession {

    int level;
    String hero;
    int points;
    int difficultyLevel;

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getHero() {
        return hero;
    }
    public void setHero(String hero) {
        this.hero = hero;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getDifficultyLevel() {
        return difficultyLevel;
    }
    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void startGame() {

    }

    public void stopGame() {

    }

    public void restartGame() {

    }

    //for memento creation
    public GameSessionSnapshot saveGame() {
        return new GameSessionSnapshot(level, hero, points, difficultyLevel);
    }

    //for memento restoration
    public void loadGame(GameSessionSnapshot snapshot) {
        System.out.println("Reloading previous gagme");
        this.setDifficultyLevel(snapshot.getDifficultyLevel());
        this.setHero(snapshot.getHero());
        this.setLevel(snapshot.getLevel());
        this.setPoints(snapshot.getPoints());
    }

}