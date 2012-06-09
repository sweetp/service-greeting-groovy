package org.hoschi.sweetp.services.greeting.groovy

import org.junit.Test

class GreeterTest {
	@Test
	void testHelloWorld() {
		def greeter = new Greeter()
		assert 'Hello World!' == greeter.sayHello()
	}

	@Test
	void testGreetingWithName() {
		def greeter = new Greeter()
		assert "Hello John! I'm groovy" == greeter.greet([name: 'John'])
	}
}
