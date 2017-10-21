package barplanGenerator;

import framework.Plan;
import framework.Workstation;
import framework.WorkstationType;

import java.util.HashMap;
import java.util.HashSet;

public class PlanImpl implements Plan{
    private final String name;
    private HashSet<Workstation> workstations;

    public PlanImpl(String name, HashSet<Workstation> workstations) {
        this.name = name;
        this.workstations = workstations;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public HashSet<Workstation> getWorkstations() {
        return workstations;
    }
}
