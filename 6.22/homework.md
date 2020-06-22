```
SUCCESS:DROP TABLE projectlist;

SUCCESS:CREATE TABLE projectlist(
    projectId INT NOT NULL   COMMENT '工程号' ,
    projectName VARCHAR(32)    COMMENT '工程名称' ,
    constructors VARCHAR(128)    COMMENT '施工人员' ,
    PRIMARY KEY (projectId)
) COMMENT = '工程列表 ';

SUCCESS:DROP TABLE workers;

SUCCESS:CREATE TABLE workers(
    worksID INT NOT NULL   COMMENT '职工号' ,
    name VARCHAR(32)    COMMENT '姓名' ,
    gender VARCHAR(32)    COMMENT '性别' ,
    duty VARCHAR(32)    COMMENT '职务' ,
    PRIMARY KEY (worksID)
) COMMENT = '职工列表 ';

SUCCESS:DROP TABLE Hourlywage;

SUCCESS:CREATE TABLE Hourlywage(
    duty VARCHAR(32)    COMMENT '职务' ,
    hourlywage DECIMAL(32,8)    COMMENT '小时工资' 
) COMMENT = '小时工资 ';

SUCCESS:DROP TABLE payrollCredit;

SUCCESS:CREATE TABLE payrollCredit(
    workersId INT NOT NULL   COMMENT '职工号' ,
    workhours VARCHAR(32)    COMMENT '工时' ,
    hourlywage DECIMAL(32,8)    COMMENT '小时工资' ,
    totalwages DECIMAL(32,8)    COMMENT '总工资' ,
    PRIMARY KEY (workersId)
) COMMENT = '工资清单 ';
```
