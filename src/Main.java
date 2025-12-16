import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Going to start the game");

        Cell initPost = new Cell(0, 0);
        Snake snake = new Snake(initPost);
        Board board = new Board(10, 10);

        Game newGame = new Game(snake, board);
        newGame.setDirection(Game.DIRECTION_RIGHT);
        newGame.setGameOver(false);

        newGame.setDirection(Game.DIRECTION_RIGHT);
        newGame.update();
        Snake s = newGame.getSnake();
        System.out.println("printhwre");
        for(Cell v: s.getSnakePartList() ){
            System.out.println(v.getRow());
            System.out.println(v.getCol());
            System.out.println(v.getCellType());
        }


//        for(int i=0; i<5; i++){
//            if (i == 2){
//                newGame.getBoard().generateFood();
//                newGame.update();
//            }
//            if (i == 3)
//                newGame.setDirection(Game.DIRECTION_RIGHT);
//            if (newGame.isGameOver())
//                break;
//        }
    }
}