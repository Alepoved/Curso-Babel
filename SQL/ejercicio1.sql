USE `curso-babel`;

INSERT INTO empresas (nombre) VALUES ("Cabify"), ("Delivero"),("Monstruos SA");

INSERT INTO usuarios (nombre, apellidos, usuario, password) VALUES
("Charly", "Falco", "falco",1234),
("Mike", "Kozinsky","kozinsky",1111),
("Bud", "Spencer","spencer",4321),
("Charlie", "Callahan","callahan",2222),
("Chuck", "Norris","norris",3333);

INSERT INTO ofertas (titulo, descripcion, salario, ciudad, empresa_id) VALUES
("Ruby Software Engineer", "Descripción Ruby Software Engineer", "43000", "Madrid", 3),
("iOS Engineer", "Descripción iOS Engineer", 30000, "Madrid", 3),
("Elixir Software Engineer", "Descripción Elixir Software Engineer", 44000, "Madrid", 3),
("Product Manager", "Descripción Product Manager", 83000, "Madrid", 3),
("Programadores Java", "Descripción Programadores Java", 0, "Sevilla", 1),
("Referente técnico Frontend", "Descripción Referente técnico Frontend", 0, "Madrid", 1),
("Estudiante de Ingeniería Informática", "Descripción Estudiante de Ingeniería Informática", 14, "Barcelona", 1),
("Business Analyst junior", "Descripción Business Analyst junior", 0, "Madrid", 2),
("Senior Android Developer (Mobile)", "Descripción Senior Android Developer (Mobile)", 40000, "Madrid", 2);

INSERT INTO ofertas_usuarios (oferta_id,usuario_id)
VALUES (1,1), (2,1), (1,2), (4,2), (5,4), (3,4), (7,5), (8,5), (9,5);

SELECT e.nombre, u.nombre FROM empresas e, usuarios u;

SELECT o.titulo, o.salario FROM ofertas o WHERE o.salario = 0;

SELECT * FROM ofertas o WHERE o.titulo LIKE "%software%";

SELECT * FROM ofertas o WHERE o.descripcion LIKE "Descripción%";

SELECT * FROM usuarios LIMIT 3;

SELECT distinct(o.salario) FROM ofertas o;

SELECT o.titulo FROM ofertas o WHERE o.salario >=30000 AND o.salario <=40000;

SELECT o.titulo FROM ofertas o WHERE o.salario BETWEEN 30000 AND 40000;

SELECT nombre, apellidos FROM usuarios WHERE id IN (1,3,4);

SELECT e.nombre FROM empresas e WHERE e.id IN (SELECT distinct(empresa_id) FROM ofertas WHERE salario >= 35000);

SELECT distinct(e.nombre) FROM empresas e JOIN ofertas o ON e.id = o.empresa_id WHERE salario >= 35000;

SELECT nombre FROM empresas WHERE exists(SELECT * FROM ofertas WHERE publicada=1);

SELECT * FROM ofertas ORDER BY salario DESC,titulo DESC;

SELECT * FROM ofertas WHERE salario=0 ORDER BY ciudad DESC LIMIT 1;

UPDATE ofertas SET ciudad="Nunca Jamas",publicada=0 WHERE id=8;

UPDATE ofertas SET salario=20000 WHERE ciudad!="Madrid" AND salario=0;

DELETE FROM empresas WHERE id=5;

SELECT count(*) FROM empresas;

SELECT avg(salario),max(salario),min(salario) FROM ofertas;

SELECT CONCAT(nombre," ",apellidos) FROM usuarios;

SELECT e.nombre,avg(o.salario) FROM ofertas o JOIN empresas e ON o.empresa_id=e.id group by (e.nombre);

SELECT u.nombre,u.apellidos,o.titulo FROM ofertas o LEFT JOIN ofertas_usuarios ou ON o.id = ou.oferta_id LEFT JOIN usuarios u ON ou.usuario_id=u.id;

SELECT u.nombre,u.apellidos,o.titulo FROM ofertas o JOIN ofertas_usuarios ou ON o.id = ou.oferta_id JOIN usuarios u ON ou.usuario_id=u.id;

-- Obtener todas las ofertas que hay publicadas para Sevilla y Barcelona.
SELECT * FROM ofertas WHERE ciudad IN("Sevilla","Barcelona");
-- Obtener el nombre de las ofertas a las que se ha apuntado el usuario con id 3.
SELECT o.titulo FROM ofertas o JOIN ofertas_usuarios ou ON o.id=ou.oferta_id WHERE ou.usuario_id=3;
-- Obtener el número total de ofertas a las que se ha apuntado el usuario con id 3.
SELECT count(*) FROM ofertas o JOIN ofertas_usuarios ou ON o.id=ou.oferta_id WHERE ou.usuario_id=3;
-- Obtener el nombre de los usuarios que se han apuntado a la oferta con id 2.
SELECT distinct(u.nombre),u.apellidos FROM usuarios u JOIN ofertas_usuarios ou ON u.id=ou.usuario_id  WHERE u.id=2;
-- Obtener el número total de usuarios que se han apuntado a la oferta con id 2.
SELECT count(*) FROM usuarios u JOIN ofertas_usuarios ou ON u.id=ou.usuario_id  WHERE ou.oferta_id=2;
-- Obtener las empresas que no han publicado ninguna oferta.
SELECT e.nombre FROM empresas e WHERE e.id NOT IN( SELECT o.empresa_id FROM ofertas o);
-- Obtener los usuarios que no están apuntados en ninguna oferta.
SELECT u.nombre FROM usuarios u WHERE u.id NOT IN( SELECT ou.usuario_id FROM ofertas_usuarios ou);
-- Obtener las empresas que han publicado más de 3 ofertas.
SELECT e.nombre FROM empresas e WHERE  (SELECT count(*) FROM ofertas o WHERE e.id=o.empresa_id) >3;
SELECT e.nombre FROM empresas e JOIN ofertas o ON e.id=o.empresa_id GROUP BY e.nombre HAVING COUNT(*) > 3;
-- Obtener los usuarios que se han apuntado a más de 3 ofertas.
SELECT u.nombre,u.apellidos FROM usuarios u WHERE (SELECT count(*) FROM ofertas_usuarios ou WHERE u.id=ou.usuario_id) >=3;
-- Obtener las ofertas con el número de usuarios que hay apuntados ordenadas por mayor número de apuntados.
SELECT o.titulo,count(ou.usuario_id) as cont FROM ofertas o JOIN ofertas_usuarios ou ON o.id=ou.oferta_id GROUP BY o.titulo ORDER BY cont DESC ;










