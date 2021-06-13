## lambda-property

[![](https://jitpack.io/v/joker-pper/lambda-property.svg)](https://jitpack.io/#joker-pper/lambda-property)

*lambda-property是通过lambda表达式获取实体类的属性名称的工具包(基于mybatis-plus所提供的方法实现)*


## 使用方式

```
//获取属性列表
LambdaPropertyUtils.getPropertyList(Model::getId, Model::getName);

//获取属性数组
LambdaPropertyUtils.getProperties(Model::getId, Model::getName);

//获取属性名称
LambdaPropertyUtils.getProperty(Model::getId);
```


## 引入方式

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>


    <dependencies>
        <dependency>
            <groupId>com.github.joker-pper</groupId>
            <artifactId>lambda-property</artifactId>
            <version>1.1</version>
        </dependency>
    </dependencies>
