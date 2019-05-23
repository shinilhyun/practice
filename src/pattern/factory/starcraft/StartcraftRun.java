package pattern.factory.starcraft;

import pattern.factory.starcraft.factory.Barrak;
import pattern.factory.starcraft.factory.Factory;
import pattern.factory.starcraft.unit.Unit;

public class StartcraftRun {
    public static void main(String[] args) {
        try {
            Unit m = Barrak.makeMarin();
            Unit m2 = Barrak.makeMadic();
            m.attack();
            m2.attack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
