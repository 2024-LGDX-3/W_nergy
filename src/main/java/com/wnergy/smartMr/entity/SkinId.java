package com.wnergy.smartMr.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;

@Embeddable
@Getter
public class SkinId implements Serializable {
    private int skinId;
    private int userId;
}
