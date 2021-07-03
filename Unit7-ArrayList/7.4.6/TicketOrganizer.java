import java.util.ArrayList;
public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    
    public TicketOrganizer(ArrayList<AirlineTicket> theTickets)
    {
        this.tickets = theTickets;
    }
    public ArrayList<AirlineTicket> getTickets()
    {
        return this.tickets;
    }
    public void printPassengersByBoardingGroup()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Boarding Group " + i + ":");
            for(int j = 0; j < tickets.size(); j++)
            {
                if(tickets.get(j).getBoardingGroup() == i) {
                    System.out.println("Passenger " + (j + 1));
                }
            }
        }
    }
    public void canBoardTogether()
    {
        boolean somePassengersCanBoard = false;
        for(int i = 0; i < tickets.size() - 1; i++)
        {
            if(tickets.get(i).getBoardingGroup() == tickets.get(i + 1).getBoardingGroup() && tickets.get(i).getRow() == tickets.get(i + 1).getRow())
            {
                System.out.println("Passenger " + i + 1 + " can board with Passenger " + i + 2 + ".");
                somePassengersCanBoard = true;
            }
        }
        if(!somePassengersCanBoard) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
}
