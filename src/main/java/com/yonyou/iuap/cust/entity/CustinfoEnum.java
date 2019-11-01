package com.yonyou.iuap.cust.entity;

import com.yonyou.iuap.baseservice.intg.ext.I18nEnum;
import com.yonyou.iuap.pap.base.i18n.MessageSourceUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * 客户信息枚举定义,约定为po的fieldName_key为匹配原则
 * @date 2019-10-31 15:24:41
 */
public enum CustinfoEnum implements I18nEnum {
                
    CUST_SEX_0("0", "男","custinfo.enum.cust_sex0")
,
    CUST_SEX_1("1", "女","custinfo.enum.cust_sex1")


    ;
   private String code;
   private String value;
   private String i18nKey;

   CustinfoEnum(String code, String value, String i18nKey) {
       this.code = code;
       this.value = value;
       this.i18nKey = i18nKey;
   }

   @Override
   public Map getMappings() {
       Map result = new HashMap();
       for(CustinfoEnum item: CustinfoEnum.values()){
            result.put( item.name(), MessageSourceUtil.getMessage(item.i18nKey, item.value));
       }

       return result;
   }

}
