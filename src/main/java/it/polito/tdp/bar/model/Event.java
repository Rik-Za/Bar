package it.polito.tdp.bar.model;

import java.time.Duration;

public class Event implements Comparable<Event>{	//necessario implementare il comparable per poter creare una CODA PRIORITARIA,
													//la priorità siamo noi a sceglierla (solitamente il tempo) così che la coda venga ordinata su questo attributo
	
	public enum EventType{		//tipologie di eventi
		ARRIVO_GRUPPO_CLIENT,
		TAVOLO_LIBERATO
	}
	
	private EventType type;	//Attributo singolo evento
	private Duration time;	//Andava bene anche int, vogliamo fare i fighi
	private int nPersone;
	private Duration durata;
	private double tolleranza;	//è una probabbilità
	private Tavolo tavolo;
	
	public Event(EventType type, Duration time, int nPersone, Duration durata, double tolleranza, Tavolo tavolo) {
		super();
		this.type = type;
		this.time = time;
		this.nPersone = nPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public Duration getTime() {
		return time;
	}

	public void setTime(Duration time) {
		this.time = time;
	}

	public int getnPersone() {
		return nPersone;
	}

	public void setnPersone(int nPersone) {
		this.nPersone = nPersone;
	}

	public Duration getDurata() {
		return durata;
	}

	public void setDurata(Duration durata) {
		this.durata = durata;
	}

	public double getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	@Override
	public int compareTo(Event o) {
		return this.time.compareTo(o.getTime());
	}
	 
	
	

}
