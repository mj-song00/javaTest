package com.sparta.domain.users.entity;

import com.sparta.domain.users.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name="users")
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String nickname;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public Users(String email, String nickname, String password, UserRole userRole){
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.userRole = userRole;
    }

}
