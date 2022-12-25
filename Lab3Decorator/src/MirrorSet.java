import java.util.*;

public class MirrorSet<String> implements Set<String>{
    private Set set;
    public MirrorSet(Set set)
    {
        this.set = set;
    }
    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator iterator() {
        Iterator defaultIterator = set.iterator();
        return new MirroredSetIterator(defaultIterator);
    }

    @Override
    public Object[] toArray() {
        var reversedSet = set.toArray();
        for(int i = 0; i < reversedSet.length; ++i)
        {
            StringBuilder sb = new StringBuilder(reversedSet[i].toString());
            reversedSet[i] = sb.reverse().toString();
        }
        return reversedSet;
    }

    @Override
    public boolean add(Object o) {
        return set.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean addAll(Collection collection) {
        return set.addAll(collection);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean removeAll(Collection collection) {
        return set.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return set.retainAll(collection);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return set.containsAll(collection);
    }

    @Override
    public Object[] toArray(Object[] objarray) {
        var reversed_set = set.toArray();
        if(reversed_set.length <= objarray.length)
        {
            for(int i = 0; i < reversed_set.length; ++i)
            {
                StringBuilder sb = new StringBuilder(reversed_set[i].toString());
                objarray[i] = sb.reverse().toString();
            }
            if(reversed_set.length < objarray.length)
            {
                objarray[reversed_set.length] = null;
            }
        }
        else
        {
            return toArray();
        }
        return objarray;
    }
}

class MirroredSetIterator implements Iterator<String> {
    Iterator<String> iterator;
    MirroredSetIterator(Iterator<String> iterator)
    {
        this.iterator = iterator;
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        String value = iterator.next();
        StringBuilder stringBuilder = new StringBuilder(value);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}