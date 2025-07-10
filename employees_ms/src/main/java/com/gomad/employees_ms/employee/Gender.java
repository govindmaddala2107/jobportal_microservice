package com.gomad.employees_ms.employee;

public enum Gender {
    M("Male"),
    F("Female");

    private final String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
