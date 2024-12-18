package TicTacToe.core;

public class TicTacToe {
    private final String[][] board;
    private final int rows;
    private final int cols;

    public TicTacToe(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        board = new String[rows][cols];
        initializeBoard();
    }

    private void initializeBoard(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                board[i][j] = "-";
            }
        }
    }

    public boolean placePiece(int row, int col, String symbol){
        if(row < 0 || row >= rows || col < 0 || col >= cols || !board[row][col].equals("-")){
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    public boolean checkWin(String symbol){
        // check rows
        for (int i = 0; i < rows; i++){
            boolean win = true;
            for(int j = 0; j < cols; j++){
                if(!board[i][j].equals(symbol)){
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check columns
        for (int j = 0; j < cols; j++) {
            boolean win = true;
            for (int i = 0; i < rows; i++) {
                if (!board[i][j].equals(symbol)) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check diagonals
        boolean win = true;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            if (!board[i][i].equals(symbol)) {
                win = false;
                break;
            }
        }
        if (win) return true;

        win = true;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            if (!board[i][cols - i - 1].equals(symbol)) {
                win = false;
                break;
            }
        }
        return win;
    }

    public boolean isFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(){
        for(int i=0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
