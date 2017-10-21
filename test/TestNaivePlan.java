import barplanGenerator.BarshiftImpl;
import barplanGenerator.BartenderImpl;
import barplanGenerator.PlanBuilderImpl;
import barplanGenerator.WorkstationImpl;
import barplanGenerator.strategies.NaiveBuildingStrategy;
import framework.*;
import org.junit.*;

import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestNaivePlan {
    private PlanBuilderImpl builder;
    private String name = "TrivielFest";

    @Before
    public void setUp() {
        HashSet<Workstation> stations = new HashSet<>();
        stations.add(new WorkstationImpl(WorkstationType.DRINKSBAR, 21,22));
        builder = new PlanBuilderImpl(new NaiveBuildingStrategy(), stations, name);
    }

    @Test
    public void shouldBeAbleToMakeOneBarWithOneShift() {

        HashSet<Bartender> bartenders = new HashSet<>();
        BartenderImpl p1 = new BartenderImpl("SEKR", 20, 3);
        p1.addWorkstation(WorkstationType.DRINKSBAR);
        p1.canBeSupervisorIn(WorkstationType.DRINKSBAR);
        bartenders.add(p1);
        BartenderImpl p2 = new BartenderImpl("FUDO", 20, 3);
        p2.addWorkstation(WorkstationType.DRINKSBAR);
        bartenders.add(p2);
        BartenderImpl p3 = new BartenderImpl("BNF", 20, 3);
        p3.addWorkstation(WorkstationType.DRINKSBAR);
        bartenders.add(p3);
        BartenderImpl p4 = new BartenderImpl("FUFI", 20, 3);
        p4.addWorkstation(WorkstationType.DRINKSBAR);
        bartenders.add(p4);
        BartenderImpl p5 = new BartenderImpl("FUTR", 20, 3);
        p5.addWorkstation(WorkstationType.DRINKSBAR);
        bartenders.add(p5);
        builder.addStaff(bartenders);

        builder.build();
        for (Workstation w : builder.getPlan().getWorkstations()) {
            for(Barshift i : w.getBarshifts()) {
                i.printBar();
            }
        }
        builder.getPlan().getWorkstations();
        assertThat(builder.getPlan().getName(), is(name));


    }

}
