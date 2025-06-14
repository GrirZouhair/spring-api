create table categories
(
    id   tinyint auto_increment
        primary key,
    name varchar(255) not null
);


create table products
(
    id          BIGINT auto_increment
        primary key,
    name        varchar(255)   not null,
    price       DECIMAL(10, 2) not null,
    description LONGTEXT       not null,
    category_id tinyint        null,
    constraint products_categories_id_fk
        foreign key (category_id) references categories (id)
);

