package dhabaworks.myconvertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemSelectedListener{

    Spinner ChooseCategory;
    Spinner ShowFromUnits;
    Spinner ShowToUnits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChooseCategory = (Spinner)findViewById(R.id.spinnerCategory);
        ArrayAdapter adapter0 = ArrayAdapter.createFromResource(this,R.array.category_array,R.layout.my_spinner);
        ChooseCategory.setAdapter(adapter0);
        ChooseCategory.setOnItemSelectedListener(this);


        ShowFromUnits = (Spinner)findViewById(R.id.spinnerFromUnits);
        ShowToUnits = (Spinner)findViewById(R.id.spinnerToUnits);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(position==0){
            ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.distance_array,R.layout.my_spinner);
            ShowFromUnits.setAdapter(adapter);

            ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.distance_array,R.layout.my_spinner);
            ShowToUnits.setAdapter(adapter1);
        }

        if(position==1){
            ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.area_array,R.layout.my_spinner);
            ShowFromUnits.setAdapter(adapter);

            ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.area_array,R.layout.my_spinner);
            ShowToUnits.setAdapter(adapter1);
        }
        if(position==2){
            ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.vol_array,R.layout.my_spinner);
            ShowFromUnits.setAdapter(adapter);

            ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.vol_array,R.layout.my_spinner);
            ShowToUnits.setAdapter(adapter1);
        }

        if(position==3){
            ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.pressure_array,R.layout.my_spinner);
            ShowFromUnits.setAdapter(adapter);

            ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.pressure_array,R.layout.my_spinner);
            ShowToUnits.setAdapter(adapter1);
        }

        if(position==4){
            ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.temp_array,R.layout.my_spinner);
            ShowFromUnits.setAdapter(adapter);

            ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.temp_array,R.layout.my_spinner);
            ShowToUnits.setAdapter(adapter1);
        }

        if(position==5){
            ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.currency_array,R.layout.my_spinner);
            ShowFromUnits.setAdapter(adapter);

            ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.currency_array,R.layout.my_spinner);
            ShowToUnits.setAdapter(adapter1);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
