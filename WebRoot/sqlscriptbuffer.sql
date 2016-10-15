create table FRIEND_REQUEST_BUFFER(
ID int primary key auto_increment,
SEND_REQUEST_USER_EMAIL varchar(500) not null,
RECEIVE_REQUEST_USER_EMAIL varchar(500) not null
);
