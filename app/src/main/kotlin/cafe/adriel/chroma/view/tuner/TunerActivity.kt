package cafe.adriel.chroma.view.tuner

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import cafe.adriel.chroma.ktx.keepScreenOn
import cafe.adriel.chroma.manager.BillingManager
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.core.scope.Scope

class TunerActivity : AppCompatActivity(), AndroidScopeComponent {

    override val scope: Scope by activityScope()

    private val screen by inject<TunerScreen>()
    private val billingManager by inject<BillingManager>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent { screen.Content() }
        keepScreenOn()
    }

    @Suppress("DEPRECATION")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (billingManager.verifyPurchase(requestCode, resultCode, data).not()) {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
