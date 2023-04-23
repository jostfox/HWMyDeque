public interface MyDequeue {

    void addToHead(Integer element);

    void addToTail(Integer element);

    Integer removeHead();

    Integer removeTail();

    Integer peekHead();

    Integer peakTail();

    boolean isEmpty();

    boolean contains(Integer element);
}
