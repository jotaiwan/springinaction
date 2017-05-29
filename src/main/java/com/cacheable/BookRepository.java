package com.cacheable;

/**
 * Created by jotaiwan on 29/05/2017.
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
