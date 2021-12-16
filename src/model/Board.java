package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Board {
    private int maxPosition;
    private int snakes;
    private int ladders;
    private static Map<Integer,Integer> destination = new HashMap<>();

    public Board(int maxPosition, int snakes, int ladders) {
        this.maxPosition = maxPosition;
        this.snakes = snakes;
        this.ladders = ladders;
        initializeBoard();
    }
    private void initializeBoard(){
        int cnt =0;
        while(cnt!=snakes){
            Random random = new Random();
            int rand1 = random.nextInt(maxPosition)+1;
            int rand2 =  random.nextInt(maxPosition)+1;
            int end = Math.min(rand1,rand2);
            int start = Math.max(rand1,rand2);
            if(start!= end && start!= maxPosition && !destination.containsKey(start)){
                System.out.println("snakes start :"+start +"end :"+end);
                destination.put(start,end);
                cnt++;
            }
        }
        cnt = 0 ;
        while(cnt!=ladders){
            Random random = new Random();
            int rand1 = random.nextInt(maxPosition)+1;
            int rand2 =  random.nextInt(maxPosition)+1;
            int end = Math.max(rand1,rand2);
            int start = Math.min(rand1,rand2);
            if(start!= end && !destination.containsKey(start)){
                System.out.println("ladder start :"+start +"end :"+end);
                destination.put(start,end);
                cnt++;
            }
        }


    }

    public int getMaxPosition() {
        return maxPosition;
    }

    public static Map<Integer, Integer> getDestination() {
        return destination;
    }
}
