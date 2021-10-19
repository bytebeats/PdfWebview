package me.bytebeats.views.pdfwebview.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MainActivity : AppCompatActivity() {

    private val pdfWebview by lazy { findViewById<WebView>(R.id.pdf_web_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pdfWebview.settings.run {
            javaScriptEnabled = true
            allowFileAccess = true

            builtInZoomControls = true
            setSupportZoom(true)
            displayZoomControls = true
        }
        lifecycle.addObserver(object : LifecycleEventObserver {
            override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                when (event) {
                    Lifecycle.Event.ON_CREATE -> pdfWebview.loadUrl(pdfReaderUrl(pdf_url))
                    Lifecycle.Event.ON_DESTROY -> {
                        pdfWebview.run {
                            clearHistory()
                            clearCache(true)
                            clearFormData()
                        }
                    }
                }
            }
        })
    }

    companion object {
        private const val pdf_url = "https://www.gjtool.cn/pdfh5/git.pdf"
        fun pdfReaderUrl(url: String): String = "file:///android_asset/index.html?$url"
    }
}