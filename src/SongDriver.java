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
//        Song happySong2 = new Song("The Happy Song","Moi", true);
//        Song happySong3 = happySong;

//        Playlist myPlaylist = new Playlist();
//        myPlaylist.addSong(fireworks);
//        myPlaylist.addSong(deadLochs);
//        myPlaylist.addSong(overture);
//        myPlaylist.addSong(someSong);
//        myPlaylist.addSong(happySong);
//        System.out.println(myPlaylist.toString());

    if (fireworks.compareTo(deadLochs) < 0)
        System.out.println("yeah!");
    else
        System.out.println("Nope!");


//        System.out.println(fireworks.toString());

/*
        if (fireworks.compareTo(deadLochs) > 0)
        {
            System.out.println("Fireworks is Longer");
        }
        else if (fireworks.compareTo(deadLochs) < 0)
        {
            System.out.println("DeadLochs is Longer");
        }
        else
        {
            System.out.println("They are the same length");
        }
*/

  /*

        if (happySong == happySong2)
        {
            System.out.println("They are the same");
        }//end if
        else
        {
            System.out.println("They are NOT the same");
        }//end else
        if (happySong == happySong3)
        {
            System.out.println("They are the same");
        }//end if
        else
        {
            System.out.println("They are NOT the same");
        }//end else
*/
//        System.out.println("There are " + Song.getCount() + " songs on this list.");

        //4 Checking other methods and properties
//        deadLochs.setLength(-5);
//        System.out.println(deadLochs);
//        fireworks.title = "Happy Song";
//        System.out.println(fireworks);

/*
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


 */
    }//end main method

}//end class SongDriver.  This is where all the fun stuff happens.
