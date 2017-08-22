package com.topxgun.appbase.base.model;


public abstract class Entity extends Base {

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
