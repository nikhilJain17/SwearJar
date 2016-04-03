package nikhil.com.swearjar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import ai.api.AIConfiguration;
import ai.api.AIListener;
import ai.api.AIService;
import ai.api.model.AIError;
import ai.api.model.AIResponse;
import ai.api.model.Result;
import com.google.gson.JsonElement;
import java.util.Map;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button listenButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init components
        listenButton = (Button) findViewById(R.id.listenButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);


    }


}
