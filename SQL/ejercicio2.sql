USE `ejercicio2`;

INSERT INTO fabricantes (codigo,nombre) VALUES (1,"Asus"), (2,"HP"),(3,"MSI"),(4,"Gigabyte");

INSERT INTO articulos ( nombre, precio, fabricante) VALUES
("raton gaming",1234,1),
("tarjeta grafica",1111,3),
("torre",4321,1),
("pantalla 1080",2222,4),
("silla gaming",3333,3),
("teclado led",40000,2),
("ram 16gb",1235,2);

-- 1.1. Obtener los nombres y los precios de los productos de la tienda.
SELECT a.nombre, a.precio FROM articulos a;
-- 1.2. Obtener el nombre de los productos cuyo precio sea mayor o igual a 200 €.
SELECT a.nombre, a.precio FROM articulos a WHERE a.precio >= 200;
-- 1.3. Obtener todos los datos de los artículos cuyo precio esté entre los 60 € y los
-- 120 € (ambas cantidades incluidas).
SELECT * FROM articulos a WHERE a.precio BETWEEN 1500 AND 4000;
-- 1.4. Obtener el nombre y el precio en pesetas (es decir, el precio en euros
-- multiplicado por 166'386).
SELECT a.nombre, (a.precio*166.386) as pesetas FROM articulos a;
-- 1.5. Seleccionar el precio medio de todos los productos.
SELECT avg(a.precio) FROM articulos a;
-- 1.6. Obtener el precio medio de los artículos cuyo código de fabricante sea 2.
SELECT avg(a.precio) FROM articulos a WHERE a.fabricante = 2;
-- 1.7. Obtener el número de artículos cuyo precio sea mayor o igual a 180 €.
SELECT avg(a.precio) FROM articulos a WHERE a.precio > 1500;
-- 1.8. Obtener el nombre y precio de los artículos cuyo precio sea mayor o igual a 180
-- € y ordenarlos descendentemente por precio, y luego ascendentemente por
-- nombre.
SELECT a.nombre, a.precio FROM articulos a WHERE a.precio > 1500 ORDER BY a.precio DESC, a.nombre ASC;
-- 1.9. Obtener un listado completo de artículos, incluyendo por cada articulo los
-- datos del articulo y de su fabricante.
SELECT * FROM articulos a JOIN fabricantes f ON a.fabricante=f.codigo;
-- 1.10. Obtener un listado de artículos, incluyendo el nombre del artículo, su precio, y
-- el nombre de su fabricante.
SELECT * FROM articulos a JOIN fabricantes f ON a.fabricante=f.codigo;
-- 1.11. Obtener el precio medio de los productos de cada fabricante, mostrando solo
-- los códigos de fabricante.
SELECT f.codigo,avg(a.precio) FROM articulos a JOIN fabricantes f ON a.fabricante=f.codigo GROUP BY f.nombre;
-- 1.12. Obtener el precio medio de los productos de cada fabricante, mostrando el
-- nombre del fabricante.
SELECT f.nombre,avg(a.precio) FROM articulos a JOIN fabricantes f ON a.fabricante=f.codigo GROUP BY f.nombre;
-- 1.13. Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio
-- medio sea mayor o igual a 150 €.
SELECT f.nombre, a.precio FROM articulos a JOIN fabricantes f ON a.fabricante=f.codigo WHERE a.precio > 1500;
-- 1.14. Obtener el nombre y precio del artículo más barato.
SELECT a.nombre,min(a.precio) FROM articulos a ORDER BY a.precio;
SELECT a.nombre,a.precio FROM articulos a WHERE a.precio=(select min(precio) from articulos);
-- 1.15. Obtener una lista con el nombre y precio de los artículos más caros de cada
-- proveedor (incluyendo el nombre del proveedor).
SELECT a.nombre,max(a.precio),f.nombre FROM articulos a JOIN fabricantes f ON a.fabricante=f.codigo GROUP BY f.codigo;
select max(precio) from articulos a GROUP BY a.fabricante;
-- 1.16. Añadir un nuevo producto: Altavoces de 70 € (del fabricante 2).
INSERT INTO articulos (nombre,precio,fabricante) VALUES ("altavoces",70,2);
-- 1.17. Cambiar el nombre del producto 8 a 'Impresora Laser'.
UPDATE articulos SET nombre="impresora laser" WHERE codigo=3;
-- 1.18. Aplicar un descuento del 10 % (multiplicar el precio por 0'9) a todos los
-- productos.
UPDATE articulos SET precio=precio*0.9;
-- 1.19. Aplicar un descuento de 10 € a todos los productos cuyo precio sea mayor o
-- igual a 120 €.
UPDATE articulos SET precio=precio*0.9 WHERE precio < 1500;
