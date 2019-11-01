package com.yonyou.iuap.cust.dao;
import com.yonyou.iuap.cust.entity.Custinfo;
import com.yonyou.iuap.baseservice.persistence.mybatis.mapper.GenericExMapper;
import com.yonyou.iuap.baseservice.persistence.mybatis.mapper.GenericMapper;
import com.yonyou.iuap.mybatis.anotation.MyBatisRepository;
import org.springframework.stereotype.Component;


@MyBatisRepository
@Component("com.yonyou.iuap.cust.dao.CustinfoMapper")
public interface CustinfoMapper extends GenericExMapper<Custinfo> {
}

