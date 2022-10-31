drop table if exists user;
create table user
(
    id         bigserial primary key,
    first_name varchar(255),
    last_name  varchar(255),
    birth_date timestamp
);

