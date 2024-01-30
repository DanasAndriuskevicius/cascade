package lt.codeacademy.javau8.cascade.entities;

import jakarta.persistence.*;
import lt.codeacademy.javau8.cascade.entities.Kursas;

import java.util.HashSet;
import java.util.Set;

@Entity
    public class Studentas {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        String name;

        @ManyToMany(mappedBy = "studentai")
        private Set<Kursas> kursai = new HashSet<>();

        public Studentas(){}

    public Studentas(String name) {
        this.name = name;
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
