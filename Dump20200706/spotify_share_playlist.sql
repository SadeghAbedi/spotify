-- MySQL dump 10.13  Distrib 8.0.20, for Linux (x86_64)
--
-- Host: spotifydatabase.mysql.database.azure.com    Database: spotify
-- ------------------------------------------------------
-- Server version	5.6.42.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `share_playlist`
--

DROP TABLE IF EXISTS `share_playlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `share_playlist` (
  `playlistId` int(11) NOT NULL,
  `userName1` varchar(30) NOT NULL,
  `userName2` varchar(30) NOT NULL,
  PRIMARY KEY (`playlistId`,`userName1`),
  KEY `userName_idx` (`userName1`),
  KEY `userName2_idx` (`userName2`),
  CONSTRAINT `playlistId` FOREIGN KEY (`playlistId`) REFERENCES `playlist` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userName1` FOREIGN KEY (`userName1`) REFERENCES `user` (`userName`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userName2` FOREIGN KEY (`userName2`) REFERENCES `user` (`userName`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `share_playlist`
--

LOCK TABLES `share_playlist` WRITE;
/*!40000 ALTER TABLE `share_playlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `share_playlist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-06 15:39:55
