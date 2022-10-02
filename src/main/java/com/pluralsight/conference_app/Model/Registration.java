package com.pluralsight.conference_app.Model;

import javax.validation.constraints.NotEmpty;

public class Registration {
    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
