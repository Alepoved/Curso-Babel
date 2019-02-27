
INSERT INTO peliculas (nombre,calificacionEdad) VALUES ("pelicula1",16), ("pelicula2",20),("pelicula3",8),("pelicula4",14);

INSERT INTO salas (nombre,pelicula) VALUES
("sala1",1),
("sala2",2),
("sala1",1),
("sala3",3),
("sala1",4),
("sala2",3),
("sala3",4);

-- 4.1. Mostrar las distintas calificaciones de edad que existen.
SELECT calificacionEdad FROM peliculas;
-- 4.2. Mostrar todas las películas que no han sido calificadas.
INSERT INTO peliculas (nombre) VALUES ("pelicula6");
SELECT * FROM peliculas WHERE calificacionEdad IS NULL;
-- 4.3. Mostrar la información de odas las salas y, si se proyecta alguna película en la
-- sala, mostrar también la información de la película.
INSERT INTO salas (nombre) VALUES ("sala4");
SELECT * FROM salas s LEFT JOIN peliculas p ON s.pelicula=p.codigo;
-- 4.4. Mostrar la información de todas las películas y, si se proyecta en alguna sala,
-- mostrar también la información de la sala.
SELECT * FROM peliculas p LEFT JOIN salas s ON s.pelicula=p.codigo;
-- 4.5. Mostrar los nombres de las películas que no se proyectan en ninguna sala.
SELECT * FROM peliculas p LEFT JOIN salas s ON s.pelicula=p.codigo WHERE s.codigo IS NULL;
-- 4.6. Añadir una nueva película 'Uno, Dos, Tres', para mayores de 7 años.
INSERT INTO peliculas(nombre,calificacionEdad) VALUES ("Uno, Dos, Tres",7);
-- 4.7. Hacer constar que todas las películas no calificadas han sido calificadas 'no
-- recomendables para menores de 13 años'.
SELECT * FROM peliculas p WHERE calificacionEdad<13;
-- 4.8. Eliminar todas las salas que proyectan películas recomendadas para todos los
-- públicos.
INSERT INTO peliculas(nombre,calificacionEdad) VALUES ("Todos publicos",0);
DELETE FROM salas WHERE pelicula IN (
	SELECT codigo FROM peliculas where calificacionEdad=0
);

