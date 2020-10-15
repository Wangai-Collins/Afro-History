package wangai.collins.afro_history;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the list of tribes name and history in string array

        String[] name  = getResources().getStringArray(R.array.tribe_name);
        String[] history= getResources().getStringArray(R.array.tribe_history);
        recyclerView= findViewById(R.id.TribesListView);
    }
}