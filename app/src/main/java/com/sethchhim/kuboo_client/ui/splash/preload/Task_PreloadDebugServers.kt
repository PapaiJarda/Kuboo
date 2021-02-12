package com.sethchhim.kuboo_client.ui.splash.preload

import com.sethchhim.kuboo_client.BuildConfig
import com.sethchhim.kuboo_client.ui.splash.SplashActivity
import com.sethchhim.kuboo_remote.model.Login
import timber.log.Timber

class Task_PreloadDebugServers(splashActivity: SplashActivity) : Task_PreloadBase(splashActivity) {

    override fun doPreload() {
        if (BuildConfig.DEBUG) {
            if (viewModel.isLoginListEmpty()) {
                viewModel.addLogin(Login(nickname = "Books Server",
                        server = "192.168.1.8:3456/opds/v1.2/catalog",
                        username = "asdf",
                        password = "asdf"))

                viewModel.addLogin(Login(nickname = "Comics Server",
                        server = "192.168.1.8:3456/opds/v1.2/catalog",
                        username = "asdf",
                        password = "asdf"))
            }
        }
        onFinished(javaClass.simpleName)
    }

}
