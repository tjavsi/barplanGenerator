package barplanGenerator.strategies;

import barplanGenerator.BarshiftImpl;
import framework.*;

import java.util.HashSet;

public class NaiveBuildingStrategy implements BuildingStrategy{

    @Override
    public void buildPlan(PlanBuilder builder) {
        HashSet<Workstation> stations = builder.getPlan().getWorkstations();
        for(Workstation station : stations) {
            for(int i = station.getOpeningTime() ; i != station.getClosingTime() ; i = (i+1)%24 ) {
                Bartender supervisor = null;
                for(Bartender bartender : builder.getBartenders()) {
                    for(WorkstationType type: bartender.getSupervisorWorkStations()){
                        if (type == station.getType()){
                            supervisor = bartender;
                        }
                    }
                }
                Barshift barshift = new BarshiftImpl(station.getType(), i, (i+1)%24, supervisor);
                for(Bartender bartender : builder.getBartenders()) {
                    for (WorkstationType type : bartender.getPossibleWorkStations()){
                        if (type == station.getType() && bartender != supervisor) {
                            barshift.addBartender(bartender);
                        }
                    }
                }
                station.addBarshift(barshift);
            }
        }
    }
}
