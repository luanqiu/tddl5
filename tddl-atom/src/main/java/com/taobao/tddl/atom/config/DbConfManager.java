package com.taobao.tddl.atom.config;

import com.taobao.tddl.common.exception.TddlException;
import com.taobao.tddl.config.ConfigDataListener;

/**
 * TAtom数据源全局和应用的配置管理接口定义
 * 
 * @author qihao
 */
public interface DbConfManager {

    /**
     * 获取全局配置
     * 
     * @return
     */
    public String getGlobalDbConf();

    /**
     * 获取应用配置
     * 
     * @return
     */
    public String getAppDbDbConf();

    /**
     * 注册全局配置监听
     * 
     * @param Listener
     */
    public void registerGlobalDbConfListener(ConfigDataListener Listener);

    /**
     * 注册应用配置监听
     * 
     * @param Listener
     */
    public void registerAppDbConfListener(ConfigDataListener Listener);

    /**
     * 停止DbConfManager
     */
    public void stopDbConfManager() throws TddlException;
}
