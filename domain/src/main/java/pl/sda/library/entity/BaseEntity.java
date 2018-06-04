package pl.sda.library.entity;


import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column (name = "id" , updatable = false, nullable = false)
    private Long id;
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
