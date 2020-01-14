## 项目简介：
学习springboot + mybait-splus + swagger-ui, 通过mybaits-plus自动生成代码，实现了简单的数据库curd操作

## 技术选型
* springboot 2.0.1
* mybaits-plus 3.0.5
* mysql5.1.38 + druid1.1.9（数据库+接池）
* springfox-swagger-ui（java API 文档）2.9.2
* log4jdbc  （jdbc的日志，显示执行时间和执行参数好做调试）

### 项目参考文档：
1、[mybaits-plus参考地址](https://github.com/baomidou/mybatis-plus/blob/3.0/mybatis-plus)  
2、[mybaits-plus参考文档](https://mp.baomidou.com/guide/generator.html)  
3、[spring-boot mybatis-plus 集成 + 代码生成器自定义controller 模板](https://blog.csdn.net/qq_33842795/article/details/80227382)

### 测试策略
* 通过mock 测试service，[查看mock测试文件](src/main/test/com.dnp.test/base/Base.java)
* [mockMvc的一些简介](https://www.cnblogs.com/ken-jl/p/9724814.html)
### 数据库文件
* 查看[mysql数据库文件](sql/mytest.sql)

## 运行常用的地址和命令
1、查看 [mysql数据库文件](sql/mytest.sql)  

2、WEB文档地址: [http://127.0.0.1/baomidou/swagger-ui.html](http://127.0.0.1/baomidou/swagger-ui.html)  
`如果配置文件中没有定义context-path参数`  
WEB文档地址: [http://127.0.0.1/swagger-ui.html](http://127.0.0.1/swagger-ui.html)  
  
### FAQ：
1、这两个位置别配置错了
```
- mapper-locations: classpath*:com/dnp/ptt/dao/impl/*Mapper.xml
- typeAliasesPackage: com.dnp.ptt.model
```

2、扫描mapper -- @MapperScan(value = {"com.dnp.ptt.dao*"}) 中的value别错了
```
@Configuration
@MapperScan(value = {"com.dnp.ptt.dao*"})
public class MybatisPlusConfig {

}
```
3、maven库配置问题  
我以前是从版本1.0.5过来的，到了3.0.5名称变了，包的artifactId变为mybatis-plus-boot-starter，  我没注意，老是加载不到包，郁闷了半天
```
<dependency>
	<groupId>com.baomidou</groupId>
	<artifactId>mybatisplus-spring-boot-starter</artifactId>
	<version>1.0.5</version>
</dependency>

3.0.5
<dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-boot-starter</artifactId>
      <version>3.0.5</version>
</dependency>
```
4、自定义模板生成：
```
简单的操作就是把baomidou自动生成代码的templetes拷贝到resources下，然后就可以自定义了
```

5、SpringBoot08 请求方式、参数获取注解、参数验证、前后台属性名不一致问题、自定义参数验证注解、BeanUtils的使用
[参考地址](https://www.cnblogs.com/NeverCtrl-C/p/8185576.html)

6、mysql中的排序字段一般都是和前端商量号按那些字段排序，没有预先定义。

