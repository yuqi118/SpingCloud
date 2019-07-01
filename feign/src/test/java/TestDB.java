import com.yuqi.FeignApplication;
import com.yuqi.service.ApiService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/6/28 18:58
 * @Verstion 1.0
 */
@SpringBootTest(classes = FeignApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDB {

    @Resource
    private ApiService apiService;

    @Test
    public void test(){
        try {
            System.out.println(apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}