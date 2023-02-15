package diego.tutorialandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Politicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicas);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://yoandroide.xyz/curso-completo-android-studio-desde-cero/");

    }

    public void irAInicio (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}