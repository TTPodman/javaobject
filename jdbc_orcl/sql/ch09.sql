--����
create table student(
sno varchar2(10) primary key,--ѧ����
sname varchar2(20) not null,--ѧ������
age  number(3) not null,--ѧ������
sex  char(1) not null --�Ա�1���У�0��Ů
);
--��Ӳ�������
insert into student values('D00001','�ŷ�',20,1);
insert into student values('D00002','����',21,1);
insert into student values('D00003','����',22,1);
insert into student values('D00004','����',18,0);
insert into student values('D00005','С��',19,0);

--�洢����

--���ѧ����Ϣ
CREATE OR REPLACE PROCEDURE add_student(sno student.sno%TYPE,
sname student.sname%TYPE,age  student.age%TYPE,sex  student.sex%TYPE DEFAULT 1)
IS 
BEGIN
INSERT INTO student(sno,sname,age,sex)
VALUES(sno,sname,age,sex);
END;
--��ȡѧ������
CREATE OR REPLACE PROCEDURE get_count(
total OUT NUMBER)
IS
BEGIN
SELECT count(*) INTO total
FROM student ;
END;
--���������������ֱ�ͨ������1�Ͳ���2�����������ĳ˺ͳ�
CREATE OR REPLACE PROCEDURE add_sub(
num1 IN OUT NUMBER,num2 IN OUT NUMBER)
IS
temp NUMBER (4,2);--����һ�����������ʱֵ 
BEGIN
temp := num1*num2;
num2 := num1/num2;
num1 := temp;
END;
