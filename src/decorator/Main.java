package decorator;

import decorator.files.ClientRetryDecorator;
import decorator.files.ExternalClient;
import decorator.files.MyApp;
import decorator.files.UserClient;

public class Main {
    public static void main(String[] args) {
        // передаємо нашому додатку клієнт через конструктор
        ExternalClient client = new UserClient();
        // передаємо наш створений кліент в нашу програму,
        //new MyApp(client);

        //тут для створення декоратора треба передати замість client -> new ClientRetryDecorator,
        //який огортає вже створений клієнт
        new MyApp(new ClientRetryDecorator(client));
    }
}
