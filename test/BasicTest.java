import org.junit.*;

import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {
	
	@Before
	public void setup() {
		Fixtures.deleteDatabase();
	}

    @Test
    public void createUserAndAddresses() {
        User bob = new User();
        bob.setName("Bob");
        bob.setPhoneNumber(123456789);
        bob.save();
        Address address1 = new Address();
        Address address2 = new Address();        
        address1.InitializeAddress("123 High Street", "England", "E34PE");
        address2.InitializeAddress("567 Loud Street", "England", "H73Q9");
        bob.addAddress(address1);
        bob.addAddress(address2);
        bob.save();
    	assertEquals(2, bob.getAddresses().size());
    }

}
