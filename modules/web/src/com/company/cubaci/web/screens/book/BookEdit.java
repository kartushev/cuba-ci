package com.company.cubaci.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaci.entity.Book;

@UiController("cubaci_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
}