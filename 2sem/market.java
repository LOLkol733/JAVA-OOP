import java.util.ArrayList;
import java.util.List;

public class Market implments MarketBehavior, QueueBehavior{

    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() +  "Пришел в магазин");
        takeInQueue(actor);
    } 
    @Override
    public void releaseFromMarket(List <Actor> actors) {
        for (Actor actor: actors) {
        System.out.println(actor.getName() + "вышел из магазина");
        queue.remove(actor);
    }
}
    @Override
    public void update(){
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName()+ "встал в очередь");
        queue.add(actor);
    }
    @Override
    public void takeOrders() {
        for(actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + "сделал заказ");

        }
    }
}

@Override
public void giveOrders() {
    for (actor actor : queue) {
        if(actor.isMakeOrder()){
            actor.serTakeorder(true);
            System.out.println(actor.getName() + "получил заказ");

        }
    }
}

@Override
public void releaseFromQueue(){
    List<Actor> releasedActors = new ArrayList<>();
    for (actor actor : queue){
        if(actor.isTakeOrder()){
            releasedActors.add(actor);
            System.out.println(actor.getName() + "вышел из очереди");
        }
    }
    releaseFromMarket(releasedActors);
}
}

   