Trabajo-Final
=============

Trabajo final de programación web

REQUISITOS

- jboss AS final 7.1.1  http://jbossas.jboss.org/downloads.html
- JDK 7                 http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
- netbeans 8 full       https://netbeans.org/downloads/
- MySQL 5.6             http://dev.mysql.com/downloads/mysql/     
- Git                   http://git-scm.com/
- mysql connector 5.1.23 http://www.java2s.com/Code/Jar/m/Downloadmysqlconnectorjava5123binjar.htm
- Colocar el connector en \jboss-as-7.1.1.Final\standalone\deployments 
- ejecutar como administrador \jboss-as-7.1.1.Final\bin\standalone.bat
- ejecutar como administrador \jboss-as-7.1.1.Final\bin\add-user.bat y agregar un usuario
- en el browser ir a localhost:9990 luego seleccionar profile->Available Datasources->add y completar los datos de la siguiente manera
  #name: prueba
  #jdni: java:jboos\prueba
  #driver: seleccionar el mysql-connector
  #connection URL: la url de la base de datos (se puede ver desde el netbeans->services->database->la conexion )
  #username: root
  #password: tu password
- luego de agregar seleccionar la conexion creada y hacer click en enable
- para probar que todo funciona bien ir a connection->test connection
  

