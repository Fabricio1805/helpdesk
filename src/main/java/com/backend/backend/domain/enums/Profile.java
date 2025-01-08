package com.backend.backend.domain.enums;

import lombok.Getter;

@Getter
public enum Profile {
    ADMIN("ROLE_ADMIN"),
    CLIENT("ROLE_CLIENT"),
    TECHNICAL("ROLE_TECHNICAL");

    private String description;

    private Profile(String description) {
        this.description = description;
    }
}
