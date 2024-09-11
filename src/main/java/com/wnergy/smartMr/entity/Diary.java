package com.wnergy.smartMr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.Date;

@Entity
@Table(name = "DIARY")
@Getter
public class Diary {

    @EmbeddedId
    private DiaryId id;

    @Column(name = "diary_title", length = 100, nullable = false)
    private String diaryTitle;

    @Column(name = "diary_context", length = 500, nullable = false)
    private String diaryContext;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

}
