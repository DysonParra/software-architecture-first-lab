/*DROP DATABASE IF EXISTS `sample`;*/
CREATE DATABASE IF NOT EXISTS `sample`;
USE `sample`;

/*DROP TABLE IF EXISTS `users`;*/
CREATE TABLE IF NOT EXISTS `users` (
	`email`							VARCHAR(255)		NOT NULL PRIMARY KEY,
	`password`						VARCHAR(255)			NULL DEFAULT NULL
); 

/*DROP TABLE IF EXISTS `solicitudes`;*/
CREATE TABLE IF NOT EXISTS `solicitudes` (
	`id`							BIGINT				NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`title`							VARCHAR(50)				NULL DEFAULT NULL,
	`student`						VARCHAR(100)			NULL DEFAULT NULL,
	`justification`					VARCHAR(255)			NULL DEFAULT NULL,
	`status`						VARCHAR(20)				NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `estudiante`;*/
CREATE TABLE IF NOT EXISTS `estudiante` (
	`cedula`							BIGINT				NOT NULL PRIMARY KEY,
	`nombre`							VARCHAR(255)			NULL DEFAULT NULL,
	`apellido`							VARCHAR(255)			NULL DEFAULT NULL,
	`correo_institucional`				VARCHAR(255)			NULL DEFAULT NULL,
	`correo_personal`					VARCHAR(255)			NULL DEFAULT NULL,
	`telefono`							BIGINT					NULL DEFAULT NULL,
	`fecha_ingreso`						DATE					NULL DEFAULT NULL,
	`estrato`							VARCHAR(255)			NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `jefe`;*/
CREATE TABLE IF NOT EXISTS `jefe` (
	`cedula`							BIGINT				NOT NULL PRIMARY KEY,
	`nombre`							VARCHAR(255)			NULL DEFAULT NULL,
	`apellido`							VARCHAR(255)			NULL DEFAULT NULL,
	`correo_institucional`				VARCHAR(255)			NULL DEFAULT NULL,
	`correo_personal`					VARCHAR(255)			NULL DEFAULT NULL,
	`telefono`							BIGINT					NULL DEFAULT NULL,
	`codigo_programa`					BIGINT					NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `profesor`;*/
CREATE TABLE IF NOT EXISTS `profesor` (
	`cedula`							BIGINT				NOT NULL PRIMARY KEY,
	`nombre`							VARCHAR(255)			NULL DEFAULT NULL,
	`apellido`							VARCHAR(255)			NULL DEFAULT NULL,
	`correo_institucional`				VARCHAR(255)			NULL DEFAULT NULL,
	`correo_personal`					VARCHAR(255)			NULL DEFAULT NULL,
	`telefono`							BIGINT					NULL DEFAULT NULL,
	`fecha_vinculacion`					DATE					NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `administrador`;*/
CREATE TABLE IF NOT EXISTS `administrador` (
	`cedula`							BIGINT				NOT NULL PRIMARY KEY,
	`nombre`							VARCHAR(255)			NULL DEFAULT NULL,
	`apellido`							VARCHAR(255)			NULL DEFAULT NULL,
	`correo_institucional`				VARCHAR(255)			NULL DEFAULT NULL,
	`correo_personal`					VARCHAR(255)			NULL DEFAULT NULL,
	`telefono`							BIGINT					NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `comite_asuntos_estudiantiles`;*/
CREATE TABLE IF NOT EXISTS `comite_asuntos_estudiantiles` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`correo_institucional`				VARCHAR(255)			NULL DEFAULT NULL,
	`telefono`							BIGINT					NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `materia`;*/
CREATE TABLE IF NOT EXISTS `materia` (
	`codigo`							BIGINT				NOT NULL PRIMARY KEY,
	`cantidad_creditos`					BIGINT					NULL DEFAULT NULL,
	`nombre`							VARCHAR(255)			NULL DEFAULT NULL,
	`prerequisito`						BIGINT					NULL DEFAULT NULL,
	`correquisito`						BIGINT					NULL DEFAULT NULL
);

/*DROP TABLE IF EXISTS `pensum`;*/
CREATE TABLE IF NOT EXISTS `pensum` (
	`codigo`							BIGINT				NOT NULL PRIMARY KEY,
	`nombre_programa`					VARCHAR(255)			NULL DEFAULT NULL,
	`version`							BIGINT					NULL DEFAULT NULL
);
