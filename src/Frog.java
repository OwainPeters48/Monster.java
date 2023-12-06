import java.util.Random;

class Frog extends Monster {
    private int playerPositionX;
    private int playerPositionY;

    public Frog(int monsterX, int monsterY, String direction, int playerPositionX, int playerPositionY) {
        super("Pink Ball", 1, monsterX, monsterY, direction);
        this.playerPositionX = playerPositionX;
        this.playerPositionY = playerPositionY;
    }
    @Override
    public void move() {
        if (playerInsight()) {
            moveTowardPlayer();
        } else {
            reversePath();
        }
    }

    private boolean playerInsight() {
        // Check if the player is on the same row as the monster
        return playerPositionX == monsterX || playerPositionY == monsterY;
    }

    private void moveTowardPlayer() {
        if (playerPositionX > monsterX) {
            monsterX++;
        } else if (playerPositionX < monsterX) {
            monsterX--;
        }
        if (playerPositionY > monsterY) {
            monsterY++;
        } else if (playerPositionY < monsterY) {
            monsterY--;
        }

    }

    private boolean noPathFound(){
        // Checks if there are obstacles in the path to the player
        if (playerPositionX == monsterX) {
            return true;
        }
        return true;
    }

    private void moveRandom() {
        int direction = new Random().nextInt(4);
        switch (direction) {
            case 0:
                monsterX++;
                break; // Move right
            case 1:
                monsterX--;
                break; // Move left
            case 2:
                monsterY++;
                break; // Move down
            case 3:
                monsterY--;
                break; // Move up
        }
    }
}