package jwile14.com.github.weatherapp.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.util.Arrays;

import jwile14.com.github.weatherapp.R;
import jwile14.com.github.weatherapp.adapters.DayAdapter;
import jwile14.com.github.weatherapp.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Day[].class);


        DayAdapter adapter = new DayAdapter(this, mDays);

        this.setListAdapter(adapter);
    }
}
