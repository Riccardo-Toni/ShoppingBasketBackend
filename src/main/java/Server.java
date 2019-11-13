import spark.Spark;

public class Server {
    public Server() {
    }

    public void startOn(int port) {
        Spark.port(port);
        new Routes().setup();
    }
}
