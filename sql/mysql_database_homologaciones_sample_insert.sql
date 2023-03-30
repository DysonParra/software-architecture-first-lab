INSERT INTO `sample`.`users` (`email`, `password`) VALUES
	('jefe.carrera1@udea.edu.co', '12345'),
	('jefe.carrera2@udea.edu.co', 'qwerty');

INSERT INTO `sample`.`solicitudes` (`title`, `student`, `justification`, `status`) VALUES
	('Homologación - Materia del tronco común',
		'Sofía García Ruiz',
		'Certifico que he cursado la asignatura de Álgebra linea en el semestre 2021-2, en la Universidad EAFIT. El promedio final obtenido en la asignatura fue de 4.2.',
		'Aprobada'),
	('Homologación - Materia del tronco común',
		'Javier Moreno González',
		'Certifico que he cursado la asignatura de Calculo integral en el semestre 2013-1, en la Universidad Nacional. El promedio final obtenido en la asignatura fue de 3.8',
		'Rechazada'),
	('Homologación - Materia del fuera del tronco común',
		'Juan Carlos López Sánchez',
		'Certifico que he cursado la asignatura de Bases de Datos en el semestre 2015-2, en la Universidad del valle. El promedio final obtenido en la asignatura fue de 4.7.',
		'Pendiente'),
	('Homologación - Materia del tronco común',
		'Ana María Pérez Gómez',
		'Certifico que he cursado la asignatura de Fisica Mecanica en el semestre 2016-2, en la Universidad San Buenaventura. El promedio final obtenido en la asignatura fue de 3.2',
		'Aprobada'),
	('Homologación - Materia del fuera del tronco común',
		'Carlos Andrés Fernández Mendoza',
		'Certifico que he cursado la asignatura de Calidad de Software en el semestre 2022 - 2, en el ITM. El promedio final obtenido en la asignatura fue de 3.6',
		'Pendiente');

INSERT INTO `sample`.`estudiante` (`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`, `fecha_ingreso`, `estrato`) VALUES
	/*(`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`, `fecha_ingreso`, `estrato`)*/
	(1000, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(1999, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO `sample`.`jefe` (`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`, `codigo_programa`) VALUES
	/*(`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`, `codigo_programa`)*/
	(2000, NULL, NULL, NULL, NULL, NULL, NULL),
	(2999, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO `sample`.`profesor` (`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`, `fecha_vinculacion`) VALUES
	/*(`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`, `fecha_vinculacion`)*/
	(3000, NULL, NULL, NULL, NULL, NULL, NULL),
	(3999, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO `sample`.`administrador` (`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`) VALUES
	/*(`cedula`, `nombre`, `apellido`, `correo_institucional`, `correo_personal`, `telefono`)*/
	(4000, NULL, NULL, NULL, NULL, NULL),
	(4999, NULL, NULL, NULL, NULL, NULL);

INSERT INTO `sample`.`comite_asuntos_estudiantiles` (`id`, `correo_institucional`, `telefono`) VALUES
	/*(`id`, `correo_institucional`, `telefono`)*/
	(5000, NULL, NULL),
	(5999, NULL, NULL);

INSERT INTO `sample`.`materia` (`codigo`, `cantidad_creditos`, `nombre`, `prerequisito`, `correquisito`) VALUES
	/*(`codigo`, `cantidad_creditos`, `nombre`, `prerequisito`, `correquisito`)*/
	(6000, NULL, NULL, NULL, NULL),
	(6999, NULL, NULL, NULL, NULL);

INSERT INTO `sample`.`pensum` (`codigo`, `nombre_programa`, `version`) VALUES
	/*(`codigo`, `nombre_programa`, `version`)*/
	(7000, NULL, NULL),
	(7999, NULL, NULL);
