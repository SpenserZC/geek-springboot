package com.zcforit.datasourcedemo;

import com.alibaba.druid.filter.FilterChain;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class ConnectionLogFilter extends FilterEventAdapter {
    @Override
    public void connection_after(FilterChain chain, Properties info) {
        log.info("connect after");
    }

    @Override
    public void connection_before(FilterChain chain, Properties info) {
        log.info("connection before");
    }
}
