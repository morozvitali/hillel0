package decorator.files;


public class MyApp {
    // цей клас користується клієнтом ExternalClent
    private ExternalClient client;

    public MyApp(ExternalClient client) {
        this.client = client;
    }

    //також є метод, у якому беруться данні за цим клієнтом
    public void doSomething () {
        //Для поточного юзера ми беремо його данні
        try {
            Object o = client.requestDate(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}