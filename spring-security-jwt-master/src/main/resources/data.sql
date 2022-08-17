DROP ALL OBJECTS DELETE FILES;


CREATE SEQUENCE USERID_SQ START WITH 25 INCREMENT BY 1;

create table opuser (
user_id integer not null,
email_id varchar(255),
pwd varchar(255),
name varchar(255),
eff_status varchar(1),
admin_user varchar(1),
admin_role varchar(255),
logged_in varchar(1),
attempt integer,
primary key (user_id)

);

insert into opuser values(1,'email1@mail.com', 'p@ss', 'name1', 'A', 'Y','ADMIN', 'N',0);

insert into opuser values(2,'email2@mail.com', 'p@ss', 'name2', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(3,'email3@mail.com', 'p@ss', 'name3', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(4,'email4@mail.com', 'p@ss', 'name4', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(5,'email5@mail.com', 'p@ss', 'name5', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(6,'email6@mail.com', 'p@ss', 'name6', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(7,'email7@mail.com', 'p@ss', 'name7', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(8,'email8@mail.com', 'p@ss', 'name8', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(9,'email9@mail.com', 'p@ss', 'name9', 'A', 'Y','ADMIN', 'N',0);
insert into opuser values(10,'emai10@mail.com', 'p@ss', 'name10', 'A', 'Y','ADMIN', 'N',0);


create table page_cfg (
page_id varchar(100) not null,
page_config varchar(2000),
primary key (page_id)
);

insert into page_cfg values ('user','[{"columnIndex":"1","columnKey" : "userId","hidden" : "false","header" : "User ID","columnType":"text"},{"columnIndex" : "2","columnKey" : "email","hidden" : "false","header" : "Email ID","columnType":"link","routerLink":"/updateuser"},{"columnIndex" : "3","columnKey" : "password","hidden" : "false","header" : "Password","columnType":"text"},{"columnIndex" : "4","columnKey" : "eff_status","hidden" : "false","header" : "Effective Status","columnType":"text"},{"columnIndex" : "5","columnKey" : "admin_user","hidden" : "false","header" : "Admin User","columnType":"text","valueHandler":"getAdminUserVal"},{"columnIndex" : "6","columnKey" : "admin_role","hidden" : "false","header" : "Admin Role","columnType":"text"}]')
