package service;

import java.util.Random;

public class SingleDiceRollService implements DiceRollService {
    @Override
    public int roleDice() {
        Random random =  new Random();
        return random.nextInt(6)+1;
    }
}
