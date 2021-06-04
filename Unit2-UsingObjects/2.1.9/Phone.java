
/**
 * 
 * The phone class represents a cellular phone.
 * 
 * Add the instance variables you think a phone would need
 */ 

public class Phone
{

    // Attributes
   boolean phoneTouchscreen;
   String phoneContact1;
   String phoneContact2;
   String phoneContact3;
   int phoneNumber;
    
    public Phone(boolean touchscreen, String contact1, String contact2, String contact3, int number){
        phoneTouchscreen = touchscreen;
        phoneContact1 = contact1;
        phoneContact2 = contact2;
        phoneContact3 = contact3;
        phoneNumber = number;
    }
}
