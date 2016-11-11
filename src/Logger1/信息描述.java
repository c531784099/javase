/**
 * *****************************************************************************************
 * slf4j是一种接口、具体的日志系统是log4日志系统、中间使用适配器 来使用log4j日志系统。
 * 三个jar分别是 日志接口、适配器、功能具体实现类。
 * # 日志输出级别（INFO）和输出位置（stdout，R）
 * 
 * *****************************************************************************************
log4j.rootLogger=INFO, stdout , R
*****************************************************************************************
******************************************************************************************
# 日志输出位置为控制台
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
// 这里是输出到控制台的数据格式
log4j.appender.stdout.layout=org.apache.log4j.TTCCLayout
//输出到控制台使用的方法。
log4j.appender.stdout.Target=System.err
//输出到控制台的格式
log4j.appender.stdout.layout.ConversionPattern=[QC] %p [%t] %C.%M(%L) | %m%n
*****************************************************************************************
*
******************************************************************************************
# 日志输出位置为文件
log4j.appender.R=org.apache.log4j.DailyRollingFileAppender
// 输出到的文件
log4j.appender.R.File=F:\\API\\qc.log
// 输出到 文件的格式
log4j.appender.R.layout=org.apache.log4j.HTMLLayout
//这里 指定输出的格式是 自定义布局
//log4j.appender.R.layout=org.apache.log4j.PatternLayout
//指定自定义布局的具体格式 配合org.apache.log4j.PatternLayout配置使用。
log4j.appender.R.layout.ConversionPattern=%d-[TS] %p %t %c - %m%n
*****************************************************************************************
*
******************************************************************************************
#  定义相应包路径下的日志输出级别
// 在这里的配置会覆盖在 rootLogger中的设置、
log4j.logger.Logger1=info
log4j.logger.com.opensymphony.oscache=ERROR
log4j.logger.线程测试=DEBUG
log4j.logger.com.ibatis.db=WARN
log4j.logger.org.apache.velocity=FATAL
log4j.logger.org.hibernate.ps.PreparedStatementCache=WARN
log4j.logger.org.hibernate=DEBUG
log4j.logger.org.logicalcobwebs=WARN
 * *****************************************************************************************
 */
/**
 * @author Administrator
 *
 */
package Logger1;