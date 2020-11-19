package com.zcforit.datasourcedemo;

import com.alibaba.druid.filter.FilterAdapter;
import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;

import java.sql.SQLException;
import java.util.Properties;

public abstract class FilterEventAdapter extends FilterAdapter {

    @Override
    public ConnectionProxy connection_connect(FilterChain chain, Properties info) throws SQLException {
        connection_before(chain,info);
        ConnectionProxy connectionProxy = super.connection_connect(chain, info);
        connection_after(chain, info);
        return connectionProxy;
    }

    public void connection_before(FilterChain chain, Properties info){

    }

    public void connection_after(FilterChain chain, Properties info){

    }
}
