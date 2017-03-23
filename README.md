
### Spring MVC Hibernate Starter App:

#### Creating New Maven Project:

Create a new maven project:
```
mvn archetype:generate -DgroupId=com.jwt.spring -DartifactId=spring-hibernate-seed -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```
#### Converting the project to Eclipse Project
Convert the Created n Project to Eclipse project:
```
mvn eclipse:eclipse -Dwtpversion=2.0
```
#### Create Database Table:
```
--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `entering_date` date NOT NULL,
  `nationality` text NOT NULL,
  `code` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `code` (`code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
  
```
