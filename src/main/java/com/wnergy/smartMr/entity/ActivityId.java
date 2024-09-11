package com.wnergy.smartMr.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;

@Embeddable
@Getter
public class ActivityId implements Serializable {
    private int activityId;
    private int userId;
}
