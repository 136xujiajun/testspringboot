package designPattern.templatemeth;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 模板方法模式
 */
public class TemplateTests {

    public void springTemplateTest() {
        RedisTemplate<String, String> redisTemplate = null;
        
        redisTemplate.execute(new RedisCallback<String>() {

            @Override
            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {

                return null;
            }
        });

    }


}
