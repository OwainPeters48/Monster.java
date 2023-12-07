class Bug extends Monster {
    private boolean followEdge;

    // Bug constructor
    public Bug(int monsterX, int monsterY, String direction, boolean followEdge) {
        super("Bug", 2, monsterX, monsterY, direction);
        this.followEdge = followEdge;
    }

    // Method that allows bug to move tile
    @Override
    public void move() {
        if (canMoveForward()) {
            followEdge();
        } else {
            reversePath();
        }
    }

    // Method for the monster to move tile
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

    // Method to program how a bug will move along edges
    private void followEdge() {

    }
}
