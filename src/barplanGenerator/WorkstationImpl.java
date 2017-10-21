package barplanGenerator;

import framework.Barshift;
import framework.Workstation;
import framework.WorkstationType;

import java.util.ArrayList;

public class WorkstationImpl implements Workstation{
    private final WorkstationType type;
    private int openingTime;
    private int closingTime;
    private ArrayList<Barshift> barshifts;


    public WorkstationImpl(WorkstationType type, int openingTime, int closingTime) {
        this.type = type;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    @Override
    public WorkstationType getType() {
        return type;
    }

    @Override
    public int getOpeningTime() {
        return openingTime;
    }

    @Override
    public int getClosingTime() {
        return closingTime;
    }

    @Override
    public ArrayList<Barshift> getBarshifts() {
        return barshifts;
    }

    public void addBarshift(Barshift barshift) {
        barshifts.add(barshift);
    }
}
