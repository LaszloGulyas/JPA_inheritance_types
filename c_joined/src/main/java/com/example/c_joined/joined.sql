USE jpa_inheritance_demo;

create table client
(
    client_id bigint      not null
        primary key,
    address   varchar(50) null,
    type      char        null
);

create table individual
(
    name      varchar(20) null,
    surname   varchar(20) null,
    client_id bigint      not null
        primary key,
    constraint FK_client_to_individual
        foreign key (client_id) references client (client_id)
);

create table company
(
    company_name varchar(20) null,
    industry     varchar(30) null,
    client_id    bigint      not null
        primary key,
    constraint FK_client_to_company
        foreign key (client_id) references client (client_id)
);

#select all companies & individuals
select c.client_id, c.address, c.type, c2.company_name, c2.industry, i.name, i.surname
from client c
    left join company c2 on c.client_id = c2.client_id
    left join individual i on c.client_id = i.client_id;
