show databases;
use test;
show tables;

-- 部门表
create table td_m_depart(
`depart_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '部门ID',
`depart_name` VARCHAR(20) NOT NULL COMMENT '部门名字',
`location` VARCHAR(100) NOT NULL COMMENT '部门所在地',
`manager` VARCHAR(20) NOT NULL COMMENT '部门经理',
PRIMARY KEY (`depart_id`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- 子部门表 联通事业部
create table td_m_depart_cuc(
`depart_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '部门ID',
`depart_name` VARCHAR(20) NOT NULL COMMENT '部门名字',
`location` VARCHAR(100) NOT NULL COMMENT '部门所在地',
`manager` VARCHAR(20) NOT NULL COMMENT '部门经理',
PRIMARY KEY (`depart_id`),
key idx_depart_id(depart_id)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='联通事业部';

-- 子部门表 移动事业部
create table td_m_depart_cmc(
`depart_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '部门ID',
`depart_name` VARCHAR(20) NOT NULL COMMENT '部门名字',
`location` VARCHAR(100) NOT NULL COMMENT '部门所在地',
`manager` VARCHAR(20) NOT NULL COMMENT '部门经理',
PRIMARY KEY (`depart_id`),
key idx_depart_id(depart_id)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='移动事业部';

-- 子部门表 电信事业部
create table td_m_depart_ctc(
`depart_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '部门ID',
`depart_name` VARCHAR(20) NOT NULL COMMENT '部门名字',
`location` VARCHAR(100) NOT NULL COMMENT '部门所在地',
`manager` VARCHAR(20) NOT NULL COMMENT '部门经理',
PRIMARY KEY (`depart_id`),
key idx_depart_id(depart_id)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='电信事业部';

-- 员工表
create table tf_f_employee(
`emp_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '员工ID',
`depart_id` BIGINT NOT NULL COMMENT '部门ID',
`depart_name` VARCHAR(20) NOT NULL COMMENT '部门名字',
`emp_name` VARCHAR(20) NOT NULL COMMENT '员工名字',
`gender` VARCHAR(20) NOT NULL COMMENT '性别 male:男, female:女',
`birth_date` TIMESTAMP NOT NULL COMMENT '生日',
`title` VARCHAR(20) NOT NULL COMMENT '职位名称',
`grade` VARCHAR(40) NOT NULL COMMENT '职位等级',
PRIMARY KEY (`emp_id`),
KEY `idx_emp_id`(`emp_id`),
KEY `idx_depart_id`(`depart_id`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- 插入表数据
select * from td_m_depart;
insert into td_m_depart(depart_id,depart_name,location,manager)
values (10010,'联通事业部','北京','彭联通'),
	   (10086,'移动事业部','北京','李移动'),
	   (10000,'电信事业部','北京','张电信');

select * from td_m_depart_cuc;
insert into td_m_depart_cuc(depart_id,depart_name,location,manager)
values (85001,'贵州联通事业部','贵州','陈中兵'),
	   (34001,'江苏联通事业部','江苏','李中兵'),
	   (01001,'北京联通事业部','北京','张中兵');       
select * from td_m_depart_cmc;
insert into td_m_depart_cmc(depart_id,depart_name,location,manager)
values (85002,'贵州移动事业部','贵州','赵四'),
	   (34002,'江苏移动事业部','江苏','王鑫'),
	   (01002,'北京移动事业部','北京','柳叶');

insert into td_m_depart_ctc(depart_id,depart_name,location,manager)
values (85003,'贵州电信事业部','贵州','葛天'),
	   (34003,'江苏电信事业部','江苏','李秋'),
	   (01003,'北京电信事业部','北京','向毅');
select * from tf_f_employee;
insert into tf_f_employee (emp_id,depart_id,depart_name,emp_name,gender,birth_date,title,grade)
values (8500101,85001,'联通事业部','彭联通','male','1983/12/12','部门经理','band8'), 
	   (8500102,85001,'联通事业部','赵中兵','male','1984/12/12','项目经理','band8'),
	   (8500103,85001,'联通事业部','李小妞','female','1986/12/12','组长','band7'),
	   (8500104,85001,'联通事业部','张三','male','1988/12/12','员工','band6'),
       (8500105,85001,'联通事业部','李四','male','1988/12/12','员工','band6'),
       
       (8500201,85002,'移动事业部','陈中兵','male','1983/12/12','部门经理','band8'), 
	   (8500202,85002,'移动事业部','婷婷','male','1984/12/12','项目经理','band8'),
	   (8500203,85002,'移动事业部','洪娥妮','female','1986/12/12','组长','band7'),
	   (8500204,85002,'移动事业部','熊懂','male','1988/12/12','员工','band6'),
       (8500205,85002,'移动事业部','冯生','male','1988/12/12','员工','band6'),
       
       (8500301,85003,'电信事业部','葛天','male','1983/12/12','部门经理','band8'), 
	   (8500302,85003,'电信事业部','李亮','male','1984/12/12','项目经理','band8'),
	   (8500303,85003,'电信事业部','青青','female','1986/12/12','组长','band7'),
	   (8500304,85003,'电信事业部','草草','male','1988/12/12','员工','band6'),
       (8500305,85003,'电信事业部','微微','female','1988/12/12','员工','band6');