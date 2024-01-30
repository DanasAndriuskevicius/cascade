package lt.codeacademy.javau8.cascade;

import lt.codeacademy.javau8.cascade.entities.Destytojas;
import lt.codeacademy.javau8.cascade.entities.Egzaminas;
import lt.codeacademy.javau8.cascade.entities.Kursas;
import lt.codeacademy.javau8.cascade.entities.Studentas;
import lt.codeacademy.javau8.cascade.repositories.DestytojasRepository;
import lt.codeacademy.javau8.cascade.repositories.EgzaminasRepository;
import lt.codeacademy.javau8.cascade.repositories.KursasRepository;
import lt.codeacademy.javau8.cascade.repositories.StudentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoder implements CommandLineRunner {
    @Autowired
    StudentasRepository sr;
    @Autowired
    DestytojasRepository dr;
    @Autowired
    EgzaminasRepository er;
    @Autowired
    KursasRepository kr;

@Override
public void run(String... args)throws Exception{
    metodas();

}

public void metodas() {

    Studentas andrius = new Studentas("Andrius");
    Studentas jadvyga = new Studentas("Jadvyga");
    Studentas kestas = new Studentas("Kestas");

    Destytojas bagdonas = new Destytojas("Bgdonas");
    Destytojas tvarijonas = new Destytojas("Tvarijonas");
    Destytojas vytautas = new Destytojas("Vytautas");

    Kursas pirmasKursas = new Kursas("Pirmas kursas");
    Kursas antrasKursas = new Kursas("Antras kursas");
    Kursas treciasKursas = new Kursas("Trecias kursas");

    Egzaminas matematikos = new Egzaminas("Matematikos");
    Egzaminas fizikos = new Egzaminas("Fizikos");
    Egzaminas chemijos = new Egzaminas("Chemijos");


    andrius.getKursai().add(pirmasKursas);
    jadvyga.getKursai().add(antrasKursas);
    kestas.getKursai().add(treciasKursas);

    bagdonas.getKursai().add(pirmasKursas);
    tvarijonas.getKursai().add(antrasKursas);
    vytautas.getKursai().add(treciasKursas);

    pirmasKursas.setEgzaminas(matematikos);
    pirmasKursas.setEgzaminas(chemijos);
    antrasKursas.setEgzaminas(fizikos);

    matematikos.setStudentas(andrius);
    fizikos.setStudentas(jadvyga);
    chemijos.setStudentas(kestas); 


    sr.saveAll(Arrays.asList(andrius, jadvyga, kestas));
    dr.saveAll(Arrays.asList(bagdonas, tvarijonas, vytautas));
    kr.saveAll((Arrays.asList(pirmasKursas, antrasKursas, treciasKursas)));
    er.saveAll((Arrays.asList(matematikos, fizikos, chemijos)));

    }

}
