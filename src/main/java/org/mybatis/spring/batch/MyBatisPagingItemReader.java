/**
 * Copyright 2010-2017 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mybatis.spring.batch;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.batch.item.database.AbstractPagingItemReader;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.springframework.util.Assert.notNull;
import static org.springframework.util.ClassUtils.getShortName;

/**
 * {@code org.springframework.batch.item.ItemReader} for reading database
 * records using MyBatis in a paging fashion.
 * <p>
 * Provided to facilitate the migration from Spring-Batch iBATIS 2 page item readers to MyBatis 3.
 *
 * 基于分页的 MyBatis 的读取器
 *
 * @author Eduardo Macarron
 *
 * @since 1.1.0
 */
public class MyBatisPagingItemReader<T> extends AbstractPagingItemReader<T> {

    /**
     * SqlSessionFactory 对象
     */
    private SqlSessionFactory sqlSessionFactory;
    /**
     * SqlSessionTemplate 对象
     */
    private SqlSessionTemplate sqlSessionTemplate;
    /**
     * 查询编号
     */
    private String queryId;
    /**
     * 参数值的映射
     */
    private Map<String, Object> parameterValues;

    public MyBatisPagingItemReader() {
        setName(getShortName(MyBatisPagingItemReader.class));
    }

    /**
     * Public setter for {@link SqlSessionFactory} for injection purposes.
     *
     * @param sqlSessionFactory a factory object for the {@link SqlSession}.
     */
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /**
     * Public setter for the statement id identifying the statement in the SqlMap
     * configuration file.
     *
     * @param queryId the id for the statement
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * The parameter values to be used for the query execution.
     *
     * @param parameterValues the values keyed by the parameter named used in
     * the query string.
     */
    public void setParameterValues(Map<String, Object> parameterValues) {
        this.parameterValues = parameterValues;
    }

    /**
     * Check mandatory properties.
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        // 父类的处理
        super.afterPropertiesSet();
        notNull(sqlSessionFactory, "A SqlSessionFactory is required.");
        // 创建 SqlSessionTemplate 对象
        sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory, ExecutorType.BATCH);
        notNull(queryId, "A queryId is required.");
    }

    @Override
    protected void doReadPage() {
        // 创建 parameters 参数
        Map<String, Object> parameters = new HashMap<>();
        if (parameterValues != null) {
            parameters.putAll(parameterValues);
        }
        // 设置分页
        parameters.put("_page", getPage());
        parameters.put("_pagesize", getPageSize());
        parameters.put("_skiprows", getPage() * getPageSize());
        // 清空目前的 results 结果
        if (results == null) {
            results = new CopyOnWriteArrayList<>();
        } else {
            results.clear();
        }
        // 查询结果
        results.addAll(sqlSessionTemplate.selectList(queryId, parameters));
    }

    @Override
    protected void doJumpToPage(int itemIndex) {
        // Not Implemented
    }

}