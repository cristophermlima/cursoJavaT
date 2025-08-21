package model.entites;

// Importações para trabalhar com datas e cálculos de tempo
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Importa a exceção personalizada usada para validações
import model.exceptions.DomainException;

// Classe Reservation representa uma reserva de hotel
public class Reservation {

	// Atributos principais: número do quarto, data de entrada e saída
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	// Formato usado para exibir datas (dd/MM/yyyy)
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Construtor: inicializa os dados da reserva e faz uma validação inicial
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		// Regra de negócio: checkout deve ser depois do checkin
		if (!checkout.after(checkin)) {
			throw new DomainException("Error in reservation: Checkout date must be after");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	// Getter e setter para o número do quarto
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	// Getters para as datas de check-in e check-out
	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	// Calcula a duração da reserva em dias
	public long duration() {
		// Diferença em milissegundos entre checkout e checkin
		long diff = checkout.getTime() - checkin.getTime();
		
		// Converte a diferença de milissegundos para dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS); // ⚠️ Provavelmente era para ser TimeUnit.MILLISECONDS
	}

	// Atualiza as datas da reserva com nova validação
	public void updateDates(Date checkin, Date checkout) {
		Date now = new Date(); // Data atual (momento da execução)

		// Regra: não é permitido atualizar para datas no passado
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}

		// Regra: checkout deve ser depois do checkin
		if (!checkout.after(checkin)) {
			throw new DomainException("Error in reservation: Checkout date must be after");
		}

		// Atualiza as datas
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	// Método para exibir a reserva como texto (exibido no System.out.println)
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkin)
				+ ", checkout: "
				+ sdf.format(checkout)
				+ ", "
				+ duration()
				+ " nights";
	}
}
