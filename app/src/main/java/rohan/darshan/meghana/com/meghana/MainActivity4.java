package rohan.darshan.meghana.com.meghana;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class MainActivity4 extends ActionBarActivity {
RecyclerView recyclerView;
    TestRecyclerViewAdapter mAdapter;
    String Response = "";
    ArrayList<String> NAME = new ArrayList<>(),DESC = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        mAdapter = new TestRecyclerViewAdapter();
        recyclerView.setAdapter(mAdapter);

        new fetch_data().execute();


    }

public class TestRecyclerViewAdapter extends RecyclerView.Adapter<TestRecyclerViewAdapter.MyHolder> {

    @Override
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = null;
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.single_row, viewGroup, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int i) {

        myHolder.name.setText(NAME.get(i));
        myHolder.desc.setText(DESC.get(i));
    }

    @Override
    public int getItemCount() {
        return NAME.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        TextView name,desc;
        public MyHolder(View itemView) {
            super(itemView);
            name= (TextView) itemView.findViewById(R.id.name);
            desc= (TextView) itemView.findViewById(R.id.desc);
        }
    }
}

    public class fetch_data extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {
            URL url = null;

            try {
                url = new URL("http://darshannn.hostei.com/fetch_sms.php");
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.connect();
                BufferedReader mBufferedInputStream = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String inline;
                while ((inline = mBufferedInputStream.readLine()) != null) {
                    Response += inline;
                }
                mBufferedInputStream.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            parse_data();
            return null;
        }

        private void parse_data() {

            try {
                JSONArray jsonArray = new JSONArray(Response);
                for (int i=0;i<jsonArray.length();i++){
                    JSONObject jsonObject = new JSONObject(jsonArray.getString(i));
                    NAME.add(jsonObject.getString("name"));
                    DESC.add(jsonObject.getString("desc"));

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            mAdapter.notifyDataSetChanged();
        }
    }

}
