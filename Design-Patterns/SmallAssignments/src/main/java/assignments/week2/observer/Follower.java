package assignments.week2.observer;

public class Follower implements Observer {

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public void update(String channelName) {
        // Update
        // Given the UML design, the Follower class has to way to get the state of a channel
        // and play its video
        System.out.println("Update follower: " + this.followerName);
    }

    private void play() {
        // Play
        System.out.println("Playing for follower: " + this.followerName);
    }
}
