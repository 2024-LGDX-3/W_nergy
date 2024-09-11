package com.wnergy.smartMr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.Date;

@Entity
@Table(name = "ACTIVITY")
@Getter
public class Activity {

    @EmbeddedId
    private ActivityId id;

    @Column(name = "laundry")
    private Integer laundry;

    @Column(name = "dish")
    private Integer dish;

    @Column(name = "vacuum")
    private Integer vacuum;

    @Column(name = "sleep_num")
    private Integer sleepNum;

    @Column(name = "sleep_qual_awake")
    private Integer sleepQualAwake;

    @Column(name = "sleep_qual_rem")
    private Integer sleepQualRem;

    @Column(name = "sleep_qual_core")
    private Integer sleepQualCore;

    @Column(name = "sleep_qual_deep")
    private Integer sleepQualDeep;

    @Column(name = "steps", nullable = false)
    private int steps;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    // Getters and Setters
}
