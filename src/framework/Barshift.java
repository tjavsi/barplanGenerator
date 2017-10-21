package framework;

import java.util.HashSet;

public interface Barshift {

    /**
     *
     * @return the type of Work Station
     */
    public WorkstationType getType();

    public int startTime();

    public int endTime();

    public HashSet<Bartender> getBartenders();

    public Bartender getSupervisor();
}
