package com.company.cubaci.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaci.entity.Book;

@UiController("cubaci_Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("booksTable")
@LoadDataBeforeShow
public class BookBrowse extends StandardLookup<Book> {
}