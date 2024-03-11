package model;

import javax.persistence.*;

@Entity
@Table(name = "permission")

public class PermissionDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permissionId")
    private int permissionId;

    @Column(name = "permissionFun")
    private String permissionFun;

    public PermissionDB() {
    }

    //geters and setters

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionFun() {
        return permissionFun;
    }

    public void setPermissionFun(String permissionFun) {
        this.permissionFun = permissionFun;
    }
}
