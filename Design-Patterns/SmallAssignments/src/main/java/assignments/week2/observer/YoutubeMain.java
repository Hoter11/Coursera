package assignments.week2.observer;

public class YoutubeMain {

    public static void main(String[] args) {
        Follower follower1 = new Follower("Micky");
        Follower follower2 = new Follower("Joseph");

        Channel channel = new Channel("MrBeast", "On Fire");

        channel.registerObserver(follower1);
        channel.registerObserver(follower2);
        channel.notifyObservers();

        channel.removeObserver(follower1);
        channel.notifyObservers();
    }
}
