package ke.co.eshuttle.eshuttle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ke.co.eshuttle.eshuttle.EshuttleApp;
import ke.co.eshuttle.eshuttle.RedisTestContainerExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = EshuttleApp.class)
@ExtendWith(RedisTestContainerExtension.class)
public @interface IntegrationTest {
}
