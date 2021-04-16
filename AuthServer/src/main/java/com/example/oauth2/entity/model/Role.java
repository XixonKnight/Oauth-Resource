package com.example.oauth2.entity.model;

import javax.persistence.*;

/**
 * Created by NhanNguyen on 4/15/2021
 *
 * @author: NhanNguyen
 * @date: 4/15/2021
 */
@Entity(name = "dbo_role")
public class Role {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "role_name")
    private String roleName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
