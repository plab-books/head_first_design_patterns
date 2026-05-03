package org.example.week6.iterator.after;

import org.example.week6.iterator.domain.MenuItem;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return items[position++];
    }
}
