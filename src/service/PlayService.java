package service;

import model.Board;
import model.Player;

import java.util.Queue;

public class PlayService {

    private DiceRollService diceRollService;
    private Queue<Player> players;
    private Board board;
    public  PlayService(Queue<Player> players,DiceRollService diceRollService,Board board){
        this.players = players ;
        this.diceRollService = diceRollService;
        this.board = board;
    }
    public void startGame(){
        while(players.size()>1){
            Player player = players.poll();
            int role = diceRollService.roleDice();
            int nextPosition = player.getPosition() + role;
            if(nextPosition == board.getMaxPosition()){
                System.out.println("Player:"+player.getName()+" win,Congratulation!!");
            }
            else if(nextPosition < board.getMaxPosition()){
                int nextStop =Board.getDestination().containsKey(nextPosition) ?
                        Board.getDestination().get(nextPosition) : nextPosition ;
                System.out.println("Player:"+player.getName() +" moves from:"+player.getPosition() +" to:"+nextStop);
                player.setPosition(nextStop);
                players.offer(player);

            }else {
                players.offer(player);
            }

        }
    }

}
