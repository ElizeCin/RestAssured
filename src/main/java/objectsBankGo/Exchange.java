package objectsBankGo;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Exchange {
    @JsonProperty("r030")
    public int property;
    public String txt;
    public double rate;
    public String cc;
    public String exchangedate;
}
