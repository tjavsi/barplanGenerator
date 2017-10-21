package barplanGenerator;

import framework.Barshift;
import framework.Bartender;
import framework.WorkstationType;

import java.util.HashSet;

public class BarshiftImpl implements Barshift{
    private WorkstationType type;
    private int startTime;
    private int endTime;
    private HashSet<Bartender> bartenders = new HashSet<>();
    private Bartender supervisor;

    public BarshiftImpl(WorkstationType type, int startTime, int endTime, Bartender supervisor) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.supervisor = supervisor;
    }

    @Override
    public WorkstationType getType() {
        return type;
    }

    @Override
    public int startTime() {
        return startTime;
    }

    @Override
    public int endTime() {
        return endTime;
    }

    @Override
    public HashSet<Bartender> getBartenders() {
        return bartenders;
    }

    @Override
    public Bartender getSupervisor() {
        return supervisor;
    }

    public void addBartender(Bartender bartender) {
        bartenders.add(bartender);
    }

    public void printBar(){
        System.out.println("Supervisor is: " + supervisor);
        for(Bartender bartender : bartenders) {
            System.out.println("Bartender: " + bartender);
        }
    }
}
