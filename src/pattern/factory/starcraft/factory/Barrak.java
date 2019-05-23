package pattern.factory.starcraft.factory;

import com.sun.deploy.util.StringUtils;
import pattern.factory.starcraft.unit.Madic;
import pattern.factory.starcraft.unit.Marin;
import pattern.factory.starcraft.unit.Unit;

public class Barrak implements Factory {

    @Override
    public Unit make(String name) throws Exception{
        if ("Marin".equals(name)) {
            return new Marin();
        } else if ("Madic".equals(name)) {
            return new Madic();
        } else {
            throw new Exception();
        }
    }

    public static Unit makeMarin() {
        return new Marin();
    }

    public static Unit makeMadic() {
        return new Madic();
    }
}
