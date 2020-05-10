package junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		junitfunction junit=new junitfunction();
		int result=junit.addNum(100,200);
		assertEquals(300,result);
	}

}
