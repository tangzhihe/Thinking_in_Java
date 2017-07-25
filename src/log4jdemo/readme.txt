一、Log4j介绍
log4j是类似于Java.util.logging的日志作用，即记录一些有用信息，是一个日志框架;
log4j == log for Java
日志框架的作用:
(1)函数参数是否正确;
(2)软件发布后，记录用户的每一步操作;
(3)记录程序运行出错位置;

二、简单的使用Log4j
log4j.properties规则：
(1)键值对;
(2)#代表注释;
(3)不支持中文;

三、Log4j核心组件
1、Logger
设定了显示日志的级别
常用级别为debug、info、warn、error、fatal;

2.Appender
设定了日志的输出目的；
常用有：
(1)ConsoleAppender
(2)FileAppender
(3)DailyRollingFileAppender  一天换一个文件
(4)JdbcAppender   输出到数据库
 
3.Layout
设定日志的内容格式；
常用有：
(1)HTMLLayout;
(2)TTCCLayout;
(3)PatternLayout;制定布局样式


格式形式如下：
%p：日志优先级（debug、info）
%t：输出日志的线程名；
%d{yyyy-MM-dd HH:mm:ss}：时间；
%c：所属类名；
%r：日志输出所花时间；
%n：换行；
%l：日志所在行；
%m：信息；
%M：方法；




























