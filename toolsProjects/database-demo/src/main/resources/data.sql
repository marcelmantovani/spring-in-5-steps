/*
 * Spring boot schema update knows it is using in-memory DB, so it creates the entities that have the annotation
create table person
( id integer not null,
  name varchar(255) not null,
  location varchar (255),
  birth_date timestamp,
  primary key (id)
);
*/

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10001, 'Marcel', 'Atlanta', sysdate);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10002, 'John', 'New York', sysdate);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10003, 'Hans', 'Amsterdam', sysdate);
