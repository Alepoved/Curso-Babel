
INSERT INTO almacenes (lugar,capacidad) VALUES ("lugar1",3000), ("lugar2",2305),("lugar3",1900),("lugar4",5000);

INSERT INTO cajas ( num_referencia,contenido, valor, almacen) VALUES
("1wert","contenido1",50,1),
("2wert","contenido2",20,2),
("3wert","contenido3",89,1),
("4wert","contenido4",200,3),
("5wert","contenido5",56,4),
("6wert","contenido6",150,3),
("7wert","contenido7",90,4);

-- 3.1. Obtener todos los almacenes.
SELECT * FROM almacenes;
-- 3.2. Obtener todas las cajas cuyo contenido tenga un valor superior a 150 €.
SELECT * FROM cajas WHERE valor > 150;
-- 3.3. Obtener los tipos de contenidos de las cajas.
SELECT contenido FROM cajas;
-- 3.4. Obtener el valor medio de todas las cajas.
SELECT avg(valor) FROM cajas;
-- 3.5. Obtener el valor medio de las cajas de cada almacén.
SELECT almacen,avg(valor) FROM cajas GROUP BY almacen;
-- 3.6. Obtener los códigos de los almacenes en los cuales el valor medio de las cajas
-- sea superior a 150 €.
SELECT almacen FROM cajas GROUP BY almacen HAVING AVG(valor) > 150;
-- 3.7. Obtener el número de referencia de cada caja junto con el nombre de la ciudad
-- en el que se encuentra.
SELECT c.num_referencia,a.lugar FROM cajas c JOIN almacenes a ON c.num_referencia=a.codigo;
-- 3.8. Obtener el número de cajas que hay en cada almacén.
SELECT almacen,count(num_referencia) FROM cajas GROUP BY almacen;
-- 3.9. Obtener los códigos de los almacenes que estén saturados (los almacenes
-- donde el número de cajas es superior a la capacidad).
SELECT codigo FROM almacenes WHERE (SELECT count(num_referencia) FROM cajas WHERE almacen=codigo GROUP BY almacen) > capacidad;
-- 3.10. Obtener los números de referencia de las cajas que están en Bilbao.
SELECT num_referencia FROM cajas c JOIN almacenes a ON c.almacen=a.codigo WHERE a.lugar = "lugar2";
-- 3.11. Insertar un nuevo almacén en Barcelona con capacidad para 3 cajas.
INSERT INTO almacenes(lugar,capacidad) VALUES ("Barcelona",3);
-- 3.12. Insertar una nueva caja, con número de referencia 'H5RT', con contenido
-- 'Papel', valor 200, y situada en el almacén 2.
INSERT INTO cajas VALUES ("H5RT","papel",200,2);
-- 3.13. Rebajar el valor de todas las cajas un 15 %.
UPDATE cajas SET valor=valor*0.85;
-- 3.14. Rebajar un 20 % el valor de todas las cajas cuyo valor sea superior al valor
-- medio de todas las cajas.
UPDATE cajas c SET c.valor=c.valor*0.8 WHERE
(SELECT num_referencia FROM (SELECT * FROM cajas) AS something WHERE c.num_referencia=num_referencia  GROUP BY num_referencia HAVING avg(valor)) > valor;
-- 3.15. Eliminar todas las cajas cuyo valor sea inferior a 100 €.
DELETE FROM cajas WHERE valor < 100;
-- 3.16. Vaciar el contenido de los almacenes que estén saturados.
DELETE FROM cajas WHERE almacen IN (
SELECT codigo FROM almacenes WHERE (SELECT count(num_referencia) FROM cajas WHERE almacen=codigo GROUP BY almacen) > capacidad);

