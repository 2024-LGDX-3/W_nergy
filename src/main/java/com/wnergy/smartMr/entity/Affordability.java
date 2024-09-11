package com.wnergy.smartMr.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "AFFORDABILITY")
@Getter
public class Affordability {

    @EmbeddedId
    private AffordabilityId id;

    @Column(name = "user_affordability")
    private Integer userAffordability;

    @Column(name = "user_affordability_level")
    private Integer userAffordabilityLevel;

    // Getters and Setters
}