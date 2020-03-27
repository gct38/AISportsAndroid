package com.example.aisports.data

import com.example.aisports.data.model.LoggedInUser
import com.mongodb.ConnectionString
import com.mongodb.client.MongoClients
import java.io.IOException
import java.util.*


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val connString = ConnectionString(
                "mongodb+srv://<username>:<password>@<cluster-address>/test?w=majority"
            )
            val mongoClient = MongoClients.create(connString)


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

