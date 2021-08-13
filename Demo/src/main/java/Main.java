import pm.tech.model.xml.Movie;
import pm.tech.model.xml.MoviePlaylist;

import java.beans.XMLDecoder;
import java.io.IOException;
import java.io.InputStream;

public class Main {
  public static void main(String[] args) throws IOException {
    InputStream fileInputStream = Main.class.getClassLoader().getResourceAsStream("movie-playlist.xml");
    XMLDecoder decoder = new XMLDecoder(fileInputStream);
    MoviePlaylist moviePlaylist = (MoviePlaylist) decoder.readObject();
    System.out.println(moviePlaylist);
  }
}
