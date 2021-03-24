package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka;

import java.util.LinkedList;
/**
 * Klasa koja predstavlja Knjigu.
 * 
 * Knjiga ima naslov, isbn, izdavaca kao String vrednosti, listu Autora i izdanje kao int vrednost.
 * @author Tamara Tosic
 * @version 1.0
 *
 */
public class Knjiga {
	/**
	 * Naslov knjige kao String vrednost.
	 */
	private String naslov;
	/**
	 * Lista autora knjige tipa klasa Autor.
	 */
	private LinkedList<Autor> autori;
	/**
	 * ISBN knjige kao String vrednost.
	 */
	private String isbn;
	/**
	 * Izdavac knjige kao String vrednost.
	 */
	private String izdavac;
	/**
	 * Izdanje knjige kao int vrednost.
	 */
	private int izdanje;
	/**
	 * @return Naslov knjige kao String vrednost.
	 */
	public String getNaslov() {
		return naslov;
	}
	/**
	 * Postavlja naslov knjige na novu vrednost. 
	 * 
	 * @param naslov Naslov knjige kao String vrednost.
	 */
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	/**
	 * 
	 * @return Lista autora knjige tipa klasa Autor.
	 */
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	/**
	 * Postavlja naslov knjige na novu vrednost.
	 * 
	 * @param autori Autori kao Lista autora knjige tipa klase Autor.
	 */
	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}
	/**
	 * 
	 * @return ISBN knjige kao String vrednost.
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * Postavlja isbn na novu vrednost.
	 * 
	 * @param isbn ISBN knjige kao String vrednost.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * 
	 * @return Izdavac knjige kao String vrednost.
	 */
	public String getIzdavac() {
		return izdavac;
	}
	/**
	 * Postavlja izdavaca knjige na novu vrednost.
	 * 
	 * @param izdavac Izdavac knjige kao String vrednost.
	 */
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	/**
	 * 
	 * @return Izdanje knjige kao int vrednost.
	 */
	public int getIzdanje() {
		return izdanje;
	}
	/**
	 * Postavlja izdanje knjige na novu vrednost.
	 * 
	 * @param izdanje Izdanje knjige kao int vrednost.
	 */
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	/**
	 * @return Vraca String sa svim podacima o knjizi.
	 */
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", autori=" + autori + ", isbn=" + isbn + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	/**
	 * 
	 * Poredi dve knjige i vraca true ako su iste, a false ako nisu.
	 * 
	 * Knjige se porede po isbn-u.
	 * 
	 * @return 
	 * <ul>
	 * 		<li>True ako su oba objekta klase Knjiga i imaju isti isbn.</li>
	 * 		<li>False u svim ostalim slucajevima.</li>
	 * </ul>
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	
}
