import static spark.Spark.get;

public class Routes {
    public void setup() {
        get("/index", (req, res) -> "HelloWorld");
    }
}
