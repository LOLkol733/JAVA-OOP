import java.util.List;

public interface MarketBehavior {

    void acceptToMarket(Actor actors);

    Void releaseFromMarket(List<Actor> actors);

    void update();
}
