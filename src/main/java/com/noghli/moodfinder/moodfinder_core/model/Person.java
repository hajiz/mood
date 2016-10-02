package com.noghli.moodfinder.moodfinder_core.model;

import java.util.UUID;

public class Person {
    final UUID uuid = UUID.randomUUID();
    final String name;

    public Person(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
