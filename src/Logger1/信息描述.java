/**
 * *****************************************************************************************
 * slf4j��һ�ֽӿڡ��������־ϵͳ��log4��־ϵͳ���м�ʹ�������� ��ʹ��log4j��־ϵͳ��
 * ����jar�ֱ��� ��־�ӿڡ������������ܾ���ʵ���ࡣ
 * # ��־�������INFO�������λ�ã�stdout��R��
 * 
 * *****************************************************************************************
log4j.rootLogger=INFO, stdout , R
*****************************************************************************************
******************************************************************************************
# ��־���λ��Ϊ����̨
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
// ���������������̨�����ݸ�ʽ
log4j.appender.stdout.layout=org.apache.log4j.TTCCLayout
//���������̨ʹ�õķ�����
log4j.appender.stdout.Target=System.err
//���������̨�ĸ�ʽ
log4j.appender.stdout.layout.ConversionPattern=[QC] %p [%t] %C.%M(%L) | %m%n
*****************************************************************************************
*
******************************************************************************************
# ��־���λ��Ϊ�ļ�
log4j.appender.R=org.apache.log4j.DailyRollingFileAppender
// ��������ļ�
log4j.appender.R.File=F:\\API\\qc.log
// ����� �ļ��ĸ�ʽ
log4j.appender.R.layout=org.apache.log4j.HTMLLayout
//���� ָ������ĸ�ʽ�� �Զ��岼��
//log4j.appender.R.layout=org.apache.log4j.PatternLayout
//ָ���Զ��岼�ֵľ����ʽ ���org.apache.log4j.PatternLayout����ʹ�á�
log4j.appender.R.layout.ConversionPattern=%d-[TS] %p %t %c - %m%n
*****************************************************************************************
*
******************************************************************************************
#  ������Ӧ��·���µ���־�������
// ����������ûḲ���� rootLogger�е����á�
log4j.logger.Logger1=info
log4j.logger.com.opensymphony.oscache=ERROR
log4j.logger.�̲߳���=DEBUG
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