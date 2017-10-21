package barplanGenerator;

import framework.*;

import java.util.HashSet;

public class PlanBuilderImpl implements PlanBuilder{
    private BuildingStrategy strategy;
    private HashSet<Bartender> bartenders = null;
    private HashSet<Workstation> stations = null;
    private Plan plan = null;

    public PlanBuilderImpl(BuildingStrategy strategy, HashSet<Workstation> stations, String name) {
        this.strategy = strategy;
        this.stations = stations;
        plan = new PlanImpl(name, stations);
    }

    @Override
    public void build() {
        strategy.buildPlan(this);
    }

    @Override
    public Plan getPlan() {
        return plan;
    }

    @Override
    public HashSet<Bartender> getBartenders() {
        return bartenders;
    }

    public void addStaff(HashSet<Bartender> bartenders) {
        this.bartenders = bartenders;
    }

    public void addWorkstations(HashSet<Workstation> stations) {
        this.stations = stations;
    }



}
