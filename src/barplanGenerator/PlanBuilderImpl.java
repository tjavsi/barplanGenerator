package barplanGenerator;

import framework.*;

import java.util.HashSet;

public class PlanBuilderImpl implements PlanBuilder{
    private BuildingStrategy strategy;
    private HashSet<Bartender> bartenders = null;
    private HashSet<Workstation> stations = null;
    private Plan plan = null;

    public PlanBuilderImpl(BuildingStrategy strategy) {
        this.strategy = strategy;
        plan = new PlanImpl();
    }

    @Override
    public void build() {
        strategy.buildPlan(this);
    }

    @Override
    public Plan getPlan() {
        return plan;
    }

    public void addStaff(HashSet<Bartender> bartenders) {
        this.bartenders = bartenders;
    }

    public void addWorkstations(HashSet<Workstation> stations) {
        this.stations = stations;
    }



}
