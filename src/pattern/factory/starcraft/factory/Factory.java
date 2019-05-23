package pattern.factory.starcraft.factory;

import pattern.factory.starcraft.unit.Unit;

public interface Factory {

    public Unit make(String name) throws Exception;
}
