package com.wnergy.smartMr.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;


@Embeddable
@Getter
public class DiaryId implements Serializable {
    private int diaryId;
    private int userId;

}
