## lambda-property

[![Maven Central](https://img.shields.io/maven-central/v/io.github.joker-pper/lambda-property.svg?label=Maven%20Central)](https://central.sonatype.com/search?q=io.github.joker-pper:lambda-property)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![codecov](https://codecov.io/gh/joker-pper/lambda-property/branch/master/graph/badge.svg)](https://codecov.io/gh/joker-pper/lambda-property)


*lambda-property是通过lambda表达式获取实体类的属性名称的工具包(基于mybatis-plus所提供的方法实现),告别魔法值避免修改字段名称所导致的隐藏bug*


## 使用方式

```
//获取属性列表
LambdaPropertyUtils.getPropertyList(Model::getId, Model::getName);

//获取属性数组
LambdaPropertyUtils.getProperties(Model::getId, Model::getName);

//获取属性名称
LambdaPropertyUtils.getProperty(Model::getId);
```

## 字段命名及类型注意

```

## 【命名】若字段名第二个字母为大写，则不再将第一个字母转换为小写（故第二个字母为大写时，第一个字母也应该为大写）
### 除非生成的getter方法的字段名的第一个字母为小写 （lombok默认生成的getter的字段名的第一个字母为大写）


String cN ==> getter: getCN() -> property: CN  
String CN ==> getter: getCN() -> property: CN  
String aNbs ==> getter: getANbs() -> property: ANbs  

### 只有这样的getter方法才会保留首字母为小写
String bNFromCustomGetter ==> getter: getbNFromCustomGetter() -> property: bNFromCustomGetter  


## boolean类型时需要注意

boolean check ==> getter: isCheck() -> property: check  
boolean isCheck ==> getter: isCheck() -> property: check  

```


## 引入方式

```

<dependency>
  <groupId>io.github.joker-pper</groupId>
  <artifactId>lambda-property</artifactId>
  <version>${version}</version>
</dependency>

```
