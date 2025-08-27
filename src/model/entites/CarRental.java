package model.entites;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finissh;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(LocalDateTime start, LocalDateTime finissh, Vehicle vehicle, Invoice invoice) {
		
		this.start = start;
		this.finissh = finissh;
		this.vehicle = vehicle;
		
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinissh() {
		return finissh;
	}

	public void setFinissh(LocalDateTime finissh) {
		this.finissh = finissh;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
