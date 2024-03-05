import service.impl.HttpServiceImpl;
import static common.HttpServer.PORT;

public class Main {

    public static void main(String[] args) {
        HttpServiceImpl service = new HttpServiceImpl();

        service.start(PORT);
    }
}
