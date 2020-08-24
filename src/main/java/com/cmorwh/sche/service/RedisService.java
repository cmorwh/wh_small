package com.cmorwh.sche.service;

/**
 * Created on 2020/8/24 11:31 with IDEA
 * author: wh
 * Description:
 */
public interface RedisService {
    /*
    存储数据
     */
    void set(String key,String value,long time);

    /*
    获取数据
    */
    String get(String key);

    /*
    是否超时
   */
    boolean expire(String key,long expire);

    /*
    * 移除数据
    * */
    void remove(String key);

    /*
    * 自增长
    * */
    Long increment(String key,long delta);
}
