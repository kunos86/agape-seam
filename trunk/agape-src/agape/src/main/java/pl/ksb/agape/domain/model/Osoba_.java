package pl.ksb.agape.domain.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.ksb.agape.domain.model.dict.RodzajKonta;

@Generated(value="Dali", date="2013-01-12T20:01:56.193+0100")
@StaticMetamodel(Osoba.class)
public class Osoba_ {
	public static volatile SingularAttribute<Osoba, Long> id;
	public static volatile SingularAttribute<Osoba, String> imie;
	public static volatile SingularAttribute<Osoba, String> nazwisko;
	public static volatile SingularAttribute<Osoba, String> email;
	public static volatile SingularAttribute<Osoba, String> haslo;
	public static volatile SingularAttribute<Osoba, RodzajKonta> rodzajKonta;
	public static volatile SingularAttribute<Osoba, String> wojewodztwo;
	public static volatile SingularAttribute<Osoba, String> adres;
	public static volatile SingularAttribute<Osoba, Date> dataUr;
	public static volatile SingularAttribute<Osoba, Date> dataRej;
	public static volatile SingularAttribute<Osoba, String> status;
	public static volatile SingularAttribute<Osoba, String> wspolnota;
	public static volatile SingularAttribute<Osoba, String> wyznanie;
}
