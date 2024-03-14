package 2sem;

interface MarketBehaviour {
    void takeInQueue(Human human);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}