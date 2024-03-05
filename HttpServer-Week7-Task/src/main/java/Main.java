import service.impl.HttpServiceImpl;
import static network.HttpServer.PORT;

public class Main {

    public static void main(String[] args) {
        HttpServiceImpl service = new HttpServiceImpl();

        service.start(PORT);
    }
}
