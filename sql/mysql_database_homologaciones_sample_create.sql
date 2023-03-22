/*DROP DATABASE IF EXISTS `sample`;*/
CREATE DATABASE IF NOT EXISTS `sample`;
USE `sample`;

CREATE TABLE IF NOT EXISTS `materia` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `estudiante` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `profesor` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `pensum` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `jefe` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `administrador` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `comite_asuntos_estudiantiles` (
	`id`								BIGINT				NOT NULL PRIMARY KEY,
	`value`								VARCHAR(255)			NULL DEFAULT NULL
);
