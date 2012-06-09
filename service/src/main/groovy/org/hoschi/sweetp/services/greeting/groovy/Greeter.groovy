package org.hoschi.sweetp.services.greeting.groovy

import groovy.json.JsonBuilder

/**
 * Class to generate greetings.
 */
class Greeter {
	/**
	 * Service config for this service.
	 */
	final String config

	Greeter() {
		JsonBuilder json = new JsonBuilder([
				['/tests/service/groovy/sayhello': [
						method: 'sayHello'
				]],
				['/tests/service/groovy/greet': [
						method: 'greet',
						params: [name: 'one']
				]]
		])
		config = json.toString()
	}

	/**
	 * Say hello world.
	 *
	 * @return Hello World!
	 */
	String sayHello() {
		'Hello World!'
	}

	/**
	 * Greet person with name.
	 *
	 * @param params with name of person to greet
	 * @return Hello person! I'm groovy
	 *
	 */
	String greet(Map params) {
		assert params.containsKey('name')
		"Hello $params.name! I'm groovy"
	}
}
