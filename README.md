Use Exposed Library from JetBrains. Used to connect to PostgreSQL database that's currently hosted on Heroku.
    https://github.com/JetBrains/Exposed

    It currently supports PostgreSQL, MySQL, MariaDB, Oracle, SQLite, H2, SQL Server

    Need to work on authentication. Need to somehow bridge Heroku security and Android Studio gradle.
    https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku#declare-app-dependencies
    https://devcenter.heroku.com/articles/connecting-to-relational-databases-on-heroku-with-java
    Or just whitelist all IP addresses

Make cure connectionlayer class is Async task or it will not work
