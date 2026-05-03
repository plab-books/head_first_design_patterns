package org.example.week6.iterator.after;

import org.example.week6.iterator.domain.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
