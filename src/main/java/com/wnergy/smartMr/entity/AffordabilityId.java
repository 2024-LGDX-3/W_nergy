package com.wnergy.smartMr.entity;


import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;

@Embeddable
@Getter
public class AffordabilityId implements Serializable {
    private int userAffordabilityId;
    private int activityId;
}
