class Ball extends Monster {
    public Ball(int monsterX, int monsterY, String direction) {
        super("Pink Ball", 1, monsterX, monsterY, direction);
    }
    @Override
    public void move() {
        if (canMoveForward()) {
            moveForward();
        } else {
            reversePath();
        }
    }

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