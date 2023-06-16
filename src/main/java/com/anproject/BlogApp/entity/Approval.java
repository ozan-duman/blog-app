package com.anproject.BlogApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "approvals")
public class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean approveInfo;
    private Date approveDate;

    @ManyToOne
    @JoinColumn(name = "news_id")
    private News newsId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
