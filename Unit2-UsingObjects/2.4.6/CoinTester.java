public class CoinTester
{
    public static void main(String[] args) {

       //Create your program here
       
       Coins myCoin = new Coins(4, 3, 2, 1);
       myCoin.bankValue();
       myCoin.addQuarter();
       myCoin.addQuarter();
       myCoin.addDime();
       myCoin.addDime();
       myCoin.addPenny();
       myCoin.bankCount();
       myCoin.bankValue();
    }
}
