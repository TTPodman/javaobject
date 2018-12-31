--建表
create table student(
sno varchar2(10) primary key,--学生号
sname varchar2(20) not null,--学生姓名
age  number(3) not null,--学生年龄
sex  char(1) not null --性别，1：男，0：女
);
--添加测试数据
insert into student values('D00001','张飞',20,1);
insert into student values('D00002','关羽',21,1);
insert into student values('D00003','刘备',22,1);
insert into student values('D00004','貂蝉',18,0);
insert into student values('D00005','小乔',19,0);

--存储过程

--添加学生信息
CREATE OR REPLACE PROCEDURE add_student(sno student.sno%TYPE,
sname student.sname%TYPE,age  student.age%TYPE,sex  student.sex%TYPE DEFAULT 1)
IS 
BEGIN
INSERT INTO student(sno,sname,age,sex)
VALUES(sno,sname,age,sex);
END;
--获取学生总数
CREATE OR REPLACE PROCEDURE get_count(
total OUT NUMBER)
IS
BEGIN
SELECT count(*) INTO total
FROM student ;
END;
--传递两个数，并分别通过参数1和参数2返回两个数的乘和除
CREATE OR REPLACE PROCEDURE add_sub(
num1 IN OUT NUMBER,num2 IN OUT NUMBER)
IS
temp NUMBER (4,2);--定义一个变量存放临时值 
BEGIN
temp := num1*num2;
num2 := num1/num2;
num1 := temp;
END;
