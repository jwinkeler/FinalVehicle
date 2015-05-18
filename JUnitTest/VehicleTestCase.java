import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class VehicleTestCase {
static Car testCar;
static Person Beth = new Person("Beth", "Winkeler");
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	testCar = new Car("Nissan", "Brown", 900,  Beth, 2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		TestVehicle.vehicles.put(testCar.getOwner().getPersonID(), testCar);
	assertTrue(TestVehicle.vehicles.containsValue(testCar));
	}

}
