package com.flyl.liveback.dao;

import com.flyl.liveback.model.Account;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * Created by fangzhipeng on 2017/4/20.
 */

@SqlResource("account")
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
