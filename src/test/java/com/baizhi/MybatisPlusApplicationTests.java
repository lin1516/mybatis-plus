package com.baizhi;

import com.baizhi.dao.SpotDao;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.Spot;
import com.baizhi.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(classes = MybatisPlusApplication.class)
@RunWith(SpringRunner.class)
class MybatisPlusApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Test
    public void testDataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
    @Resource
   private UserDao userDao;
    @Resource
    private SpotDao spotDao;
    /**
     * 分页查询
     * @param page
     * @return
     */
    @Test
    public void findByPage(Page<Spot> page) {
        IPage<Spot> page1 = spotDao.selectPage(page, new QueryWrapper<Spot>());
        System.out.println("page1 = " + page1);

    }
        @Test
    public void testInsert(){
        User user = new User();
        //Spot spot = spotDao.selectById("");
        int integer = spotDao.selectCount(new QueryWrapper<Spot>());
        //mybatisplus会自动把当前插入对象在数据库中的id写回到该实体中

    //  spotDao.selectPage(,new QueryWrapper<Spot>());
        System.out.println();
    }
}
