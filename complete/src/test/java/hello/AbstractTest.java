package hello;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


/**
 * Created by J.Wolter on 17.09.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= MyConfiguration.class,
        loader=AnnotationConfigContextLoader.class)
public abstract class AbstractTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

}
