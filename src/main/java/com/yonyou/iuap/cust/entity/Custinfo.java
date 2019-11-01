package com.yonyou.iuap.cust.entity;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.baseservice.entity.AbsDrModel;
import com.yonyou.iuap.baseservice.entity.annotation.Reference;
import com.yonyou.iuap.baseservice.entity.annotation.Associative;
import com.yonyou.iuap.baseservice.support.condition.Condition;
import com.yonyou.iuap.baseservice.support.condition.Match;
import com.yonyou.iuap.baseservice.support.generator.GeneratedValue;
import com.yonyou.iuap.baseservice.support.generator.Strategy;
import com.yonyou.iuap.baseservice.entity.annotation.CodingEntity;
import com.yonyou.iuap.baseservice.entity.annotation.CodingField;
import com.yonyou.iuap.baseservice.statistics.support.StatFunctions;
import com.yonyou.iuap.baseservice.statistics.support.StatisticsField;
import com.yonyou.iuap.baseservice.intg.ext.I18nEnumCode;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.math.BigDecimal;

                /**
                * 客户信息
                * @date 2019年10月31日 下午03点24分41秒
                */

                @JsonIgnoreProperties(ignoreUnknown = true)
                @Table(name = "cust_info")
                    @Associative(fkName = "custId")   
                @CodingEntity(codingField="")
                @Entity(name = "com.yonyou.iuap.cust.entity.Custinfo")
                public class Custinfo extends AbsDrModel implements Serializable
                {
                @Id
                @GeneratedValue
                @Condition
                @StatisticsField(functions = { StatFunctions.count })
                protected String id;//ID
                @Override
                public String getId() {
                return id;
                }
                @Override
                public void setId(Serializable id){
                this.id= id.toString();
                super.id = id;
                }
                public void setId(String id) {
                this.id = id;
                }






                            @Condition(match=Match.LIKE)
                                @Column(name="cust_name")
                        private String cust_name;    //客户名称

                             public void setCust_name(String cust_name){
                             this.cust_name = cust_name;
                             }
                             public String getCust_name(){
                             return this.cust_name;
                             }





                            @Condition
                                @Column(name="cust_sex")
                        @I18nEnumCode(clazz = CustinfoEnum.class,target ="cust_sexEnumValue" )
                        private String cust_sex;    //客户性别

                             public void setCust_sex(String cust_sex){
                             this.cust_sex = cust_sex;
                             }
                             public String getCust_sex(){
                             return this.cust_sex;
                             }

                            @Transient
                            private String cust_sexEnumValue;   //客户性别

                            public void setCust_sexEnumValue(String cust_sexEnumValue){
                            this.cust_sexEnumValue = cust_sexEnumValue;
                            }
                            public String getCust_sexEnumValue(){
                            return this.cust_sexEnumValue;
                            }




                            @Condition(match=Match.EQ)
                                @Column(name="cust_num")
                        private String cust_num;    //客户编码

                             public void setCust_num(String cust_num){
                             this.cust_num = cust_num;
                             }
                             public String getCust_num(){
                             return this.cust_num;
                             }





                            @Condition
                                @Column(name="phone")
                        private String phone;    //联系方式

                             public void setPhone(String phone){
                             this.phone = phone;
                             }
                             public String getPhone(){
                             return this.phone;
                             }








        }




