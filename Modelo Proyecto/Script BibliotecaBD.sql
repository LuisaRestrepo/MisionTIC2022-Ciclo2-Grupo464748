-- MySQL Script generated by MySQL Workbench
-- Thu Aug 19 19:41:39 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema BibliotecaBD
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BibliotecaBD
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BibliotecaBD` DEFAULT CHARACTER SET utf8 ;
USE `BibliotecaBD` ;

-- -----------------------------------------------------
-- Table `BibliotecaBD`.`Perfiles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BibliotecaBD`.`Perfiles` (
  `idPerfiles` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPerfiles`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BibliotecaBD`.`Bibliotecas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BibliotecaBD`.`Bibliotecas` (
  `idBibliotecas` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBibliotecas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BibliotecaBD`.`Empleados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BibliotecaBD`.`Empleados` (
  `idEmpleado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `email` TEXT NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `clave` VARCHAR(45) NOT NULL,
  `fecha_registro` DATETIME NOT NULL DEFAULT now(),
  `Perfiles_idPerfiles` INT NOT NULL,
  `Bibliotecas_idBibliotecas` INT NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  INDEX `fk_Empleados_Perfiles_idx` (`Perfiles_idPerfiles` ASC) VISIBLE,
  INDEX `fk_Empleados_Bibliotecas1_idx` (`Bibliotecas_idBibliotecas` ASC) VISIBLE,
  CONSTRAINT `fk_Empleados_Perfiles`
    FOREIGN KEY (`Perfiles_idPerfiles`)
    REFERENCES `BibliotecaBD`.`Perfiles` (`idPerfiles`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleados_Bibliotecas1`
    FOREIGN KEY (`Bibliotecas_idBibliotecas`)
    REFERENCES `BibliotecaBD`.`Bibliotecas` (`idBibliotecas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BibliotecaBD`.`Autores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BibliotecaBD`.`Autores` (
  `idAutores` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAutores`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BibliotecaBD`.`Libros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BibliotecaBD`.`Libros` (
  `idLibros` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `codigo` VARCHAR(45) NOT NULL,
  `anio` YEAR NOT NULL,
  `fecha_ingreso` DATETIME NOT NULL DEFAULT now(),
  `fecha_salida` DATETIME NULL,
  `estado` BIT NOT NULL DEFAULT 1,
  `Autores_idAutores` INT NOT NULL,
  `Bibliotecas_idBibliotecas` INT NOT NULL,
  PRIMARY KEY (`idLibros`),
  INDEX `fk_Libros_Autores1_idx` (`Autores_idAutores` ASC) VISIBLE,
  INDEX `fk_Libros_Bibliotecas1_idx` (`Bibliotecas_idBibliotecas` ASC) VISIBLE,
  CONSTRAINT `fk_Libros_Autores1`
    FOREIGN KEY (`Autores_idAutores`)
    REFERENCES `BibliotecaBD`.`Autores` (`idAutores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Libros_Bibliotecas1`
    FOREIGN KEY (`Bibliotecas_idBibliotecas`)
    REFERENCES `BibliotecaBD`.`Bibliotecas` (`idBibliotecas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;