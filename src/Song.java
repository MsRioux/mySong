public class Song
{
    //1) Instance Variables
    String title;
    String artist; // can also be composer
    boolean hasLyrics;
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

    public Song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;
    }//end three-arg constructor


    public Song(String newTitle, String newArtist, boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = newLength;
        fileSize = newFileSize;

    }//end multi-arg constructor


    //4 Getters
    public String getTitle()
    {
        return title;
    }//title getter

    public String getArtist()
    {
        return artist;
    }//artist getter

    public boolean getHasLyrics()
    {
        return hasLyrics;
    }//hasLyrics getter

    //5 Setters
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end Title setter

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }// end artist setter

    public void setHasLyrics(boolean newHasLyrics)
    {
        hasLyrics = newHasLyrics;
    }// end hasLyrics setter


    //6 Brain Methods
    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
       return minutes + " min " + seconds + " sec";
    }//end brain method to convert length

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
