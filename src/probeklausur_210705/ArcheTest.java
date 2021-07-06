package probeklausur_210705;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class ArcheTest {
    private final Arche<Tier> arche = new Arche<>();
    private final Arche<Tier> arche2 = new Arche<>();

    @Test
    public void insertTest() {
        // Prüfen ob create funktioniert hat
        Assertions.assertNotNull(arche);
        // Anzahl der Tiere vor dem einfügen
        Assertions.assertEquals(0, arche.getSize());
        // Ob nach dem Einfügen die Anzahl der Tiere in der Arche korrekt ist;
        Amsel amsel = new Amsel();
        Igel igel = new Igel();
        Hase hase = new Hase();
        arche.insert(amsel);
        arche.insert(igel);
        arche.insert(hase);

        Assertions.assertEquals(3,arche.getSize());
        // ob die maximale Kapazität der Arche den Erwartungen entspricht;
        // Aktuell 4
        Assertions.assertEquals(4, arche.getArraySize());

    }

    @Test
    public void removeTest() {
        Assertions.assertThrows(NoSuchElementException.class, arche2::remove);
    }
}
/**
 * @author kkazem2s - 9031334
 */