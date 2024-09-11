package com.wnergy.smartMr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.Date;

@Entity
@Table(name = "FILE")
@Getter
public class File {

    @EmbeddedId
    private FileId id;

    @Column(name = "file_path", length = 100, nullable = false)
    private String filePath;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    // Getters and Setters
}

