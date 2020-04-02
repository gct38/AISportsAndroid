package com.example.aisports.data

import com.example.aisports.data.model.LoggedInUser
import com.example.aisports.sql.ConnectionLayer
import android.util.Log
import kotlinx.coroutines.*
import java.io.IOException


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {
    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val returnValue = runBlocking {
                val returnValue = CoroutineScope(Dispatchers.Default).async {
                    ConnectionLayer().userQuery(username, password)
                }
                return@runBlocking returnValue.await()
            }

            Log.d("QUERY RESULT", returnValue)
            val fakeUser = LoggedInUser("dsfkljf", returnValue)
            Log.d("QERUY RESULT", "hello")

            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

