package barplanGenerator;

import framework.Bartender;
import framework.WorkStation;

import java.util.HashSet;

public class BartenderImpl implements Bartender{
    private String name;
    private HashSet<WorkStation> supervisorWorkstation = new HashSet<>();
    private HashSet<WorkStation> workstations = new HashSet<>();

    public BartenderImpl (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public HashSet<WorkStation> getPossibleWorkStations() {
        return workstations;
    }

    @Override
    public HashSet<WorkStation> getSupervisorWorkStations() {
        return supervisorWorkstation;
    }

    @Override
    public int getStartTime() {
        return 0;
    }

    @Override
    public int getEndTime() {
        return 0;
    }

    private void addWorkstation(WorkStation station) {
        workstations.add(station);
    }

    private void canBeSupervisorIn(WorkStation station) {
        supervisorWorkstation.add(station);
    }
}
