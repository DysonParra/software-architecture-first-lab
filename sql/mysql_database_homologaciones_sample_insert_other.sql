USE sample;

INSERT INTO `users` (`email`, `password`) VALUES
	('jefe.carrera1@udea.edu.co', '12345'),
	('jefe.carrera2@udea.edu.co', 'qwerty');

INSERT INTO `homologations` (`title`, `student`, `justification`, `status`) VALUES
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