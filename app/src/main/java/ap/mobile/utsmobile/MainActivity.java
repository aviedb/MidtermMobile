package ap.mobile.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private Button btnStart;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.btnStart = findViewById(R.id.btnStart);
    this.btnStart.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    Intent dataActivityIntent = new Intent(MainActivity.this, DataActivity.class);
    startActivity(dataActivityIntent);
  }
}