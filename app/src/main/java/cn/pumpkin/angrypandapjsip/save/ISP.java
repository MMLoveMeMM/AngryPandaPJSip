package cn.pumpkin.angrypandapjsip.save;

import java.util.Map;

public interface ISP {

    void putApply(String key, Object object);

    void putCommit(String key, Object object);

    Object get(String key, Object defaultObject);

    /**
     * 移除某个key值已经对应的值
     *
     * @param key
     */
    void remove(String key);

    /**
     * 清除所有的数据
     */
    void clear();

    /**
     * 查询某个key是否存在
     *
     * @param key
     * @return
     */
    boolean contains(String key);

    /**
     * 返回所有的键值对
     *
     * @return
     */
    Map<String, ?> getAll();
}
