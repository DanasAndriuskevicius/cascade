package lt.codeacademy.javau8.cascade.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Kursas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    @ManyToOne
    @JoinColumn(name = "destytojas_id")
    private Destytojas destytojas;
    @ManyToMany    @JoinTable( name = "studentas_kursas",
            joinColumns = @JoinColumn(name = "kursas_id"),
            inverseJoinColumns = @JoinColumn(name = "studentas_id")
    )
    private Set<Studentas> studentai = new HashSet<>();
    @OneToOne(mappedBy = "kursas", cascade = CascadeType.ALL)
    private Egzaminas egzaminas;

    public Kursas(){}

    public Kursas(String name) {
        this.name = name;
    }

    public Kursas(Long id, String name, Destytojas destytojas, Set<Studentas> studentai, Egzaminas egzaminas) {
        this.id = id;
        this.name = name;
        this.destytojas = destytojas;
        this.studentai = studentai;
        this.egzaminas = egzaminas;
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

    public Destytojas getDestytojas() {
        return destytojas;
    }

    public void setDestytojas(Destytojas destytojas) {
        this.destytojas = destytojas;
    }

    public Set<Studentas> getStudentai() {
        return studentai;
    }

    public void setStudentai(Set<Studentas> studentai) {
        this.studentai = studentai;
    }

    public Egzaminas getEgzaminas(Egzaminas matematikos) {
        return egzaminas;
    }

    public void setEgzaminas(Egzaminas egzaminas) {
        this.egzaminas = egzaminas;
    }

}
