CREATE TABLE IF NOT EXISTS category
(
    id integer not null primary key,
    description varchar(255),
    name        varchar(255)
);

CREATE TABLE IF NOT EXISTS product
(
    id integer not null primary key,
    available_quantity double precision not null,
    description        varchar(255),
    name               varchar(255),
    price              numeric(38, 2),
    category_id        integer constraint fk1realconstraint references category
);

create sequence if not exists category_seq increment by 50;
create sequence if not exists product_seq increment by 50;



