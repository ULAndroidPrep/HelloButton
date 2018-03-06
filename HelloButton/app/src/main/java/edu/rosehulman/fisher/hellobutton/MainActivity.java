package edu.rosehulman.fisher.hellobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private int count = 0;
  private Button button;
  private TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button = (Button) findViewById(R.id.press_me_button);
    textView = (TextView) findViewById(R.id.message_text_view);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        count++;
        String s = getResources().getQuantityString(R.plurals.message_format, count, count)
        textView.setText(s);
      }
    });
  }
}
