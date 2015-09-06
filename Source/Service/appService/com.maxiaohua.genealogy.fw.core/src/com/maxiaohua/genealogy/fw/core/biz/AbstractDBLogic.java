package com.maxiaohua.genealogy.fw.core.biz;

import com.maxiaohua.genealogy.fw.core.dao.QueryDAO;
import com.maxiaohua.genealogy.fw.core.dao.UpdateDAO;
import com.maxiaohua.genealogy.fw.core.memory.db.QueryKeyValue;
import com.maxiaohua.genealogy.fw.core.memory.db.UpdateKeyValue;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;


public abstract class AbstractDBLogic extends AbstractLogic {
    
    @AutoInject(name = "queryDAO")
    protected QueryDAO queryDAO;

    
    @AutoInject(name = "updateDAO")
    protected UpdateDAO updateDAO;
    
    
    @AutoInject(name = "queryKeyValue")
    protected QueryKeyValue queryKeyValue;

    
    @AutoInject(name = "updateKeyValue")
    protected UpdateKeyValue updateKeyValue;
}