package com.wnergy.smartMr.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;

@Embeddable
@Getter
public class FileId implements Serializable {
    private int fileNum;
    private int userId;

    // Getters, Setters, equals, and hashCode methods
}
