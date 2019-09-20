create database docin default character set utf8mb4;
grant all privileges on docin.* to 'docin'@'docin' identified by 'docin' with grant option;
drop table if exists `docin`.`t_jiaguwen`;
create table `docin`.`t_jiaguwen`(
                                     `id` int(64) not null primary key ,
                                     `sentence_id` int(64) not null ,
                                     `sentence` varchar(64) not null
) character set utf8mb4;