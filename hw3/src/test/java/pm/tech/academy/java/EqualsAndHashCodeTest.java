package pm.tech.academy.java;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EqualsAndHashCodeTest {
    // see CustomEntity's todos

    @Test
    public void test() {
        String email = "bobby@meta.ua";
        SiteUser entity1 = new SiteUser(email, "Bobby", LocalDate.of(1991, 5, 12));
        SiteUser entity2 = new SiteUser("bobby@meta.ua", "Bobby D", LocalDate.of(1994, 7, 1));
        SiteUser entity3 = new SiteUser(email, "Bobby", LocalDate.of(1991, 5, 8));
        SiteUser entity4 = new SiteUser("dobby@meta.ua", "Bobby", LocalDate.of(2001, 12, 15));
        SiteUser entity5 = new SiteUser(email, null, null);

        // equals
        assertNotEquals(entity1, entity2);
        assertEquals(entity1, entity3);
        assertEquals(entity3, entity1);
        assertNotEquals(entity5, entity1);
        assertNotEquals(entity1, entity5);
        assertNotEquals(entity1, null);
        assertNotEquals(entity1, entity4);
        // hashCode
        assertNotEquals(entity1.hashCode(), entity2.hashCode());
        assertEquals(entity1.hashCode(), entity3.hashCode());
        assertNotEquals(entity2.hashCode(), entity3.hashCode());
        assertNotEquals(entity5.hashCode(), entity1.hashCode());
        assertNotEquals(entity1.hashCode(), entity4.hashCode());
    }
}
