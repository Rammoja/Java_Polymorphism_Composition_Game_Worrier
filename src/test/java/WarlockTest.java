
import Characters.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        this.warlock = new Warlock("Grimlock", "Dagger", 100,"Fireball","Ogre");
    }

    @Test
    public void canGetName() {
        assertEquals("Grimlock", warlock.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("Dagger", warlock.getWeapon());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canGetSpell(){
        assertEquals("Fireball",warlock.getSpell());
    }

    @Test
    public void canGetPet(){
        assertEquals("Ogre",warlock.getPet());
    }

    @Test
    public void canAddWeapon() {
        assertEquals(0, warlock.weaponCount());
        warlock.addWeapon("Axe");
        assertEquals(1, warlock.weaponCount());
    }

    @Test
    public void canSwitchWeapon() {
        warlock.addWeapon("Axe");
        assertEquals("Axe", warlock.drawWeapon());
    }

    @Test
    public void canAddSpell() {
        assertEquals(0, warlock.spellCount());
        warlock.addSpell("Tornado");
        assertEquals(1, warlock.spellCount());
    }

    @Test
    public void canSwitchSpell() {
        warlock.addSpell("Tornado");
        assertEquals("Tornado", warlock.changeSpell());
    }

    @Test
    public void canAddPet() {
        assertEquals(0, warlock.petCount());
        warlock.addPet("Demon");
        assertEquals(1, warlock.petCount());
    }

    @Test
    public void canSwitchPet() {
        warlock.addPet("Demon");
        assertEquals("Demon", warlock.changePet());
    }
}
