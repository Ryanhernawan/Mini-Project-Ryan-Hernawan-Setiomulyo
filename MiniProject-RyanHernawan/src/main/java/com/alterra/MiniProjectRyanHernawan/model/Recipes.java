package com.alterra.MiniProjectRyanHernawan.model;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "recipes")
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    User user;



    private String title;
    private String image_url;
    private String country;
    private String description;

//    @Column(nullable = false, updatable = false)
//    private Date created_at;
//    @LastModifiedDate
//    private Date updated_at;
}
