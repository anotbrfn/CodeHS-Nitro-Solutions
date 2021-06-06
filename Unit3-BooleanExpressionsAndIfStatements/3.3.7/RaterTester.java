public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater rater = new Rater("My Company", 2.0);
        rater.updateReview();
        System.out.println(rater);
        rater.setRating(5.0);
        rater.updateReview();
        System.out.println(rater);
    }
}
