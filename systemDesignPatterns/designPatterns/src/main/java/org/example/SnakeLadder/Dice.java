package org.example.SnakeLadder;

import java.util.Random;

public class Dice {
    int count;

    Dice(int count){
        this.count = count;
    }
    int roll(){
        Random random = new Random();
        return random.nextInt(count);
    }
}
