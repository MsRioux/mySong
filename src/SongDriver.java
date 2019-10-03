public class SongDriver
{
    public static void main (String args[])
    {
        //1. Create a Song, or more
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadLochs = new Song("Deadlochs", "Blue Face", true, 150, 3.57);
        Song overture = new Song("1812 Overture", "Petyr Ilych Tchaicovsky", false, 1093, 11.11);
        Song happySong = new Song("The Happy Song","Moi", true);

        //3 Testing getters
        System.out.println(fireworks.getTitle());
        System.out.println(deadLochs.getArtist());
        System.out.println(overture.getHasLyrics());

        System.out.println("In minutes: " + overture.toMinSec());

        //Testing Setters
//        System.out.println("\n" + someSong + "\n");
//        someSong.setTitle("Lalalalala");
//        someSong.setArtist("A Singer");
//        System.out.println(someSong);

        //2. Print it out
        System.out.println(happySong);
//        System.out.println(fireworks);
//        System.out.println();
//        System.out.println(deadLochs);
//        System.out.println("\n" + overture);
    }//end main method

}//end class SongDriver.  This is where all the fun stuff happens.
