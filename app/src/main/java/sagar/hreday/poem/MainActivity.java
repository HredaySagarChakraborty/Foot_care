package sagar.hreday.poem;


//package sagar.hreday.lifestyle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    MyAdapter myAdapter;

    int images[] = {R.drawable.nazrul,
            R.drawable.nazrul,
            R.drawable.nazrul,
            R.drawable.nazrul,
            R.drawable.nazrul


    };
    String[] country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewiD);


        country = getResources().getStringArray(R.array.country_name);
        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter(this, images, country);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.e(TAG,"Error");

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                    Log.e(TAG,"Error");



                }

                else if (position == 1) {
                    Intent intent = new Intent(MainActivity.this,  Main3Activity.class);
                    startActivity(intent);
                    Log.e(TAG,"Error");



                }
                else  if (position == 2) {
                    Intent intent = new Intent(MainActivity.this,  Main4Activity.class);
                    startActivity(intent);
                    Log.e(TAG,"Error");



                }
                else if (position == 3) {
                    Intent intent = new Intent(MainActivity.this,  Main5Activity.class);
                    startActivity(intent);
                    Log.e(TAG,"Error");



                }
                else  if (position == 4) {
                    Intent intent = new Intent(MainActivity.this,  Main6Activity.class);
                    startActivity(intent);
                    Log.e(TAG,"Error");



                }

            }
        });


    }
}

