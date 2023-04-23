import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayDeque implements MyDequeue {

    private Integer[] elements;
    private int numberOfElements = 0;
    private int indexHead = 0;
    private int indexTail;

    public MyArrayDeque(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Integer[initialCapacity];
            indexTail = elements.length - 1;
        }
    }

    private void arrayExtension() {
        if (numberOfElements == elements.length) {
            Integer[] extendedArray = new Integer[elements.length + (elements.length) / 2];
            int headLenght = indexHead;
            int tailLenght = numberOfElements - (indexTail + 1);
            System.arraycopy(elements, 0, extendedArray, 0, headLenght);
            System.arraycopy(elements, indexTail + 1, extendedArray, extendedArray.length - tailLenght, tailLenght);
            elements = extendedArray;
            indexTail = elements.length - (tailLenght + 1);
        }

    }

    @Override
    public void addToHead(Integer element) {
        if (numberOfElements == elements.length)
            arrayExtension();
        elements[indexHead] = element;
        indexHead++;
        numberOfElements++;
    }

    @Override
    public void addToTail(Integer element) {
        if (numberOfElements == elements.length)
            arrayExtension();
        elements[indexTail] = element;
        indexTail--;
        numberOfElements++;
    }

    @Override
    public Integer removeHead() {
        if (numberOfElements == 0) {
            throw new NoSuchElementException();
        }
        Integer elemToRemove = peekHead();
        elements[indexHead] = null;
        indexHead--;
        numberOfElements--;

        return elemToRemove;
    }


    @Override
    public Integer removeTail() {
        if (numberOfElements == 0) {
            throw new NoSuchElementException();
        }
        Integer elemToRemove = peakTail();
        elements[indexTail] = null;
        indexTail++;
        numberOfElements--;

        return elemToRemove;
    }

    @Override
    public Integer peekHead() {
        if (numberOfElements == 0) {
            throw new NoSuchElementException();
        }
        return elements[indexHead - 1];
    }


    @Override
    public Integer peakTail() {
        if (numberOfElements == 0) {
            throw new NoSuchElementException();
        }
        return elements[indexTail + 1];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public boolean contains(Integer element) {
        for (Integer countElem : elements) {
            if (countElem == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(elements);
    }
}
