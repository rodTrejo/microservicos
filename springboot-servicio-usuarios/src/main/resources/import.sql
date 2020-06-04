insert into usuarios (username, password, enabled, nombre, apellido, email) values ('rodrigo', '$2a$10$saZDldfbjnZI9RcN4FY7Wu5iGVC5pV8G27LOrCMGh631Qqjl1QTGG', true, 'Rodrigo Noé', 'Trejo', 'rodrigo@mail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) values ('admin', '$2a$10$94bZopYAbCg0csQQR38HE.oh/HrtB9HKwjvUqi5OyOQ9WhrGi7S9K', true, 'Adan', 'Trejo', 'adan@mail.com');

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into usuarios_roles (usuario_id, role_id) values (1, 1);
insert into usuarios_roles (usuario_id, role_id) values (2, 2);
insert into usuarios_roles (usuario_id, role_id) values (2, 1);