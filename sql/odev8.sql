/* test veritabanınızda employee isimli sütun bilgileri id(INTEGER), 
name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım. */

CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE NOT NULL,
    email VARCHAR(100)
); 

/* Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim. */

insert into employee (first_name, last_name, email, birthday) values ('Bendix', 'Spellworth', 'bspellworth0@businessinsider.com', '1993-02-15');
insert into employee (first_name, last_name, email, birthday) values ('Alfie', 'Cowperthwaite', 'acowperthwaite1@multiply.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Barbabas', 'Eisig', 'beisig2@ebay.com', '2004-09-05');
insert into employee (first_name, last_name, email, birthday) values ('Ephraim', 'Iron', 'eiron3@rediff.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Garth', 'Hurdiss', 'ghurdiss4@dedecms.com', '1996-11-27');
insert into employee (first_name, last_name, email, birthday) values ('Leroy', 'Bitterton', null, null);
insert into employee (first_name, last_name, email, birthday) values ('Lexi', 'Faltin', 'lfaltin6@sogou.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Brandy', 'Dumbar', 'bdumbar7@pinterest.com', '2021-02-20');
insert into employee (first_name, last_name, email, birthday) values ('Archaimbaud', 'Eyam', 'aeyam8@vinaora.com', '2006-10-01');
insert into employee (first_name, last_name, email, birthday) values ('Nyssa', 'Urien', 'nurien9@cbsnews.com', '2012-08-13');
insert into employee (first_name, last_name, email, birthday) values ('Lyndell', 'Whightman', 'lwhightmana@gizmodo.com', '1998-01-24');
insert into employee (first_name, last_name, email, birthday) values ('Gaspar', 'Witnall', 'gwitnallb@rediff.com', '2007-05-23');
insert into employee (first_name, last_name, email, birthday) values ('Johan', 'Lanfere', 'jlanferec@github.io', null);
insert into employee (first_name, last_name, email, birthday) values ('Gonzales', 'Lyttle', 'glyttled@engadget.com', '1996-10-16');
insert into employee (first_name, last_name, email, birthday) values ('Haven', 'Bernardini', 'hbernardinie@ask.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Rosalie', 'Ferriman', 'rferrimanf@geocities.jp', '1995-01-11');
insert into employee (first_name, last_name, email, birthday) values ('John', 'Remington', null, '1998-02-13');
insert into employee (first_name, last_name, email, birthday) values ('Jasun', 'Paolotto', 'jpaolottoh@cbslocal.com', '2017-09-30');
insert into employee (first_name, last_name, email, birthday) values ('Hedy', 'Sullly', 'hsulllyi@indiegogo.com', '1989-01-07');
insert into employee (first_name, last_name, email, birthday) values ('Twyla', 'Calver', 'tcalverj@merriam-webster.com', '1980-01-24');
insert into employee (first_name, last_name, email, birthday) values ('Estrellita', 'Flott', 'eflottk@csmonitor.com', '1991-03-07');
insert into employee (first_name, last_name, email, birthday) values ('Randene', 'Benbough', 'rbenboughl@about.me', null);
insert into employee (first_name, last_name, email, birthday) values ('Charo', 'Silverton', null, '2004-02-25');
insert into employee (first_name, last_name, email, birthday) values ('Gigi', 'Divina', 'gdivinan@shinystat.com', '2020-12-20');
insert into employee (first_name, last_name, email, birthday) values ('Miquela', 'Carvilla', 'mcarvillao@unicef.org', '2006-06-12');
insert into employee (first_name, last_name, email, birthday) values ('Dorolice', 'Dachs', 'ddachsp@moonfruit.com', '1983-11-04');
insert into employee (first_name, last_name, email, birthday) values ('Maryanna', 'Barense', 'mbarenseq@ifeng.com', '2018-03-02');
insert into employee (first_name, last_name, email, birthday) values ('Nessa', 'Goley', 'ngoleyr@sbwire.com', '2021-10-16');
insert into employee (first_name, last_name, email, birthday) values ('Cami', 'Arnault', null, '2013-04-03');
insert into employee (first_name, last_name, email, birthday) values ('Jimmy', 'Mance', 'jmancet@statcounter.com', '2022-12-24');
insert into employee (first_name, last_name, email, birthday) values ('Gar', 'Breston', 'gbrestonu@cbc.ca', null);
insert into employee (first_name, last_name, email, birthday) values ('Sindee', 'Merriott', 'smerriottv@homestead.com', '2008-07-20');
insert into employee (first_name, last_name, email, birthday) values ('Brina', 'Summerson', 'bsummersonw@answers.com', '2020-05-24');
insert into employee (first_name, last_name, email, birthday) values ('Cherye', 'Antonucci', 'cantonuccix@friendfeed.com', '1990-06-23');
insert into employee (first_name, last_name, email, birthday) values ('Olly', 'Meininger', 'omeiningery@ed.gov', '1987-12-09');
insert into employee (first_name, last_name, email, birthday) values ('Kip', 'Donizeau', 'kdonizeauz@naver.com', '1995-04-18');
insert into employee (first_name, last_name, email, birthday) values ('Krissy', 'Domico', 'kdomico10@pagesperso-orange.fr', '2020-08-08');
insert into employee (first_name, last_name, email, birthday) values ('Catina', 'Goroni', null, null);
insert into employee (first_name, last_name, email, birthday) values ('Toddie', 'Andreix', 'tandreix12@uol.com.br', '1989-06-04');
insert into employee (first_name, last_name, email, birthday) values ('Maren', 'Corneille', null, '2004-12-14');
insert into employee (first_name, last_name, email, birthday) values ('Aldrich', 'Gethin', 'agethin14@zdnet.com', '2019-05-11');
insert into employee (first_name, last_name, email, birthday) values ('Alicia', 'Churms', 'achurms15@desdev.cn', '1991-03-21');
insert into employee (first_name, last_name, email, birthday) values ('Callie', 'Alvares', 'calvares16@nbcnews.com', '1993-08-23');
insert into employee (first_name, last_name, email, birthday) values ('Mareah', 'Delagnes', 'mdelagnes17@bloglines.com', '2019-08-04');
insert into employee (first_name, last_name, email, birthday) values ('Danit', 'Wogan', 'dwogan18@fotki.com', null);
insert into employee (first_name, last_name, email, birthday) values ('Dorothee', 'Snary', 'dsnary19@e-recht24.de', '1994-07-09');
insert into employee (first_name, last_name, email, birthday) values ('Hewett', 'Hechlin', 'hhechlin1a@comcast.net', '1982-05-19');
insert into employee (first_name, last_name, email, birthday) values ('Vassily', 'Durston', 'vdurston1b@businessinsider.com', '2017-06-01');
insert into employee (first_name, last_name, email, birthday) values ('Addie', 'Abade', 'aabade1c@wiley.com', '1993-12-19');
insert into employee (first_name, last_name, email, birthday) values ('Lacy', 'Brokenshaw', 'lbrokenshaw1d@ask.com', '2002-09-12');


/* Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım. */

UPDATE employee
SET name = 'Ensar'
WHERE id=22;


UPDATE employee
SET name='Erkam'
WHERE email = 'ntournayg@google.co.jp';

UPDATE employee
SET name='Dany'
WHERE birthday = '1982-05-19';

UPDATE employee
SET birthday= '1994-10-25'
WHERE name = 'Hello World';

UPDATE employee
SET email='oguzhan@mail.com'
WHERE birthday = '1940-02-15';


/* Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım. */

DELETE FROM employee
WHERE id=12;

DELETE FROM employee
WHERE birthday='1993-08-23';

DELETE FROM employee
WHERE last_name= 'Brokenshaw';

DELETE FROM employee
WHERE email='durston1b@businessinsider.com';

DELETE FROM employee
WHERE name='Addie';