package co.ug.skywayhotel.countrylist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView simpleList;
    int flags[]={R.drawable.uganda,R.drawable.tanzania, R.drawable.kenya, R.drawable.rwanda, R.drawable.nigeria,
            R.drawable.cameroon, R.drawable.ghana, R.drawable.zimbabwe, R.drawable.burundi, R.drawable.drc
    };
    String countryList[] = {"Uganda","Tanzania","Kenya","Rwanda","Nigeria","Cameroon","Ghana","Zimbabwe","Burundi","DRC"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super . onCreate ( savedInstanceState );
        setContentView ( R . layout . activity_main );
        simpleList = ( ListView ) findViewById ( R . id . simpleListView );
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList,flags);
        simpleList . setAdapter ( customAdapter );
    }
}
    
