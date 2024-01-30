package lt.codeacademy.javau8.cascade.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Destytojas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;

    @OneToMany(mappedBy = "destytojas", cascade = CascadeType.ALL)
    private Set<Kursas> kursai = new HashSet<>();
    // ... kitos savybės ir metodai ...}

    public Destytojas(){}

    public Destytojas(String name) {
        this.name = name;
    }

    public Destytojas(Long id, String name, Set<Kursas> kursai) {
        this.id = id;
        this.name = name;
        this.kursai = kursai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Kursas> getKursai() {
        return kursai;
    }

    public void setKursai(Set<Kursas> kursai) {
        this.kursai = kursai;
    }
}
