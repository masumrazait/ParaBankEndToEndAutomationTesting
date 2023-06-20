-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: mypersonaldata
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `population_data`
--

DROP TABLE IF EXISTS `population_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `population_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `state` varchar(50) NOT NULL,
  `year` int NOT NULL,
  `total_population` int NOT NULL,
  `male_population` int NOT NULL,
  `female_population` int NOT NULL,
  `children_population` int NOT NULL,
  `elderly_population` int NOT NULL,
  `deaths` int NOT NULL,
  `births` int NOT NULL,
  `educated_population` int NOT NULL,
  `uneducated_population` int NOT NULL,
  `average_education_level` float NOT NULL,
  `educated_girls` int NOT NULL,
  `educated_boys` int NOT NULL,
  `educated_women` int NOT NULL,
  `educated_men` int NOT NULL,
  `working_men` int NOT NULL,
  `working_women` int NOT NULL,
  `housewives` int NOT NULL,
  `working_boys` int NOT NULL,
  `working_girls` int NOT NULL,
  `government_working_men` int NOT NULL,
  `government_working_women` int NOT NULL,
  `private_working_men` int NOT NULL,
  `private_working_women` int NOT NULL,
  `men_working_abroad` int NOT NULL,
  `women_working_abroad` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `population_data`
--

LOCK TABLES `population_data` WRITE;
/*!40000 ALTER TABLE `population_data` DISABLE KEYS */;
INSERT INTO `population_data` VALUES (1,'New York City',2022,9000000,4200000,4800000,2000000,1200000,240000,280000,7000000,2000000,7.8,3500000,3000000,4000000,3000000,3000000,4000000,2000000,2000000,800000,1200000,800000,600000,400000,80000,120000),(2,'Los Angeles',2022,5000000,2400000,2600000,1000000,600000,120000,140000,4000000,1000000,6.5,2200000,1800000,2500000,1500000,1500000,2000000,1000000,1000000,400000,600000,400000,300000,200000,40000,60000),(3,'Chicago',2022,2800000,1300000,1500000,600000,350000,70000,80000,2200000,600000,7.2,1200000,1000000,1400000,1000000,1000000,1400000,700000,700000,280000,420000,300000,200000,140000,28000,42000),(4,'Houston',2022,2300000,1150000,1150000,500000,300000,60000,70000,1800000,500000,6.8,1000000,800000,1200000,800000,800000,1200000,600000,600000,240000,360000,250000,150000,100000,20000,30000),(5,'Phoenix',2022,1800000,880000,920000,400000,250000,50000,60000,1400000,400000,6.5,800000,600000,1000000,700000,700000,900000,400000,400000,160000,240000,180000,120000,80000,16000,24000),(6,'Dallas',2022,2100000,1000000,1100000,450000,280000,55000,65000,1600000,500000,6.2,900000,700000,1100000,800000,800000,1000000,500000,500000,200000,300000,220000,150000,100000,20000,30000),(7,'San Francisco',2022,900000,450000,450000,180000,100000,20000,25000,700000,200000,7.5,350000,300000,400000,300000,300000,400000,200000,200000,80000,120000,80000,60000,40000,8000,12000),(8,'Seattle',2022,800000,400000,400000,160000,90000,18000,20000,600000,200000,7,300000,250000,350000,250000,250000,350000,180000,180000,72000,108000,75000,50000,35000,7000,10000),(9,'Denver',2022,700000,350000,350000,140000,80000,16000,18000,550000,150000,6.8,280000,230000,320000,230000,230000,320000,160000,160000,64000,96000,68000,45000,32000,6400,9000),(10,'Miami',2022,600000,300000,300000,120000,70000,14000,16000,450000,150000,6.5,250000,200000,300000,200000,200000,300000,150000,150000,60000,90000,60000,40000,28000,5600,8000),(11,'Mumbai',2022,12000000,6000000,6000000,2500000,1500000,300000,350000,9000000,3000000,7.5,5000000,4000000,6000000,5000000,5000000,6000000,3000000,3000000,1200000,1800000,1300000,900000,600000,120000,180000),(12,'Delhi',2022,10000000,5000000,5000000,2000000,1200000,240000,280000,8000000,2000000,7.8,4000000,3500000,5000000,4000000,4000000,5000000,2000000,2000000,800000,1200000,900000,700000,500000,100000,150000),(13,'Bangalore',2022,9000000,4500000,4500000,1800000,1000000,200000,250000,7000000,2000000,7.2,3500000,3000000,4000000,3000000,3000000,4000000,2000000,2000000,800000,1200000,800000,600000,400000,80000,120000),(14,'Kolkata',2022,6000000,3000000,3000000,1200000,700000,140000,160000,4500000,1500000,6.8,2500000,2000000,3000000,2000000,2000000,3000000,1500000,1500000,600000,900000,600000,400000,300000,60000,90000),(15,'Chennai',2022,5500000,2700000,2800000,1100000,600000,120000,140000,4000000,1500000,6.5,2200000,1800000,2500000,2000000,2000000,2500000,1500000,1500000,600000,900000,500000,400000,250000,50000,75000),(16,'Hyderabad',2022,5000000,2400000,2600000,1000000,600000,120000,140000,4000000,1000000,6.5,2200000,1800000,2500000,1500000,1500000,2000000,1000000,1000000,400000,600000,400000,300000,200000,40000,60000),(17,'Tokyo',2022,14160602,6816020,7606020,8160602,1816020,861602,460602,11160602,8160602,7.8,1606020,4016020,6160602,4016020,4016020,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(18,'Shanghai',2022,26160602,18160602,18160602,1160602,8160602,616020,716020,60606020,6160602,7,11606020,9160602,16060602,9160602,9160602,16060602,6160602,6160602,2416020,8616020,2416020,1816020,1606020,241602,861602),(19,'Beijing',2022,11160602,1016020,1016020,2606020,1816020,261602,816020,9160602,6060602,7.2,4016020,4160602,6160602,4160602,4160602,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(20,'Amnour',2022,18160602,9160602,9160602,8016020,6060602,416020,401602,14160602,4160602,6.8,8160602,7160602,11606020,7160602,7160602,9160602,4160602,4160602,1616020,2416020,1616020,1606020,816020,161602,241602),(21,'Moscow',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(22,'Istanbul',2022,10160602,7016020,7016020,8160602,1816020,861602,460602,16060602,8160602,6.8,6160602,1160602,7160602,1160602,1160602,6160602,2016020,2016020,1160602,1016020,1160602,701602,116020,116020,101602),(23,'Lahore',2022,11606020,1160602,1160602,6060602,1606020,241602,281602,8160602,6060602,6.2,4160602,8016020,1160602,8016020,8016020,4016020,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(24,'Bangkok',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(25,'London',2022,9160602,4606020,4816020,6060602,1606020,241602,281602,7160602,6060602,7.8,8016020,8160602,4160602,8160602,8160602,4160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(26,'Paris',2022,8160602,8816020,4606020,1816020,1160602,606020,241602,6160602,6060602,7.2,8160602,2016020,8016020,2016020,2016020,8160602,1016020,1016020,616020,916020,616020,401602,816020,61602,91602),(27,'Berlin',2022,6160602,2916020,8116020,1606020,716020,141602,161602,4016020,1016020,7,2606020,6060602,8160602,6060602,6060602,2016020,1606020,1606020,481602,760602,116020,801602,201602,11602,70120),(28,'Nobonagar',2022,14160602,6816020,7606020,8160602,1816020,861602,460602,11160602,8160602,7.8,1606020,4016020,6160602,4016020,4016020,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(29,'DelhiJamnita',2022,26160602,18160602,18160602,1160602,8160602,616020,716020,60606020,6160602,7,11606020,9160602,16060602,9160602,9160602,16060602,6160602,6160602,2416020,8616020,2416020,1816020,1606020,241602,861602),(30,'Rajwada',2022,11160602,1016020,1016020,2606020,1816020,261602,816020,9160602,6060602,7.2,4016020,4160602,6160602,4160602,4160602,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(31,'Khajrana',2022,18160602,9160602,9160602,8016020,6060602,416020,401602,14160602,4160602,6.8,8160602,7160602,11606020,7160602,7160602,9160602,4160602,4160602,1616020,2416020,1616020,1606020,816020,161602,241602),(32,'Annapurna',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(33,'Vijay Nagar',2022,10160602,7016020,7016020,8160602,1816020,861602,460602,16060602,8160602,6.8,6160602,1160602,7160602,1160602,1160602,6160602,2016020,2016020,1160602,1016020,1160602,701602,116020,116020,101602),(34,'Sudama Nagar',2022,11606020,1160602,1160602,6060602,1606020,241602,281602,8160602,6060602,6.2,4160602,8016020,1160602,8016020,8016020,4016020,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(35,'Mahalaxmi Nagar',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(36,'Palasia',2022,9160602,4606020,4816020,6060602,1606020,241602,281602,7160602,6060602,7.8,8016020,8160602,4160602,8160602,8160602,4160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(37,'Navlakha',2022,8160602,8816020,4606020,1816020,1160602,606020,241602,6160602,6060602,7.2,8160602,2016020,8016020,2016020,2016020,8160602,1016020,1016020,616020,916020,616020,401602,816020,61602,91602),(38,'Sudama Nagar',2022,6160602,2916020,8116020,1606020,716020,141602,161602,4016020,1016020,7,2606020,6060602,8160602,6060602,6060602,2016020,1606020,1606020,481602,760602,116020,801602,201602,11602,70120),(39,'Bengali Square',2022,14160602,6816020,7606020,8160602,1816020,861602,460602,11160602,8160602,7.8,1606020,4016020,6160602,4016020,4016020,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(40,'Jail Road',2022,26160602,18160602,18160602,1160602,8160602,616020,716020,60606020,6160602,7,11606020,9160602,16060602,9160602,9160602,16060602,6160602,6160602,2416020,8616020,2416020,1816020,1606020,241602,861602),(41,'Ring Road',2022,11160602,1016020,1016020,2606020,1816020,261602,816020,9160602,6060602,7.2,4016020,4160602,6160602,4160602,4160602,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(42,'Niranjanpur',2022,18160602,9160602,9160602,8016020,6060602,416020,401602,14160602,4160602,6.8,8160602,7160602,11606020,7160602,7160602,9160602,4160602,4160602,1616020,2416020,1616020,1606020,816020,161602,241602),(43,'Chhavani',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(44,'Wright Town',2022,10160602,7016020,7016020,8160602,1816020,861602,460602,16060602,8160602,6.8,6160602,1160602,7160602,1160602,1160602,6160602,2016020,2016020,1160602,1016020,1160602,701602,116020,116020,101602),(45,'Sadar',2022,11606020,1160602,1160602,6060602,1606020,241602,281602,8160602,6060602,6.2,4160602,8016020,1160602,8016020,8016020,4016020,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(46,'Russel Chowk',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(47,'Garha',2022,9160602,4606020,4816020,6060602,1606020,241602,281602,7160602,6060602,7.8,8016020,8160602,4160602,8160602,8160602,4160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(48,'Ranital',2022,8160602,8816020,4606020,1816020,1160602,606020,241602,6160602,6060602,7.2,8160602,2016020,8016020,2016020,2016020,8160602,1016020,1016020,616020,916020,616020,401602,816020,61602,91602),(49,'Gorakhpur',2022,6160602,2916020,8116020,1606020,716020,141602,161602,4016020,1016020,7,2606020,6060602,8160602,6060602,6060602,2016020,1606020,1606020,481602,760602,116020,801602,201602,11602,70120),(50,'Gohalpur',2022,14160602,6816020,7606020,8160602,1816020,861602,460602,11160602,8160602,7.8,1606020,4016020,6160602,4016020,4016020,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(51,'Kachpura',2022,26160602,18160602,18160602,1160602,8160602,616020,716020,60606020,6160602,7,11606020,9160602,16060602,9160602,9160602,16060602,6160602,6160602,2416020,8616020,2416020,1816020,1606020,241602,861602),(52,'Gwarighat',2022,11160602,1016020,1016020,2606020,1816020,261602,816020,9160602,6060602,7.2,4016020,4160602,6160602,4160602,4160602,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(53,'Adhartal',2022,18160602,9160602,9160602,8016020,6060602,416020,401602,14160602,4160602,6.8,8160602,7160602,11606020,7160602,7160602,9160602,4160602,4160602,1616020,2416020,1616020,1606020,816020,161602,241602),(54,'Tilwara',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(55,'Chhapra',2022,10160602,7016020,7016020,8160602,1816020,861602,460602,16060602,8160602,6.8,6160602,1160602,7160602,1160602,1160602,6160602,2016020,2016020,1160602,1016020,1160602,701602,116020,116020,101602),(56,'Baniapur',2022,11606020,1160602,1160602,6060602,1606020,241602,281602,8160602,6060602,6.2,4160602,8016020,1160602,8016020,8016020,4016020,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(57,'Jalalpur',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(58,'Manjhi',2022,9160602,4606020,4816020,6060602,1606020,241602,281602,7160602,6060602,7.8,8016020,8160602,4160602,8160602,8160602,4160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(59,'Dharampur',2022,8160602,8816020,4606020,1816020,1160602,606020,241602,6160602,6060602,7.2,8160602,2016020,8016020,2016020,2016020,8160602,1016020,1016020,616020,916020,616020,401602,816020,61602,91602),(60,'Panapur',2022,6160602,2916020,8116020,1606020,716020,141602,161602,4016020,1016020,7,2606020,6060602,8160602,6060602,6060602,2016020,1606020,1606020,481602,760602,116020,801602,201602,11602,70120),(61,'Belsar',2022,14160602,6816020,7606020,8160602,1816020,861602,460602,11160602,8160602,7.8,1606020,4016020,6160602,4016020,4016020,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(62,'Chhapra Ghat',2022,26160602,18160602,18160602,1160602,8160602,616020,716020,60606020,6160602,7,11606020,9160602,16060602,9160602,9160602,16060602,6160602,6160602,2416020,8616020,2416020,1816020,1606020,241602,861602),(63,'Marhaura',2022,11160602,1016020,1016020,2606020,1816020,261602,816020,9160602,6060602,7.2,4016020,4160602,6160602,4160602,4160602,6160602,8160602,8160602,1606020,1816020,1606020,916020,616020,160602,181602),(64,'Dighwara',2022,18160602,9160602,9160602,8016020,6060602,416020,401602,14160602,4160602,6.8,8160602,7160602,11606020,7160602,7160602,9160602,4160602,4160602,1616020,2416020,1616020,1606020,816020,161602,241602),(65,'Mashrakh',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(66,'Ekma',2022,10160602,7016020,7016020,8160602,1816020,861602,460602,16060602,8160602,6.8,6160602,1160602,7160602,1160602,1160602,6160602,2016020,2016020,1160602,1016020,1160602,701602,116020,116020,101602),(67,'Revelganj',2022,11606020,1160602,1160602,6060602,1606020,241602,281602,8160602,6060602,6.2,4160602,8016020,1160602,8016020,8016020,4016020,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(68,'Nagra',2022,16060602,6160602,6160602,2016020,1016020,816020,801602,9160602,8160602,6,4016020,4160602,6160602,4160602,4160602,1160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(69,'Parsa',2022,9160602,4606020,4816020,6060602,1606020,241602,281602,7160602,6060602,7.8,8016020,8160602,4160602,8160602,8160602,4160602,6060602,6060602,816020,1606020,816020,616020,416020,81602,160602),(70,'Naya Tola',2022,8160602,8816020,4606020,1816020,1160602,606020,241602,6160602,6060602,7.2,8160602,2016020,8016020,2016020,2016020,8160602,1016020,1016020,616020,916020,616020,401602,816020,61602,91602),(71,'Adapur',2022,6160602,2916020,8116020,1606020,716020,141602,161602,4016020,1016020,7,2606020,6060602,8160602,6060602,6060602,2016020,1606020,1606020,481602,760602,116020,801602,201602,11602,70120);
/*!40000 ALTER TABLE `population_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `population_data_v`
--

DROP TABLE IF EXISTS `population_data_v`;
/*!50001 DROP VIEW IF EXISTS `population_data_v`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `population_data_v` AS SELECT 
 1 AS `id`,
 1 AS `state`,
 1 AS `year`,
 1 AS `total_population`,
 1 AS `male_population`,
 1 AS `female_population`,
 1 AS `children_population`,
 1 AS `elderly_population`,
 1 AS `deaths`,
 1 AS `births`,
 1 AS `educated_population`,
 1 AS `uneducated_population`,
 1 AS `average_education_level`,
 1 AS `educated_girls`,
 1 AS `educated_boys`,
 1 AS `educated_women`,
 1 AS `educated_men`,
 1 AS `working_men`,
 1 AS `working_women`,
 1 AS `housewives`,
 1 AS `working_boys`,
 1 AS `working_girls`,
 1 AS `government_working_men`,
 1 AS `government_working_women`,
 1 AS `private_working_men`,
 1 AS `private_working_women`,
 1 AS `men_working_abroad`,
 1 AS `women_working_abroad`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping routines for database 'mypersonaldata'
--

--
-- Final view structure for view `population_data_v`
--

/*!50001 DROP VIEW IF EXISTS `population_data_v`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `population_data_v` AS select `population_data`.`id` AS `id`,`population_data`.`state` AS `state`,`population_data`.`year` AS `year`,`population_data`.`total_population` AS `total_population`,`population_data`.`male_population` AS `male_population`,`population_data`.`female_population` AS `female_population`,`population_data`.`children_population` AS `children_population`,`population_data`.`elderly_population` AS `elderly_population`,`population_data`.`deaths` AS `deaths`,`population_data`.`births` AS `births`,`population_data`.`educated_population` AS `educated_population`,`population_data`.`uneducated_population` AS `uneducated_population`,`population_data`.`average_education_level` AS `average_education_level`,`population_data`.`educated_girls` AS `educated_girls`,`population_data`.`educated_boys` AS `educated_boys`,`population_data`.`educated_women` AS `educated_women`,`population_data`.`educated_men` AS `educated_men`,`population_data`.`working_men` AS `working_men`,`population_data`.`working_women` AS `working_women`,`population_data`.`housewives` AS `housewives`,`population_data`.`working_boys` AS `working_boys`,`population_data`.`working_girls` AS `working_girls`,`population_data`.`government_working_men` AS `government_working_men`,`population_data`.`government_working_women` AS `government_working_women`,`population_data`.`private_working_men` AS `private_working_men`,`population_data`.`private_working_women` AS `private_working_women`,`population_data`.`men_working_abroad` AS `men_working_abroad`,`population_data`.`women_working_abroad` AS `women_working_abroad` from `population_data` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-21  5:08:38