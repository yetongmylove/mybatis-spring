MyBatis Spring Adapter
======================

[![Build Status](https://travis-ci.org/mybatis/spring.svg?branch=master)](https://travis-ci.org/mybatis/spring)
[![Coverage Status](https://coveralls.io/repos/mybatis/spring/badge.svg?branch=master&service=github)](https://coveralls.io/github/mybatis/spring?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/5619b698a193340f2f000520/badge.svg?style=flat)](https://www.versioneye.com/user/projects/5619b698a193340f2f000520)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-spring/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-spring)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

![mybatis-spring](http://mybatis.github.io/images/mybatis-logo.png)

MyBatis-Spring adapter is an easy-to-use Spring3 bridge for MyBatis sql mapping framework.

Supported Versions
------------------

- 1.3.x - Continued support for Java 6
- master (2.0.x) - Support for Java 8, Spring 5, and Junit 5 plus other java 8 requirements

Essentials
----------

* [See the docs](http://mybatis.github.io/spring/)

# 个人博客

[http://www.iocoder.cn](http://www.iocoder.cn/?github)

-------

![](http://www.iocoder.cn/images/common/wechat_mp.jpeg)

> 🙂🙂🙂关注**微信公众号：【芋艿的后端小屋】**有福利：  
> 1. RocketMQ / MyCAT / Sharding-JDBC **所有**源码分析文章列表  
> 2. RocketMQ / MyCAT / Sharding-JDBC **中文注释源码 GitHub 地址**  
> 3. 您对于源码的疑问每条留言**都**将得到**认真**回复。**甚至不知道如何读源码也可以请教噢**。  
> 4. **新的**源码解析文章**实时**收到通知。**每周更新一篇左右**。

-------

* 知识星球：![知识星球](http://www.iocoder.cn/images/Architecture/2017_12_29/01.png)

* 数据持久层框架 **MyBatis**

    * [《精尽 MyBatis 面试题》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 调试环境搭建》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 项目结构一览》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 解析器模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 反射模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 异常模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 数据源模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 事务模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 缓存模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 类型模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— IO 模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 日志模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 注解模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— Binding 模块》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— MyBatis 初始化（一）之加载 mybatis-config》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— MyBatis 初始化（二）之加载 Mapper 映射配置文件》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— MyBatis 初始化（三）之加载 Statement 配置》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— MyBatis 初始化（四）之加载注解配置》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 初始化（上）之 SqlNode》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 初始化（下）之 SqlSource》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 执行（一）之 Executor》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 执行（二）之 StatementHandler》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 执行（三）之 KeyGenerator》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 执行（四）之 ResultSetHandler》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— SQL 执行（五）之延迟加载》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 会话 SqlSession》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 插件体系（一）之原理》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码分析 —— 插件体系（二）之 PageHelper》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码解析 —— Spring 集成（一）之调试环境搭建》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码解析 —— Spring 集成（二）之初始化》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码解析 —— Spring 集成（三）之 SqlSession》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码解析 —— Spring 集成（四）之事务》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
    * [《精尽 MyBatis 源码解析 —— Spring 集成（五）之批处理》](http://www.iocoder.cn/MyBatis/good-collection?github&1613)
