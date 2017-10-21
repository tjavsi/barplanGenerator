package framework;

import java.util.ArrayList;

public interface Workstation {

    public WorkstationType getType();

    public int getOpeningTime();

    public int getClosingTime();

    public ArrayList<Barshift> getBarshifts();

    public void addBarshift(Barshift barshift);
}
