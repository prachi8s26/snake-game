public class Board {
    final int ROW_COUNT, COLUMN_COUNT;
    private Cell[][] cells;

    public Board(int rowCount, int columnCount) {
        this.ROW_COUNT = rowCount;
        this.COLUMN_COUNT = columnCount;
        cells = new Cell[ROW_COUNT][COLUMN_COUNT];
        for(int i=0; i<ROW_COUNT; i++) {
            for(int j=0; j<COLUMN_COUNT; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
        cells[0][1].setCellType(CellType.FOOD);
    }


    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void generateFood(){
        System.out.println("Going to generate food");
        int row = 0;
        int column = 0;

        while(true){
            row = (int) (Math.random() * ROW_COUNT);
            column = (int) (Math.random()* COLUMN_COUNT);
            if(cells[row][column].getCellType() !=  CellType.SNAKE_NODE){
                break;
            }
        }

        cells[row][column].setCellType(CellType.FOOD);
        System.out.println("Food generated");
    }
}
