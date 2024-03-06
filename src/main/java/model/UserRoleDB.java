package model;

import javax.persistence.*;

@Entity
@Table(name = "userRole")

@IdClass(UserRoleId.class) //jer nemam pravi id u ovoj tabeli pa se bunio, jpa mora imati id
//ovde pravim id pridruzene kljuceve


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

    //geteri i seteri
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
