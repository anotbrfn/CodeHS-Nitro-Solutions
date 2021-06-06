public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int middle = word.length() / 2;
        String result = word.substring(middle) + word.substring(0, middle);
        return result;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
       String firstPart = word.substring(0, insertIdx);
       String secPart = word.substring(insertIdx);
       String result = firstPart + insertText + secPart;
       return result;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int insertIDx2 = word.indexOf(insertChar);
        String firstPart = word.substring(0, insertIDx2);
        String secPart = word.substring(insertIDx2);
        String result = firstPart + insertText + secPart;
        return result;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
        
    }
    
    
}
