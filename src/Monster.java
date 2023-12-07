abstract class Monster extends Actor {

    // Declaring variables
    protected String type;
    protected float speed;
    protected String direction;
    protected static int monsterX;
    protected static int monsterY;

    // Monster constructor
    public Monster(String type, int speed, int monsterX, int monsterY, String direction) {
        super(monsterX, monsterY, speed, false);
        this.type = type;
        this.speed = speed;
        this.monsterX = monsterX;
        this.monsterY = monsterY;
        this.direction = direction;
    }


    public abstract void move();

    // Get the X
    public static int getMonsterX() {
        return monsterX;
    }

    // Get the Y
    public static int getMonsterY() {
        return monsterY;
    }

    // Method that reverses the monster's path
    public void reversePath() {
        switch (direction) {
            case "up":
                direction = "down";
                break;
            case "down":
                direction = "up";
                break;
            case "left":
                direction = "right";
                break;
            case "right":
                direction = "left";
                break;
        }
    }
}
