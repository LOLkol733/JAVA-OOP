public class Поток implements Iterator<УчебнаяГруппа> {
    private List<УчебнаяГруппа> учебныеГруппы;
    private int currentIndex = 0;
    public Поток(List<УчебнаяГруппа> учебныеГруппы) {
        this.учебныеГруппы = учебныеГруппы;
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex < учебныеГруппы.size();
    }
    
    @Override
    public УчебнаяГруппа next() {
        return учебныеГруппы.get(currentIndex++);
    }
    }