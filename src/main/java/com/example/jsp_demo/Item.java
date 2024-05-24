package com.example.jsp_demo;

public class Item {

    private final Long id;
    private final String name;

    private final SubItem subItem;

    public Item(Long id, String name, SubItem  subItem) {
        this.id = id;
        this.name = name;
        this.subItem = subItem;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SubItem getSubItem() {
        return subItem;
    }
}