import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Usuario {

    List<String> email_cadastrado = new ArrayList(Collections.singleton("matheus@gmail.com"));
    ArrayList senha_cadastrado = new ArrayList(Collections.singleton("X123456X"));
    ArrayList<String> usuario = new ArrayList(Collections.singleton("matheus"));

    private String nome_usuario;
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
