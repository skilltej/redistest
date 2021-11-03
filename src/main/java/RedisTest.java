import io.lettuce.core.*;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import java.util.*;

class RedisTest{
    public static void main(String[] args){
        System.out.println("hello world!");
        //redis2.atsxeu.0001.use2.cache.amazonaws.com:6379
        RedisClient redisClient = RedisClient.create("redis://redis2.atsxeu.0001.use2.cache.amazonaws.com:6379/0");
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String, String> syncCommands = connection.sync();

        syncCommands.set("key", "Hello, Redis!");

        connection.close();
        redisClient.shutdown();
        System.out.println("exit working!");
    }
}