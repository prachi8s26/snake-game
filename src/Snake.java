import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> snakePartList = new LinkedList<>();
    private Cell head;

    public Snake(Cell head){
        this.head = head;
        snakePartList.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    public void grow() { snakePartList.add(head); }

    public void move(Cell nextCell){
        System.out.println("Snake is moving to" + nextCell.getRow() +" " + nextCell.getCol());
        Cell tail = snakePartList.removeLast();
        tail.setCellType(CellType.EMPTY);
        head = nextCell;
        head.setCellType(CellType.SNAKE_NODE);
        snakePartList.addFirst(head);
    }

    public Boolean checkCrash(Cell nextCell){
        System.out.println("Checking if crash for the following cell " + nextCell.getRow() + " " + nextCell.getCol());
        for(Cell cell: snakePartList){
            if(cell.equals(nextCell)){
                return true;
            }
        }
        return false;
    }

    public LinkedList<Cell> getSnakePartList() {
        return snakePartList;
    }

    public void setSnakePartList(LinkedList<Cell> snakePartList) {
        this.snakePartList = snakePartList;
    }
    public Cell getHead(){
        return head;
    }
    public void setHead(Cell head){
        this.head = head;
    }
}
