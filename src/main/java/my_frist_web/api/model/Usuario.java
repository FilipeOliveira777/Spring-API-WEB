package my_frist_web.api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String passaword;

    public Usuario(Integer id, String login, String passaword) {
        this.id = id;
        this.login = login;
        this.passaword = passaword;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passaword='" + passaword + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }
}
