/*for Oracle*/

create table TMP_Spittle (
	id NUMBER ,
	message VARCHAR2(140) not null,
	created_at DATE not null,
	latitude FLOAT,
	longitude FLOAT
);

create table TMP_Spitter (
	id NUMBER,
	username VARCHAR2(20) unique not null,
	password VARCHAR2(20) not null,
	first_name VARCHAR2(30) not null,
	last_name VARCHAR2(30) not null,
	email VARCHAR2(30) not null
);