package junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstrings {

	@Test
	void test() {
		junitfunction junitString=new junitfunction();
		String result=junitString.addString("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
