package framework;

import java.util.HashSet;

public interface Bartender {

    /**
     *
     * @return The name of the Bartender
     */
    public String getName();

    /**
     *
     * @return
     */
    public HashSet<WorkStation> getPossibleWorkStations();

    /**
     *
     * @return
     */
    public HashSet<WorkStation> getSupervisorWorkStations();

    /**
     *
     * @return The time where the Bartender can work from
     */
    public int getStartTime();

    /**
     *
     * @return The time where the Bartender can't work anymore
     */
    public int getEndTime();
}
