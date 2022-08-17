drop table Transaction_Detail ;
drop table PLAYER ;



CREATE TABLE Player (
player_Id integer auto_increment primary key,
username varchar(50),
balance numeric(10,2)
);
CREATE UNIQUE INDEX IPK_Player_Username ON Player (username);

insert into player (username, balance) values ('TEST1', 100.00);
insert into player (username, balance) values ('TEST2', 100.00);
insert into player (username, balance) values ('TEST3', 100.00);
insert into player (username, balance) values ('TEST4', 100.00);
insert into player (username, balance) values ('TEST5', 100.00);
insert into player (username, balance) values ('TEST6', 100.00);

CREATE TABLE Transaction_Detail (
transaction_Id bigint auto_increment primary key,
player_Id integer,
transaction_Type varchar(5),
transaction_Datetime datetime,
amount numeric(10,2),
FOREIGN KEY (player_Id) REFERENCES Player (player_Id)
);

