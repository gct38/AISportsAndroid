package com.example.aisports.data

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.util.Log
import com.example.aisports.data.model.LoggedInUser
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.jodatime.datetime
import org.jetbrains.exposed.sql.transactions.transaction
import org.joda.time.DateTime
import java.io.IOException


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */

object Users: Table("auth_user") {
    val id = integer("id")
    val password = varchar("password", 128)
    val last_login = datetime("last_login").clientDefault{ DateTime.now() }
    val is_superuser = bool("is_superuser")
    val username = varchar("username", length = 50)
    val first_name = varchar("first_name", 30)
    val last_name = varchar("last_name", 150)
    val email = varchar("email", 254)
    val is_staff = bool("is_staff")
    val is_active = integer("is_active")
    val date_joined = datetime("date_joined").clientDefault{ DateTime.now() }
}

class backgroundTask() : AsyncTask<Void, Void, String>() {
    override fun doInBackground(vararg params: Void?): String? {
        val db = Database.connect("jdbc:postgresql://ec2-23-21-225-251.compute-1.amazonaws.com:5432/d4tefl2m5ii7b7?sslmode=require&user=lruthoqamfsgna&password=5490aebc5c8ccdd3a97f0c287d00e55f3d702b4413d8ee1802a967d6c8706f10")

        val name = "YOU SUCK " + db.name
        Log.d("DATABASE CONNECTION",name)

        val returnValue = transaction {
            Users.select{ Users.username eq "test" }.toList()
            //List is of length 1 (one)
        }
        //val fakeUser = LoggedInUser(returnValue[0].toString(), returnValue[4].toString())
        Log.d("DATABASE CONNECTION", returnValue[0].toString())
        return returnValue[0].toString()
    }
}


class LoginDataSource {

    @SuppressLint("AuthLeak")
    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication

            backgroundTask().execute()
            val fakeUser = LoggedInUser("dsfkljf", "JANE DOE")
            //val userDetails: String = backgroundTask().execute()
            //val userInfo = userDetails.split(" ".toRegex()).toList()
            //val fakeUser = LoggedInUser(userInfo[0], userInfo[1])
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

