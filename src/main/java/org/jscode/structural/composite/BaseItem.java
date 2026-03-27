package org.jscode.structural.composite;

import java.util.List;

public abstract class BaseItem {

    protected String name;
    protected Integer value;
    protected List<BaseItem> items;


    public BaseItem(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public abstract void add(BaseItem baseItem);
    public abstract void delete(BaseItem baseItem);
    public abstract Integer getValue();

}
