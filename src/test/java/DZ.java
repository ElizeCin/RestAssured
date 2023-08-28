import objectsBankGo.Exchange;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static io.restassured.RestAssured.when;

@RunWith(Parameterized.class)
public class DZ {
    static Exchange exchange;
    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList("USD","CAD","MXN");
    }

    public DZ(String string) {
        exchange = when()
                .get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=" +string+"&json")
                .then()
                .extract()
                .jsonPath().getList(".",Exchange.class)
                .get(0);
    }
    @Test
    public void test() {

        System.out.println(exchange.cc + " = " + exchange.rate);
    }
}
