package framework;

import java.util.HashSet;

public interface PlanBuilder {

    public void build();

    public Plan getPlan();

    public HashSet<Bartender> getBartenders();
}