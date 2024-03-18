public class StreamComparator implements Comparator<Поток> {
    @Override
    public int compare(Поток o1, Поток o2) {
        return Integer.compare(o1.getУчебныеГруппы().size(), o2.getУчебныеГруппы().size());
    }
}