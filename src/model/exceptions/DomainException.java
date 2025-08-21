package model.exceptions;

// Classe de exceção personalizada que herda de RuntimeException
public class DomainException extends RuntimeException {

    // Número de identificação da versão da classe para fins de serialização
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem e repassa para a superclasse (RuntimeException)
    public DomainException(String msg) {
        super(msg); // Define a mensagem de erro que será acessível por getMessage()
    }

}
