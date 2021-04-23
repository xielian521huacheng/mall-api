package online.danbao.mall.api;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = {"online.danbao.mall.api.mapper"})
class MallApiApplicationTests {

    @Test
    void contextLoads() {
    }

}
