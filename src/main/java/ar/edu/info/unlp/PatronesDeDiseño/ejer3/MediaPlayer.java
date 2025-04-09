package ar.edu.info.unlp.PatronesDeDiseño.ejer3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    public List<Media> media;

    public MediaPlayer() {
        this.media = new ArrayList<Media>();
    }

    public void addMedia(Media media) {
        this.media.add(media);
    }

    public void play() {
        this.media.forEach(m -> m.play());
            
          
        }
}