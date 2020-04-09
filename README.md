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

QUERY HELP
https://www.baeldung.com/kotlin-exposed-persistence

COROUTINES
Coroutines similar to async task. Use for any network activity so it's not handled on main UI thread.
Make cure connectionlayer class uses coroutines or it will not work
https://heartbeat.fritz.ai/replacing-asynctask-in-android-with-kotlin-coroutines-to-handle-background-tasks-93108f8f2db
https://kotlinlang.org/docs/tutorials/coroutines/coroutines-basic-jvm.html
https://stackoverflow.com/questions/46226518/what-is-the-difference-between-launch-join-and-async-await-in-kotlin-coroutines#46226519
    Difference between Launch and Async coroutines



To look at:
https://medium.com/androiddevelopers/coroutines-on-android-part-iii-real-work-2ba8a2ec2f45
https://stackoverflow.com/questions/48124519/heroku-permanent-database-credentials
https://auth0.com/blog/authenticating-android-apps-developed-with-kotlin/  Login Form Development
https://stackoverflow.com/questions/5944987/how-to-create-a-popup-window-popupwindow-in-android Popup message window


To do:
- Handle password authentication. (encrypt/decrypt) so can match passwords and authenticate user
    - Most likely going to have to authenticate with Heroku first.

- Change UI to match wireframes.

- Try to integrate AI Computer Vision
    https://www.fritz.ai/pose-estimation/
    https://github.com/fritzlabs/fritz-examples/tree/master/Android/CameraBoilerplateApp (example for Fritz AI)
    https://github.com/edvardHua/PoseEstimationForMobile

- Chat functionality
    - Use Websockets
    - Will need to write server code of some sort
    https://github.com/sbearben/chat-backend


