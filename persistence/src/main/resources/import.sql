
insert into borrower (first_name, last_name ,username, passwd) values ( 'Maciek' ,'Skrobiszewski', 'maciejskro', 'start123$');
insert into borrower (first_name, last_name ,username, passwd) values ( 'Wojciech' ,'Kowalski', 'wojciech', 'start123$');

insert into author (firstname, lastname, placeofborn) values( 'Adam' , 'Mickiewicz', 'Zaosie');
insert into author (firstname, lastname, placeofborn) values('Henryk', 'Sienkiewicz','Wola Okrzejska');
insert into author (firstname, lastname, placeofborn) values('Maria', 'Konopnicka','Suwałki')

insert into book (isbn, bookstype, description, isborrow, pages, releasedate, title) values ( '34454354' , 'POEM' , 'pomemat ' , false, 296, '2011-01-02' ,'Pan Tadeusz' );
insert into book (isbn, bookstype, description, isborrow, pages, releasedate, title) values ('9788376487724', 'POEM' , 'pomemat ' , false, 455, '2011-01-02' ,'Pan Wołodyjowski' );
insert into book (isbn, bookstype, description, isborrow, pages, releasedate, title) values ('9788378450474', 'POEM', 'bajki dla dzieci',false,80, '2011-04-22','Bajki rymowanki' );


insert into book_author( authors_id, book_id) values (1,1);
insert into book_author(authors_id,book_id) values (2,2);
insert into book_author(authors_id,book_id) values (3,3);
insert into book_author(authors_id,book_id) values (1,2);

