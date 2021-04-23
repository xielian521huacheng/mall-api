package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jingjing
 * @data 2021/4/23 9:29
 * @description MallUserMapperTest
 **/
@SpringBootTest
class MallUserMapperTest {
    @Resource
    private MallUserMapper mallUserMapper;

    @Test
    void selectByPrimaryKey() {
        MallUser mallUser = mallUserMapper.selectByPrimaryKey(1L);
        System.out.println(mallUser);
    }

    @Test
    void selectAll() {
        List<MallUser> mallUsers = mallUserMapper.selectAll();
        System.out.println(mallUsers);
    }

}