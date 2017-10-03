public class CountTest {

    public static void main(String[] args) {
        final int NUM_FLIPS = 10;
        int heads = 0, tails = 0;
        int c1heads = 0, c2heads = 0;

        Coin c1 = new Coin();
        Coin c2 = new Coin();
        System.out.println("\f   C1\t\t   C2");
        System.out.println("---------\t---------");

        while(c1heads != 3 && c2heads != 3)
        {
            c1.flip();
            c2.flip();
            System.out.println("  " + c1 + "\t\t  " + c2);
            if(c1.isHeads())
                c1heads++;
            else
                c1heads = 0;
            if(c2.isHeads())
                c2heads++;
            else
                c2heads = 0;
        }

        if(c1heads == c2heads)
            System.out.println("Tie");
        else if(c1heads > c2heads)
            System.out.println("c1 got there first");
        else
            System.out.println("c2 got there first");
    }
}
