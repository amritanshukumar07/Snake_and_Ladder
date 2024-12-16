//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        System.out.println("Player 1 start at 0");

        int dice= (int) (Math.random()*6)+1;

        System.out.println("Value of dice is "+ dice);
        int player1Pos=0;
        int option= (int)(Math.random()*3)+1;
        // System.out.println(option);
        switch (option){
            case 1 -> player1Pos=player1Pos;
            case 2 -> player1Pos+=dice;
            case 3 -> player1Pos-=dice;
        }
        if(player1Pos <0){
            player1Pos=0;
        }
        System.out.println("Player position is "+ player1Pos);



    }
}