springboot访问静态资源文件。
配置访问静态资源文件的路径：
spring:
 resources:
   static-locations: classpath:/static/,classpath:/viewss/
注意：
1.localhost：port/会默认访问index.html页面
2.如果不在Controller层进行页面的跳转。如果没有此页面则会报404，找不到页面。
如果想自定义页面则需要在写Contrller层进行访问。
静态资源的路径;
3.springboot的默认路径static放的是js，图片，以及第三方插件的js文件。
4.public目录要比static的访问级别更高。static能访问到的puublic也能访问到。
若static下面放HTML页面可以直接访问，无需在yml文件中配置。
5.templates放的是模板文件。html文件访问不到若想访问则需要配置classpath。。
6.所需jar包 spring-boot-starter-web一个就可以。需要其他视图解析另外添加。如果仅是html就可以了。
7.resources目录下不能访问html文件。
8.配置自定义资源文件目录，设置自定义目录为root目录。在配置文件中定义静态资源的目录。