package model;

import java.io.Serializable;

public class RolePermissionId implements Serializable {
    private int roleId;
    private int permissionId;

    public RolePermissionId() {
    }

    public RolePermissionId(int roleId, int permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }
}
