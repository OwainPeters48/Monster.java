import javafx.scene.paint.Color;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Actor {
    private int x;
    private int y;
    private boolean isAlive;
    private int keys;
    private Color keyColour;
    private List<Object> inventory;
    private int speed;
    private boolean isPushingBlock;
    private Block pushBlock;
    private boolean isPlayer;

    // Actor Constructor
    public Actor(int x, int y, int speed, boolean isPlayer) {
        this.x = x;
        this.y = y;
        this.isAlive = true;
        this.keys = 0;
        this.keyColour = null; // Color.NONE is not a valid value, using null instead
        this.inventory = new ArrayList<>();
        this.speed = speed;
        this.isPushingBlock = false;
        this.pushBlock = null;
        this.isPlayer = isPlayer;
    }

    // Method to move
    public void move(String direction, Map map) {
        // Implementation of move logic based on direction and map

        int newX = x;
        int newY = y;

        switch (direction) {
            case "W":
                newY -= speed;
                break;
            case "S":
                newY += speed;
                break;
            case "A":
                newX -= speed;
            case "D":
                newX += speed;
                break;

        }
    }

    // Method to pick up an item
    public void pickUpItem(Item item) {
        if (this.isPlayer && this.x == item.getX() && this.y == item.getY()) {
            // Picking up item logic
            this.inventory.add(item);

            if (item instanceof Key) {
                Key key = (Key) item;
                this.keys++;
                this.keyColour = key.getColour();
            }
        }
    }

    public void handleTerrain(Terrain terrain) {
        // Terrain handling logic
    }

    public void pushableBlock(String direction) {
        // Logic for pushing blocks
        int tileX = x;
        int tileY = y;

        switch (direction) {
            case "W":
                tileY -= 1;
                break;
            case "S":
                tileY += 1;
                break;
            case "A":
                tileX -= 1;
                break;
            case "D":
                tileX += 1;
                break;

        }

        // Checks if there was a collision with a monster
        public void checkMonsterCollision (Monster monster ){
            if (this.x == Monster.getMonsterX() && this.y == Monster.getMonsterY()) {
                this.die();
            }
        }

    }

    private void die() {
        this.isAlive = false;
        System.out.println("You died");
    }
}