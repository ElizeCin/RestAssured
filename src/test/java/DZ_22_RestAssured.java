import config.BaseClass;
import org.junit.Test;

import static io.restassured.RestAssured.when;

public class DZ_22_RestAssured extends BaseClass {
    @Test
    public void testShowAllDimension() {
        for (String l :
                when().get("location").then().extract().jsonPath().getList("results.dimension", String.class)) {
            System.out.println(l);
        }
    }
}
