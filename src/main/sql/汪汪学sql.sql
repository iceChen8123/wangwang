DROP TABLE IF EXISTS t_department;
DROP TABLE IF EXISTS t_employer;
DROP TABLE IF EXISTS t_employer_info;


CREATE TABLE `t_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

INSERT INTO t_department (id,dname) VALUES (1,'研发部');
INSERT INTO t_department (id,dname) VALUES (2,'销售部');
INSERT INTO t_department (id,dname) VALUES (3,'售后');

/** ---------------------------------------------------------------   **/

CREATE TABLE `t_employer_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL COMMENT '名字',
  `age` int(255) NOT NULL DEFAULT '0',
  `sex` int(4) NOT NULL DEFAULT '0' COMMENT '0为女，1为男',
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;


INSERT INTO t_user (id,user_name,age,sex,address) VALUES (1,'汪汪1',23,0,'上海');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (2,'汪汪2',25,1,'北京');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (3,'汪汪3',28,0,'河南');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (4,'汪汪4',26,1,'河南');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (5,'汪蛋1',31,0,'北京');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (6,'汪蛋2',46,1,'广东');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (7,'汪蛋3',31,0,'上海');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (8,'汪蛋4',23,1,'上海');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (9,'汪蛋5',25,1,'上海');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (10,'陈蛋蛋1',21,1,'河北');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (11,'陈蛋蛋2',28,1,'山东');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (12,'陈蛋蛋3',29,0,'山东');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (13,'陈蛋蛋4',28,1,'河南');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (14,'陈蛋蛋5',27,1,'上海');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (15,'陈蛋蛋6',27,0,'河南');
INSERT INTO t_user (id,user_name,age,sex,address) VALUES (16,'陈蛋蛋2',29,0,'浙江');

/** ---------------------------------------------------------------   **/

CREATE TABLE `t_employer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
	`user_name` varchar(255) NOT NULL COMMENT '名字',
	`eng_name` varchar(255) NOT NULL COMMENT '英文名',
  `department` int(20) NOT NULL COMMENT '部门',
  `salary` int(255) NOT NULL COMMENT '工资',
  `months` int(10) NOT NULL COMMENT '薪资月数，12/13....',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;


INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (1,'汪汪1','Wang1',1,12000,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (2,'汪汪2','Wang2',2,2500,15);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (3,'汪汪3','Wang3',3,4000,14);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (4,'汪汪4','Wang2',1,14000,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (5,'汪蛋1','WDan1',2,2800,16);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (6,'汪蛋2','WDan2',3,4300,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (7,'汪蛋3','CDan1',1,8500,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (8,'汪蛋4','WDan4',2,3200,12);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (9,'汪蛋5','WDan6',3,5500,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (10,'陈蛋蛋1','CDan1',1,16000,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (11,'陈蛋蛋2','CDan2',1,23000,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (12,'陈蛋蛋3','CDan3',1,24500,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (13,'陈蛋蛋4','CDan4',2,2950,15);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (14,'陈蛋蛋5','CDan5',1,15500,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (15,'陈蛋蛋6','CDan6',2,5200,13);
INSERT INTO t_employer (user_id,user_name,eng_name,department,salary,months) VALUES (16,'陈蛋蛋2','CDan7',1,18500,13);


SELECT * from t_user;
SELECT * from t_department;
SELECT * from t_employer;



1.找出 汪蛋4 的人的年龄。
2.找出 汪蛋2 的部门。
3.销售部都有谁？（名字，年龄，性别，工资）
4，开发部每个人的名字、年龄、工资、年薪
5.公司里年龄最大的人是谁
6.谁的工资最高
7.谁的年龄最小
8.公司里各个省的人，分别是多少？ 哪个省最多？  都是谁？
9.开发部的平均月薪？平均年薪？ 多少人在平均月薪以下？多少人在平均年薪以上？



