package com.example.fitnes;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.List;

import APIParse.Exercise;
import APIParse.IMainView;
import APIParse.MainPresenter;

public class MainActivity extends MvpAppCompatActivity implements IMainView {

    @InjectPresenter
    public MainPresenter presenter;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Intent intent = new Intent(getApplicationContext(), TrainingChoosing.class);
        startActivity(intent);*/
        presenter.info();
    }


    @Override
    public void getExercise(List<Exercise> exercises) {
        Log.d("MyLog", exercises.toString());
    }

    @Override
    public void load() {

    }

    @Override
    public void error() {

    }
}
