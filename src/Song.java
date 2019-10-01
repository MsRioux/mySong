public class Song
{
    //1) Instance Variables
    String title;
    String artist; // can also be composer
    Boolean hasLyrics;
    int length; //in seconds
    double fileSize; //in megaBytes

    //2) Constructors
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
    }// end zero-arg or default constructor

    public Song(String newTitle, String newArtist, Boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = newLength;
        fileSize = newFileSize;

    }//end multi-arg constructor

    //3. toString  a must have for every great object class
    public String toString()
    {
      String output = "";
      output += "Title: " + title;
      output += "\nArtist: " + artist;
      output += "\nHas Lyrics?: " + hasLyrics;
      output += "\nLength (in seconds): " + length;
      output += "\nFile Size (in mB): " + fileSize;

      return output;
    }// end toString

}//end class Song
