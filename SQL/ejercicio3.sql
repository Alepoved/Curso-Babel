USE `ejercicio3`;

INSERT INTO departamentos (nombre,presupuesto) VALUES ("DP1",3000), ("DP2",2305),("DP3",1900),("DP4",5000);

INSERT INTO empleados ( dni,nombre, apellidos, departamento) VALUES
("05952717H","julian","perez",1),
("15952717L","ramon","hernandez",2),
("25952717P","gandalf","perez",1),
("35952717R","pepito","povedano",3),
("45952717Q","maria","ramon",4),
("55952717T","elena","lopez",3),
("65952717Y","eustakia","perez",4);

-- 2.1. Obtener los apellidos de los empleados.
SELECT e.apellidos FROM empleados e;
-- 2.2. Obtener los apellidos de los empleados sin repeticiones.
SELECT distinct(e.apellidos) FROM empleados e;
-- 2.3. Obtener todos los datos de los empleados que se apellidan 'López'.
-- 2.4. Obtener todos los datos de los empleados que se apellidan 'López' ó 'Pérez'.
-- 2.5. Obtener todos los datos de los empleados que trabajan para el departamento
-- 14.
-- 2.6. Obtener todos los datos de los empleados que trabajan para el departamento
-- 37 y para el departamento 77.
-- 2.7. Obtener todos los datos de los empleados cuyo apellido comience por 'P'.
-- 2.8. Obtener el presupuesto total de todos los departamentos.
-- 2.9. Obtener el número de empleados en cada departamento.
-- 2.10. Obtener un listado completo de empleados, incluyendo por cada empleado los
-- datos del empleado y de su departamento.
-- 2.11. Obtener un listado completo de empleados, incluyendo el nombre y apellidos
-- del empleado junto al nombre y presupuesto de su departamento.
-- 2.12. Obtener los nombres y apellidos de los empleados que trabajen en
-- departamentos cuyo presupuesto sea mayor de 60.000 €.
-- 2.13. Obtener los datos de los departamentos cuyo presupuesto es superior al
-- presupuesto medio de todos los departamentos.
-- 2.14. Obtener los nombres (únicamente los nombres) de los departamentos que
-- tienen más de dos empleados.
-- 2.15. Añadir un nuevo departamento: 'Calidad', con presupuesto de 40.000 € y
-- código 11. Añadir un empleado vinculado al departamento recién creado:
-- Esther Vázquez, DNI: 89267109.
-- 2.16. Aplicar un recorte presupuestario del 10 % a todos los departamentos.
-- 2.17. Reasignar a los empleados del departamento de investigación (código 77) al
-- departamento de informática (código 14).
-- 2.18. Despedir a todos los empleados que trabajan para el departamento de
-- informática a (código 14).
-- 2.19. Despedir a todos los empleados que trabajen para departamentos cuyo
-- presupuesto sea superior a los 60.000 €.
-- 2.20. Despedir a todos los empleados.