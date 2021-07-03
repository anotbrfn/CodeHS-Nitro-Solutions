public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        chess[0] = chess[7] = new String[]{"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        //chess[7] = {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        for(int i = 1; i < 7; i += 5)
            for(int j = 0; j < 8; j++)
                chess[i][j] = "Pawn";
        for(int i = 2; i <= 5; i++)
            for(int j = 0; j < 8; j++)
                chess[i][j] = "-";
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
