package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmark(){
        return DataStore.getBookmarks();
    }
}
