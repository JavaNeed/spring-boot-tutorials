package eu.kielczewski.example.domain;

import java.io.Serializable;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @NotNull
    @Size(max = 64, min = 3)
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @NotNull
    @Size(max = 64, min = 3)
    @Column(name = "password", nullable = false)
    private String password;

    public User() {    }

    public User(final String id, final String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("password", password)
                .toString();
    }
}
