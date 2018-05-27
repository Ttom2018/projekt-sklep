package pliki;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;

import java.io.File;

public class plikiJson implements OperacjePlikowe{
    public void zapisz(Sklep sklep) throws Exception{
        ObjectMapper mapper= new ObjectMapper();
        mapper
                .writerWithDefaultPrettyPrinter()
               .writeValue(new File("sklep.json"),sklep);
    }
    public Sklep wczytaj() throws Exception{
        ObjectMapper mapper= new ObjectMapper();
        Sklep sklep =mapper.readValue(new File("sklep.json"), Sklep.class);
        return sklep;
    }
}