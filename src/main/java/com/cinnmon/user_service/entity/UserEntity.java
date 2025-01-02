package com.cinnmon.user_service.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.xml.crypto.Data;

@Entity
@Table(name = "users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Data createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Data updatedAt;
}
