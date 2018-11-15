package com.dnp.test.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * mybatis-plus代码生成器(用于生成entity)<br>
 * 注意:<br>
 * 因为没用mybatis-plus的Service和Controller所以生成完之后要删掉TTT目录
 *
 * @author stylefeng
 * @Date 2017/5/21 12:38
 */
public class MyBatisPlusGenerator {
    /*文件生成存放的目录，一般生成到我们自己的项目下*/
    private static String OUT_PUT_DIR = "E:\\springboot-learning-project\\baomidou-test\\src\\main\\java";
    /*包名,controller、entity、dao、service到的包*/
    private static String PACKAGE_NAME = "com.dnp.test.modular";
    /*作者*/
    private static String AUTHOR = "huazai";
    /*数据库用户名称*/
    private static String DB_USER_NAME = "root";
    /*数据库密码*/
    private static String DB_PASSWORD = "123456";
    /*数据库url*/
    private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/my_new_ptt?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
    /*需要生成的表，不填就生成所有表*/
    private static String[] INCLUED_TABLE = {};

    /*
    PageVo分页实体放置的目录
     */
    private static String PAGE_VO = "com.dnp.test.vo";

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //E:\ideaGitProject\spring-boot-learn\src\main\java
        gc.setOutputDir(OUT_PUT_DIR);//这里写你自己的java目录
        gc.setFileOverride(true);//是否覆盖
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor(AUTHOR);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                //    return DbColumnType.BOOLEAN;
                // }
                return super.processTypeConvert(globalConfig, fieldType);
            }
        });
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(DB_USER_NAME);
        dsc.setPassword(DB_PASSWORD);
        dsc.setUrl(DB_URL);
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(new String[]{"_"});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        if (INCLUED_TABLE.length != 0) {
            strategy.setInclude(INCLUED_TABLE); // 需要生成的表,注释就生成所有
        }

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(null);
        pc.setEntity(PACKAGE_NAME + ".entity");
        pc.setMapper(PACKAGE_NAME + ".dao");
        pc.setXml(PACKAGE_NAME + ".dao.impl");
        pc.setService(PACKAGE_NAME + ".service");       //本项目没用，生成之后删掉
        pc.setServiceImpl(PACKAGE_NAME + ".service.impl");   //本项目没用，生成之后删掉
        pc.setController(PACKAGE_NAME + ".controller");    //本项目没用，生成之后删掉
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                map.put("packageName", PACKAGE_NAME);
                map.put("pageVo", PAGE_VO);
                this.setMap(map);
            }
        };


        mpg.setCfg(cfg);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        //TemplateConfig tc = new TemplateConfig();
        //tc.setController("templetes/controller.java.vm");
        //tc.setEntity("templetes/entity.java.vm");
        //
        //mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        // 打印注入设置
        System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}