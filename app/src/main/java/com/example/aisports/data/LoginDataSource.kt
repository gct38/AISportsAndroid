package com.example.aisports.data

import android.annotation.SuppressLint
import com.example.aisports.data.model.LoggedInUser
import com.example.aisports.ui.login.LoggedInUserView
import com.example.aisports.ui.login.LoginResult
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.transactions.transaction
import java.io.IOException
import java.util.*


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */



class LoginDataSource {

    @SuppressLint("AuthLeak")
    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication

            val db = Database.connect("jdbc:postgresql://lruthoqamfsgna:5490aebc5c8ccdd3a97f0c287d00e55f3d702b4413d8ee1802a967d6c8706f10@ec2-23-21-225-251.compute-1.amazonaws.com:5432/d4tefl2m5ii7b7", driver = "org.postgresql.Driver")

            /*
            val returnValue = transaction {
                auth_user.select{ auth_user.username = "test" }.toList()
            }
            val fakeUser = LoggedInUser(returnValue[0], returnValue[4])
            */

            val fakeUser = LoggedInUser(UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

