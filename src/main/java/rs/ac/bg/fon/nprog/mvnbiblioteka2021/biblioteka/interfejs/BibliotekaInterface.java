package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.interfejs;

import java.util.LinkedList;

import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Knjiga;
/**
 * Interfejs koji predstavlja biblioteku. 
 * 
 * @author Tamara Tosic
 *
 */
public interface BibliotekaInterface {
	/**
	 * Dodaje novu knjigu u biblioteku.
	 * 
	 * @param knjiga Knjiga koja se dodaje.
	 * 
	 * @throws java.lang.NullPointerException Ako je uneta knjiga null.
	 * @throws java.lang.RuntimeException Ako uneta knjiga vec postoji u biblioteci (duplikat).
	 * 
	 */
	/**
	 * 
	 * @param knjiga Dodaje novu knjigu.
	 */
	public void dodajKnjigu(Knjiga knjiga);
	/**
	 * 
	 * @param knjiga Brise knjigu.
	 */
	public void obrisiKnjigu(Knjiga knjiga);
	/**
	 * 
	 * @return Lista svih knjiga.
	 */
	public LinkedList<Knjiga> vratiSveKnjige();
	/**
	 * 
	 * @param autor Autor knjige tipa klase Autor.
	 * @param isbn ISBN knjige tipa int.
	 * @param naslov Naslov knjige tipa String.
	 * @param izdavac Izdavac knjige tipa String.
	 * @return Lista svih knjiga koje zadovoljavaju kriterijum pretrage. 
	 */
	public LinkedList<Knjiga> pronadjiKnjigu(
			Autor autor,
			String isbn,
			String naslov,
			String izdavac
			);
}
