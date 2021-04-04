package generators;

public interface Generator<T> {

    String generateParams(int code);

    String buildResponse();
}
