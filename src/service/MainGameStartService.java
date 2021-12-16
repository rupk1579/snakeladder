package service;

import model.Board;
import model.Player;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainGameStartService {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter board max size");
        int boardSize = sc.nextInt();
        System.out.println("Enter no of snake");
        int snakes =  sc.nextInt();
        System.out.println("Enter no ladders");
        int ladders =sc.nextInt();
        int playerSize = sc.nextInt();
        Queue<Player> players = new LinkedList<>();
        for(int i=0;i<playerSize;i++){
            System.out.println("Enter player name:");
            players.add(new Player(sc.next()));
        }
        Board board = new Board(boardSize,snakes,ladders);
        DiceRollService diceRollService = new SingleDiceRollService();
        PlayService playService = new PlayService(players,diceRollService,board);
        playService.startGame();


    }
}
