public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private char[][] board;
   public TicTacToe()
    {
        board = new char[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                board[i][j] = '-';
        turn = 0;
    }
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
        System.out.println("  0 1 2");
        for(int i = 0; i < 3; i++)
        {
            System.out.print(i + " ");
            for(int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       return (board[row][col] == '-');
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       char xro;
       if(turn % 2 == 0)
       {
            xro = 'X';
       } else
       {
           xro = 'O';
       }
       board[row][col] = xro;
       turn++;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       
       for(int i = 0; i < 3; i++)
       {
           char ch = board[i][0];
           if (ch == board[i][1] && ch == board[i][2])
                return true;
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for(int i = 0; i < 3; i++)
        {
            char ch = board[0][i];
            if(ch == board[1][i] && ch == board[2][i])
                return true;
       }
        return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
           char ch = board[0][0];
           if(ch == board[1][1] && ch == board[2][2])
                return true;
            ch = board[0][2];
            if(ch == board[1][1] && ch == board[2][0])
                return true;
        return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return(checkCol() || checkRow() || checkDiag());
   }

}
