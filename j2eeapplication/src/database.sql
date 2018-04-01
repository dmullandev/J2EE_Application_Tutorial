create table appuser (
	id number,
	firstName varChar2(30),
	lastName varChar2(30),
	userName varChar2(30),
	password varChar2(40),
	constraint appuser_pk primary key (id),
	constraint app_username_uk unique (userName)
);