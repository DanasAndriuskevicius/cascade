package lt.codeacademy.javau8.cascade.entities;

import jakarta.persistence.*;

@Entity
public class Egzaminas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    Studentas studentas;
    @OneToOne
    @JoinColumn(name = "kursas_id")
    private Kursas kursas;

    public Egzaminas(){}


    public Egzaminas( String name) {
        this.name = name;
    }

    public Studentas getStudentas() {
        return studentas;
    }

    public void setStudentas(Studentas studentas) {
        this.studentas = studentas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kursas getKursas() {
        return kursas;
    }

    public void setKursas(Kursas kursas) {
        this.kursas = kursas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
