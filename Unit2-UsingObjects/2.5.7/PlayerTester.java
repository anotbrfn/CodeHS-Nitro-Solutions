public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       BasketballPlayer lebron = new BasketballPlayer("Lebron James", "Lakers");
       BasketballPlayer michael = new BasketballPlayer("Michael Jordan");
       
       lebron.addGame(5, 5);
       lebron.addGame(4, 5);
       lebron.addGame(3, 5);
       lebron.addGame(2, 5);
       
       michael.addGame(1, 5);
       michael.addGame(2, 5);
       michael.addGame(3, 5);
       michael.addGame(5, 5);
       
       System.out.println("Lebron James Stats:");
       lebron.printPPG();
       lebron.printAPG();
       System.out.println(lebron);
       
       System.out.println("Michael Jordan Stats:");
       michael.printPPG();
       michael.printAPG();
       System.out.println(michael);
    }
}
