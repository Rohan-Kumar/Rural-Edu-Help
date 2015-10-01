package rohan.darshan.meghana.com.meghana;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

/**
 * Created by Rohan on 9/29/2015.
 */
public class second extends Fragment implements View.OnClickListener {
    VideoView vv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_second, container, false);
        vv = (VideoView) view.findViewById(R.id.vv);
        //        view = (VideoView) findViewById(R.id.vv);
        view.setOnClickListener(this);
        String path = "android.resource://rohan.darshan.meghana.com.meghana/" + R.raw.addition;
        vv.setVideoURI(Uri.parse(path));
        return view;
    }

    @Override
    public void onClick(View v) {
        if (vv.isPlaying()) {
            vv.pause();
        } else {
            vv.start();
        }

    }
}
