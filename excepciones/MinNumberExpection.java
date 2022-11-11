package excepciones;

public class MinNumberExpection extends RuntimeException {

    public MinNumberExpection() {
    }

    public MinNumberExpection(String message) {
        super(message);
    }

}
