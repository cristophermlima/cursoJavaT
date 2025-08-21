package application;

// Importações necessárias para trabalhar com datas, exceções e entrada do usuário
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Importa a classe Reservation (entidade principal) e a exceção personalizada
import model.entites.Reservation;
import model.exceptions.DomainException;

// Essa versão demonstra um exemplo de tratamento de exceções em reservas de hotel
public class programException2 {

	public static void main(String[] args) {

		// Scanner para entrada de dados via terminal
		Scanner sc = new Scanner(System.in);

		// Formato usado para digitar e interpretar as datas no formato "dia/mês/ano"
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			// Lê o número do quarto
			System.out.print("Room number: ");
			int number = sc.nextInt();

			// Lê e converte a data de check-in
			System.out.print("Checkin date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());

			// Lê e converte a data de check-out
			System.out.print("Checkout date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());

			// Cria a reserva com os dados fornecidos
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);

			// Parte de atualização das datas da reserva
			System.out.println();
			System.out.println("Enter data to update the reservation: ");

			// Lê e converte nova data de check-in
			System.out.print("Checkin date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());

			// Lê e converte nova data de check-out
			System.out.print("Checkout date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());

			// Atualiza a reserva com as novas datas
			reservation.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reservation);
		} 

		// Captura erro de formatação de data (ex: "32/13/2025")
		catch (ParseException e) {
			System.out.println("Invalid date format");

		// Captura erro de regra de negócio (ex: check-out antes do check-in)
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());

		// Captura qualquer outro erro inesperado que não foi tratado acima
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		// Fecha o scanner após o uso
		sc.close();
	}
}
