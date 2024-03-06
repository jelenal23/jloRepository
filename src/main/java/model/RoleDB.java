package model;

import javax.persistence.*;

@Entity
@Table(name = "role")

public class RoleDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "roleId")
    private int roleId;

    @Column (name = "roleName")
    private String roleName;

    public RoleDB() {
    }


    //geteri i seteri
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}


