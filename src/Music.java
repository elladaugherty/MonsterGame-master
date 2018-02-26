
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Music {
  public static void main(String args[]) {
    try {
      // Loop
      URL url = new URL(
          "https://soundcloud.com/kermt-krus/fortnite-ost-battle-royal-menu-music-rock-version");
      AudioClip clip = Applet.newAudioClip(url);
      clip.loop();
      Thread.sleep(5000);
      File file = new File("bark.wav");
      clip = Applet.newAudioClip(file.toURL());
      clip.play();
      Thread.sleep(500);
      System.exit(0);
    } catch (InterruptedException e) {
    } catch (MalformedURLException e) {
    }
  }
}


    
  


