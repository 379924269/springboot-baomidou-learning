# springboot-baomidou-learning
springboot 结合com.baomidou.mybaitsplus自动生成代码学习（实现了简单的curd操作）


### 可以参考的地址：
    1、https://github.com/baomidou/mybatis-plus/blob/3.0/mybatis-plus
    
    2、mp.baomidou.com/guide/generator.html#strategy
    
    （spring-boot mybatis-plus 集成 + 代码生成器自定义controller 模板 ）
    3、https://blog.csdn.net/qq_33842795/article/details/80227382
    
### 注意配置：
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
```
我以前是从版本1.0.5过来的，到了3.0.5名称变了，包的artifactId变为mybatis-plus-boot-starter，我没注意，老是加载不到包，郁闷了半天
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
5、配置一下swaggerui 可以做简单的调试

6、自定义数据库配置：

7、生成mock测试：

8、controller前端数据验证
参考地址：https://www.cnblogs.com/NeverCtrl-C/p/8185576.html

## 项目运行
1、自动生成代码
2、运行命令：spring-boot:run 启动项目，web访问swaggerui地址：http://127.0.0.1/项目名称/swagger-ui.html
如果没有定义context-path直接访问：http://127.0.0.1/swagger-ui.html 就可以做简单的调试了


