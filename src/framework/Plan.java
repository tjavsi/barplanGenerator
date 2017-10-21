package framework;

import java.util.HashSet;

public interface Plan {

    /**
     *
     * @return The name of the plan
     */
    public String getName();

    public HashSet<Workstation> getWorkstations();



}
