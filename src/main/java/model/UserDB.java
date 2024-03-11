package model;
import javax.persistence.*;

@Entity
@Table (name = "user")


public class UserDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idUser")
    private String idUser;

    @Column (name= "username")
    private String username;
    @Column(name= "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private RoleDB roleId;


    public UserDB() {

    }


    //getters and setters
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleDB getRole() {
        return roleId;
    }

    public void setRole(RoleDB roleId) {
        this.roleId = roleId;
    }
}
