package com.company;

import java.awt.*;

public class Food {
    private  int x;
    private  int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Food(Snake player){
        this.random_spawn(player);
    }
    public void random_spawn(Snake player){
        boolean onSnake = true;
        while (onSnake){
            onSnake = false;
            x = (int)(Math.random() *Game.width -1);
            y = (int)(Math.random()*Game.height -1);// generate a random food in a window
            for( Rectangle r :player.getBody()){
                if(r.x == x && r.y ==y){
                    onSnake = true;
                }
            }

        }

    }
}
