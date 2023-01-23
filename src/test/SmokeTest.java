import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.retailer.rewards.controller.RewardsController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

	@Autowired
	private RewardsController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void contextLoads() {
	}

}