abstract class Actor implements ActorBehavior {
protected String name;
protected boolean IsMakeOrder;
protected boolean isTakeOrder;

public Actor(String name){
this.name = name;
IsMakeOrder = false;
isTakeOrder = false;
}

public abstract String getName();
}