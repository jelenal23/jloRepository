package model;

import javax.persistence.*;

@Entity
@Table(name = "userRole")

// jpa must have an id field. this table don't have real id column, just foreign keys so
//I have to make an id composite key with this two columns
@IdClass(UserRoleId.class)


public class UserRoleDB {

    @Id
    @ManyToOne
    @JoinColumn(name = "idUser")
    private UserDB iduser;

    @Id
    @ManyToOne
    @JoinColumn(name = "roleId")
    private RoleDB roleId;

    public UserRoleDB() {
    }

    //getters and setters
    public UserDB getIduser() {
        return iduser;
    }

    public void setIduser(UserDB iduser) {
        this.iduser = iduser;
    }

    public RoleDB getRoleId() {
        return roleId;
    }

    public void setRoleId(RoleDB roleId) {
        this.roleId = roleId;
    }
}
