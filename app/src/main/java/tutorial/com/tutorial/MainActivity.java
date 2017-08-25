package tutorial.com.tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.text);
        Button coconut = (Button) findViewById(R.id.coconut);
        Button chocolate = (Button) findViewById(R.id.chocolate);
        Button chicken = (Button) findViewById(R.id.chicken);

        TheClick theClick = new TheClick();
        coconut.setOnClickListener(theClick);
        chocolate.setOnClickListener(theClick);
        chicken.setOnClickListener(theClick);

    }

    private class TheClick implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            String text = ((Button) v).getText().toString();

            textView.setText(text);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
