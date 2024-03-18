public class ПотокСервис {
    private List<Поток> потоки;
    public ПотокСервис(List<Поток> потоки) {
        this.потоки = потоки;
    }
    
    public void сортировка() {
        Collections.sort(потоки, new StreamComparator());
    }