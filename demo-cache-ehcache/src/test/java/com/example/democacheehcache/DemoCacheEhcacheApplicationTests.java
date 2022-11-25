package com.example.democacheehcache;

import com.example.democacheehcache.entity.User;
import com.example.democacheehcache.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoCacheEhcacheApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads( ) {
        User user = userService.get(1l);
        log.debug("【user1】= {}", user);
        User user1 = userService.get(1l);
        log.info("【user1】= {}", user1);
    }
    @Test
    public void getAfterSave() {
        userService.saveOrUpdate(new User(4L, "user4"));

        User user = userService.get(4L);
        log.debug("【user】= {}", user);
        // 查看日志，只打印保存用户的日志，查询是未触发查询日志，因此缓存生效
    }

    /**
     * 测试删除，看ehcache中存在缓存数据
     */
    @Test
    public void deleteUser() {
        // 查询一次，使ehcache中存在缓存数据
        userService.get(1L);
        // 删除，查看ehcache是否存在缓存数据
        userService.delete(1L);
    }

}
