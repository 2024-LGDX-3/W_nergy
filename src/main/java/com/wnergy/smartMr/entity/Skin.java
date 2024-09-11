package com.wnergy.smartMr.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SKIN")
public class Skin implements Serializable {

    @EmbeddedId
    private SkinId id;

    @Column(name = "skin_age", nullable = false)
    private int skinAge;

    @Column(name = "skin_type", nullable = false)
    private int skinType;

    @Column(name = "skin_wrinkle", nullable = false)
    private int skinWrinkle;

    @Column(name = "skin_pores", nullable = false)
    private int skinPores;

    @Column(name = "skin_blackhead", nullable = false)
    private int skinBlackhead;

    @Column(name = "skin_acne", nullable = false)
    private int skinAcne;

    @Column(name = "skin_sensitivity", nullable = false)
    private int skinSensitivity;

    @Column(name = "skin_melanin", nullable = false)
    private int skinMelanin;

    @Column(name = "skin_water", nullable = false)
    private int skinWater;

    @Column(name = "skin_rough", nullable = false)
    private int skinRough;

    @Column(name = "skin_dark_circle", nullable = false)
    private int skinDarkCircle;

    @Column(name = "total_score", nullable = false)
    private int totalScore;

    // Getters and Setters
}
