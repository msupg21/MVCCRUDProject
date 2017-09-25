-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema laptop
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `laptop` ;

-- -----------------------------------------------------
-- Schema laptop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `laptop` DEFAULT CHARACTER SET utf8 ;
USE `laptop` ;

-- -----------------------------------------------------
-- Table `laptop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `laptop` ;

CREATE TABLE IF NOT EXISTS `laptop` (
  `stockNum` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `seller` VARCHAR(45) NULL,
  `year` INT UNSIGNED NULL,
  `price` DECIMAL(10,2) NULL,
  `ram` VARCHAR(45) NULL,
  `processor` VARCHAR(45) NULL,
  `hard_drive` VARCHAR(45) NULL,
  PRIMARY KEY (`stockNum`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO laptopuser@localhost;
 DROP USER laptopuser@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'laptopuser'@'localhost' IDENTIFIED BY 'laptopuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'laptopuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `laptop`
-- -----------------------------------------------------
START TRANSACTION;
USE `laptop`;
INSERT INTO `laptop` (`stockNum`, `name`, `seller`, `year`, `price`, `ram`, `processor`, `hard_drive`) VALUES (1, 'MacBook Pro', 'Apple', 2017, 2400.95, '16', 'whatever', 'Yes');

COMMIT;

