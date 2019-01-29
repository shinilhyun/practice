package pattern.strategy;

public class CryMute implements Cry {
    @Override
    public String getCry() {
        return "mute";
    }
}
