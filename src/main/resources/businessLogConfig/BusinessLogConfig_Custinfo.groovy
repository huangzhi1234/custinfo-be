class BusinessLogConfig_Custinfo {
    def context;
    def custinfo_insertSelective() {
         "客户信息：执行保存方法:IP地址为${context._ip},USER用户为${context._user},TIME操作时间为${context._time},编码为${context._methodReturn.code},名称为${context._param0.name}"
    }

    def custinfo_updateSelective() {
         "客户信息：执行修改方法:IP地址为${context._ip},USER用户为${context._user},TIME操作时间为${context._time},编码为${context._methodReturn.code},名称为${context._param0.name}"
    }

    def custinfo_saveMultiple() {
         "客户信息： 执行批量保存方法:IP地址为${context._ip},USER用户为${context._user},TIME操作时间为${context._time}"
    }


    def custinfo_deleteBatch() {
         "客户信息：执行删除方法:IP地址为${context._ip},USER用户为${context._user},TIME操作时间为${context._time}"
    }


}