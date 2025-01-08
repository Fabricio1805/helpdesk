package com.backend.backend.domain.enums;

public enum Profile {
    ADMIN("ROLE_ADMIN"),
    CLIENT("ROLE_CLIENT"),
    TECHNICAL("ROLE_TECHNICAL");

    private String description;

    public String getDescription() {
        return description;
    }

    private Profile(String description) {
        this.description = description;
    }
}
