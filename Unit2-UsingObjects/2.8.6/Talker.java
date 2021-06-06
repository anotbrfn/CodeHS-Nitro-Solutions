public class Talker
{
    private String text;
    
    // Constructor
    public Talker(String startingText)
    {
        text = startingText;
    }
    
    // Returns the text in all uppercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String yell()
    {
        return text.toUpperCase();
    }
    
    // Returns the text in all lowercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String whisper()
    {
        return text.toLowerCase();
    }
    
    // Reset the instance variable to the new text
    public void setText(String newText)
    {
        text = newText;
    }
    
    // Returns a String representatin of this object
    // The returned String should look like
    // 
    // I say, "text"
    // 
    // The quotes should appear in the String
    // text should be the value of the instance variable
    public String toString()
    {
        return "I say, " + "\"" + text + "\"";
    }
}
