package config;
import org.junit.BeforeClass;
import specification.RickyMortySpecification;

public class BaseClass {
    static final String URL="https://rickandmortyapi.com/api/";
    @BeforeClass
    public static void b(){
        RickyMortySpecification.createEMcpecification(URL);
    }
}