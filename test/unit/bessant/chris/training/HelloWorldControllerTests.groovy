package bessant.chris.training

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloWorldController)
class HelloWorldControllerTests {

    void testHello() {
		// A really basic test
		controller.hello()
		assert response.text == 'hello'
    }
}
