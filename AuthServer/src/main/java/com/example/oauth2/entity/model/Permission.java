package com.example.oauth2.entity.model;

import javax.persistence.*;

/**
 * Created by NhanNguyen on 4/15/2021
 *
 * @author: NhanNguyen
 * @date: 4/15/2021
 */

@Entity(name = "dbo_permission")
public class Permission {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "permission_name")
    private String permissionName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}
