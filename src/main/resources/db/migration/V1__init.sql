CREATE TABLE USER (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(255) not null
);