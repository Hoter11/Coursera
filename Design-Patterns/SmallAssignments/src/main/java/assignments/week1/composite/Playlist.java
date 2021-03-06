package assignments.week1.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void play() {
        for (IComponent song: this.playlist) {
            song.play();
        }
    }

    public void setPlaybackSpeed(float speed) {
        for (IComponent song: this.playlist) {
            song.setPlaybackSpeed(speed);
        }
    }

    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }

}