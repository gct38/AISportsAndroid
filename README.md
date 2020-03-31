Use Exposed Library from JetBrains. Used to connect to PostgreSQL database that's currently hosted on Heroku.

val db = Database.connect("jdbc:postgresql://ec2-23-21-225-251.compute-1.amazonaws.com:5432/d4tefl2m5ii7b7?sslmode=require&user=lruthoqamfsgna&password=5490aebc5c8ccdd3a97f0c287d00e55f3d702b4413d8ee1802a967d6c8706f10")
Form of Database connection string: jdbc:postgresql://<host>:<port>/<databasename>?sslmode=require&user=<username>&password=<password>
NEED: (all of which can be gotten from the Heroku database in Settings under Database Credentials)
    - host
    - port
    - database name
    - usename
    - password

https://github.com/JetBrains/Exposed

It currently supports PostgreSQL, MySQL, MariaDB, Oracle, SQLite, H2, SQL Server

Need to work on authentication. Need to somehow bridge Heroku security and Android Studio gradle.
https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku#declare-app-dependencies
https://devcenter.heroku.com/articles/connecting-to-relational-databases-on-heroku-with-java


Make cure connectionlayer class is Async task or it will not work



