
CREATE TABLE IF NOT EXISTS `tours` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `artist` VARCHAR(255) NOT NULL,
  `manager` VARCHAR(255) NOT NULL,
  `agent` VARCHAR(255) NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS `bookings` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `tourId` INTEGER NOT NULL,
  `venue` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contactName` varchar(255) DEFAULT NULL,
  `contactNumber` varchar(255) DEFAULT NULL,
  `timeOnStage` varchar(255) DEFAULT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FKbookings_tourId` FOREIGN KEY (`tourId`) REFERENCES `tours` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;