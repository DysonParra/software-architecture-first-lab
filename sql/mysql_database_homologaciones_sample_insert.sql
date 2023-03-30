
INSERT INTO `sample`.`materia` (`id`, `value`) VALUES ('1', 'first_materia');
INSERT INTO `sample`.`materia` (`id`, `value`) VALUES ('2', 'second_materia');
INSERT INTO `sample`.`materia` (`id`, `value`) VALUES ('3', 'third_materia');
INSERT INTO `sample`.`materia` (`id`, `value`) VALUES ('4', 'fourth_materia');
INSERT INTO `sample`.`materia` (`id`, `value`) VALUES ('5', 'fifth_materia');

INSERT INTO `sample`.`estudiante` (`id`, `value`) VALUES ('1', 'first_estudiante');
INSERT INTO `sample`.`estudiante` (`id`, `value`) VALUES ('2', 'second_estudiante');
INSERT INTO `sample`.`estudiante` (`id`, `value`) VALUES ('3', 'third_estudiante');
INSERT INTO `sample`.`estudiante` (`id`, `value`) VALUES ('4', 'fourth_estudiante');
INSERT INTO `sample`.`estudiante` (`id`, `value`) VALUES ('5', 'fifth_estudiante');

INSERT INTO `sample`.`profesor` (`id`, `value`) VALUES ('1', 'first_profesor');
INSERT INTO `sample`.`profesor` (`id`, `value`) VALUES ('2', 'second_profesor');
INSERT INTO `sample`.`profesor` (`id`, `value`) VALUES ('3', 'third_profesor');
INSERT INTO `sample`.`profesor` (`id`, `value`) VALUES ('4', 'fourth_profesor');
INSERT INTO `sample`.`profesor` (`id`, `value`) VALUES ('5', 'fifth_profesor');

INSERT INTO `sample`.`pensum` (`id`, `value`) VALUES ('1', 'first_pensum');
INSERT INTO `sample`.`pensum` (`id`, `value`) VALUES ('2', 'second_pensum');
INSERT INTO `sample`.`pensum` (`id`, `value`) VALUES ('3', 'third_pensum');
INSERT INTO `sample`.`pensum` (`id`, `value`) VALUES ('4', 'fourth_pensum');
INSERT INTO `sample`.`pensum` (`id`, `value`) VALUES ('5', 'fifth_pensum');

INSERT INTO `sample`.`jefe` (`id`, `value`) VALUES ('1', 'first_jefe');
INSERT INTO `sample`.`jefe` (`id`, `value`) VALUES ('2', 'second_jefe');
INSERT INTO `sample`.`jefe` (`id`, `value`) VALUES ('3', 'third_jefe');
INSERT INTO `sample`.`jefe` (`id`, `value`) VALUES ('4', 'fourth_jefe');
INSERT INTO `sample`.`jefe` (`id`, `value`) VALUES ('5', 'fifth_jefe');

INSERT INTO `sample`.`administrador` (`id`, `value`) VALUES ('1', 'first_administrador');
INSERT INTO `sample`.`administrador` (`id`, `value`) VALUES ('2', 'second_administrador');
INSERT INTO `sample`.`administrador` (`id`, `value`) VALUES ('3', 'third_administrador');
INSERT INTO `sample`.`administrador` (`id`, `value`) VALUES ('4', 'fourth_administrador');
INSERT INTO `sample`.`administrador` (`id`, `value`) VALUES ('5', 'fifth_administrador');

INSERT INTO `sample`.`comite_asuntos_estudiantiles` (`id`, `value`) VALUES ('1', 'first_comite_asuntos_estudiantiles');
INSERT INTO `sample`.`comite_asuntos_estudiantiles` (`id`, `value`) VALUES ('2', 'second_comite_asuntos_estudiantiles');
INSERT INTO `sample`.`comite_asuntos_estudiantiles` (`id`, `value`) VALUES ('3', 'third_comite_asuntos_estudiantiles');
INSERT INTO `sample`.`comite_asuntos_estudiantiles` (`id`, `value`) VALUES ('4', 'fourth_comite_asuntos_estudiantiles');
INSERT INTO `sample`.`comite_asuntos_estudiantiles` (`id`, `value`) VALUES ('5', 'fifth_comite_asuntos_estudiantiles');

INSERT INTO `users` (`email`, `password`) VALUES
	('jefe.carrera1@udea.edu.co', '12345'),
	('jefe.carrera2@udea.edu.co', 'qwerty');

INSERT INTO `solicitudes` (`title`, `student`, `justification`, `status`) VALUES
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