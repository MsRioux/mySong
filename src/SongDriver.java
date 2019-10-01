public class SongDriver
{
    public static void main (String args[])
    {
        //1. Create a Song, or more
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadLochs = new Song("Deadlochs", "Blue Face", true, 150, 3.57);
        Song overture = new Song("1812 Overture", "Petyr Ilych Tchaicovsky", false, 1080, 11.11);
        //2. Print it out
        System.out.println(fireworks);
        System.out.println();
        System.out.println(deadLochs);
        System.out.println("\n" + overture);
    }//end main method

}//end class SongDriver.  This is where all the fun stuff happens.
