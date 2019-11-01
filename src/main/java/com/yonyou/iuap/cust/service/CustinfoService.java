package com.yonyou.iuap.cust.service;
import com.yonyou.iuap.baseservice.intg.service.GenericIntegrateService;
import com.yonyou.iuap.baseservice.intg.support.ServiceFeature;
import com.yonyou.uap.busilog.annotation.LogConfig;
import com.yonyou.iuap.cust.dao.CustinfoMapper;
import com.yonyou.iuap.cust.entity.Custinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import cn.hutool.core.date.DateUtil;

import static com.yonyou.iuap.baseservice.intg.support.ServiceFeature.*;
@Service("com.yonyou.iuap.cust.service.CustinfoService")

/**
 * Custinfo CRUD 核心服务,提供逻辑删除/乐观锁
 */
public class CustinfoService extends GenericIntegrateService<Custinfo>{


    private CustinfoMapper custinfoMapper;

    @Autowired
    public void setCustinfoMapper(CustinfoMapper custinfoMapper) {
        this.custinfoMapper = custinfoMapper;
        super.setGenericMapper(custinfoMapper);
    }


    @Override
    @LogConfig(busiCode = "custinfo_insertSelective", busiName = "客户信息", operation = "客户信息保存", templateId = "custinfo_insertSelective")
    public Custinfo insertSelective(Custinfo entity) {
        return super.insertSelective(entity);
    }

    @Override
    @LogConfig(busiCode = "custinfo_updateSelective", busiName = "客户信息", operation = "客户信息修改", templateId = "custinfo_updateSelective")
    public Custinfo updateSelective(Custinfo entity) {
        return super.updateSelective(entity);

    }
    @LogConfig(busiCode = "custinfo_saveMultiple", busiName = "客户信息", operation = "客户信息批量保存", templateId = "custinfo_saveMultiple")
    public void saveBatch(List<Custinfo> listData) {
        super.saveBatch(listData);
    }

    @Override
    @LogConfig(busiCode = "custinfo_deleteBatch", busiName = "客户信息", operation = "客户信息删除", templateId = "custinfo_deleteBatch")
    public int deleteBatch(List<Custinfo> list) {
        return super.deleteBatch(list);
    }


    /**
     * @CAU 可插拔设计
     * @return 向父类 GenericIntegrateService 提供可插拔的特性声明
     */
    @Override
    protected ServiceFeature[] getFeats() {
        return new ServiceFeature[]{ I18N_ENUM,UNION_REFERENCE,LOGICAL_DEL };
    }
}