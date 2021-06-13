public class SongTester
{
    public static void main(String[] args)
    {
        // Start here!
        Song s1 = new Song("ABBA", "Dancing Queen", 3, 54);
        System.out.println("artist= " + s1.getArtist());
        System.out.println("title= " + s1.getTitle());
        System.out.println("Time= " + s1.getMinutes() + ":" + s1.getSeconds());
        
        Song s2 = new Song("Bruce Springsteen", "The Heart of Rock and Roll", 5, 14);
        System.out.println("artist= " + s2.getArtist());
        System.out.println("title= " + s2.getTitle());
        System.out.println("Time= " + s2.getMinutes() + ":" + s2.getSeconds());
        
        
        Song s3 = new Song("Huey Lewis & the News", "The Heart of Rock and Roll", 4, 59);
        System.out.println("artist= " + s3.getArtist());
        System.out.println("title= " + s3.getTitle());
        System.out.println("Time= " + s3.getMinutes() + ":" + s3.getSeconds());
    }
}
