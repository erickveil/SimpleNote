package net.erickveil.simplenote.simple_note_app;

import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_save) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean saveTextFileExternal(String file_name)
    {
        File save_dir=new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_DOCUMENTS), file_name);
        if(!save_dir.mkdirs()){
            //todo: what if directories cant be made?
        }
        return true;
    }
}
