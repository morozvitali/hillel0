package decorator.files;

//1 інтерфейс, просто запитує дані у сервера і повертає
public interface ExternalClient {
    //  єдиний метод у інтерфейсі
    Object requestDate (int userId) throws Exception;
}
