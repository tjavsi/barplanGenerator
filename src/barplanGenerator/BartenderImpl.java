package barplanGenerator;

import framework.Bartender;
import framework.WorkstationType;

import java.util.HashSet;

public class BartenderImpl implements Bartender{
    private String name;
    private HashSet<WorkstationType> supervisorWorkstation = new HashSet<>();
    private HashSet<WorkstationType> workstations = new HashSet<>();
    private int startTime;
    private int endTime;

    public BartenderImpl (String name, int startTime, int endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public HashSet<WorkstationType> getPossibleWorkStations() {
        return workstations;
    }

    @Override
    public HashSet<WorkstationType> getSupervisorWorkStations() {
        return supervisorWorkstation;
    }

    @Override
    public int getStartTime() {
        return startTime;
    }

    @Override
    public int getEndTime() {
        return endTime;
    }

    public void addWorkstation(WorkstationType station) {
        workstations.add(station);
    }

    public void canBeSupervisorIn(WorkstationType station) {
        supervisorWorkstation.add(station);
    }
}
