package model;

import javax.persistence.*;

@Entity
@Table(name = "rolePermission")

@IdClass(RolePermissionId.class) //pravim kompozitni kljuc.
//jpa mora imati id

public class RolePermissionDB {

    @Id
    @ManyToOne
    @JoinColumn(name = "roleId")
    private RoleDB roleId;

    @Id
    @ManyToOne
    @JoinColumn(name = "permissionId")
    private PermissionDB permissionId;

    public RolePermissionDB() {
    }

 //geteri i seteri
    public RoleDB getRoleId() {
        return roleId;
    }

    public void setRoleId(RoleDB roleId) {
        this.roleId = roleId;
    }

    public PermissionDB getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(PermissionDB permissionId) {
        this.permissionId = permissionId;
    }
}
