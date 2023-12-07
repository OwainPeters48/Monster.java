class Ball extends Monster {

    // PinkBall constructor
    public Ball(int monsterX, int monsterY, String direction) {
        super("Pink Ball", 1, monsterX, monsterY, direction);
    }

    // Method that allows monster to move
    @Override
    public void move() {
        if (canMoveForward()) {
            moveForward();
        } else {
            reversePath();
        }
    }

    // Method that checks monster can move forward
    private boolean canMoveForward() {
        int nextX = monsterX;
        int nextY = monsterY;

        switch (direction) {
            case "up":
                nextY -= 1;
                break;
            case "down":
                nextY += 1;
                break;
            case "left":
                nextX -= 1;
                break;
            case "right":
                nextX += 1;
                break;
        }
        monsterX = nextX;
        monsterY = nextY;

        return true;
    }

    // Method to move monster
    private void moveForward() {
        switch (direction) {
            case "up":
                monsterY -= 1;
                break;
            case "down":
                monsterY += 1;
                break;
            case "left":
                monsterX -= 1;
                break;
            case "right":
                monsterX += 1;
                break;
        }
    }
}
