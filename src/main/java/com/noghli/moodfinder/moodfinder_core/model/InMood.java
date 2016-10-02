package com.noghli.moodfinder.moodfinder_core.model;

public class InMood {

    final Person subject;
    final Mood target;

    public InMood(Person subject, Mood target) {
        this.subject = subject;
        this.target = target;
    }

    public Person getSubject() {
        return subject;
    }

    public Mood getTarget() {
        return target;
    }
    
}
