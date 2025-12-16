public class Game {
    public static final int DIRECTION_NONE = 0, DIRECTION_UP = 2, DIRECTION_DOWN = -2, DIRECTION_LEFT = -1, DIRECTION_RIGHT = 1;
    private Snake snake;
    private Board board;
    private int direction;
    private boolean gameOver;

    public Game(Snake snake, Board board){
        this.snake = snake;
        this.board = board;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake){
        this.snake = snake;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board){
        this.board = board;
    }

    public boolean isGameOver() {return gameOver;}

    public void setGameOver(boolean gameOver){
        this.gameOver = gameOver;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction){
        this.direction = direction;
    }

    public void update(){
        System.out.println("Going to update the game");
        if(!gameOver){
            if(direction != DIRECTION_NONE){
                Cell nextcell = getNextCell(snake.getHead());
                if(snake.checkCrash(nextcell)){
                    setDirection(DIRECTION_NONE);
                    gameOver = true;
                } else {
                    Cell tail = snake.move(nextcell);
                    if(nextcell.getCellType() == CellType.FOOD){
                        snake.grow(tail);
                        board.generateFood();
                    }
                }
            }
        }
    }

    public Cell getNextCell(Cell currentPosition){
        System.out.println("find next position");

        int row = currentPosition.getRow();
        int col = currentPosition.getCol();

        if(direction == DIRECTION_RIGHT){
            col++;
        } else if (direction == DIRECTION_LEFT){
            col--;
        } else if (direction == DIRECTION_UP){
            row--;
        } else if (direction == DIRECTION_DOWN){
            row++;
        }

        return board.getCells()[row][col];
    }
}
