package iit.tn.mycv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BioFragment extends Fragment implements View.OnClickListener {
    private Button linkedin;
    private TextView bioid;

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_bio, container, false);
        linkedin = (Button) view.findViewById(R.id.linkedin);
        bioid=view.findViewById(R.id.bioid);
        linkedin.setOnClickListener(this);
        Animation a =AnimationUtils.loadAnimation(getContext(),android.R.anim.slide_in_left);
        bioid.setAnimation(a);
        a.setDuration(1000);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.linkedin:
               // ouvirAccount("https://www.linkedin.com/in/firas-abdennadher/");
               // break;
            case R.id.codeforces:
                ouvirAccount("https://www.linkedin.com/in/firas-abdennadher/");
                break;
           case R.id.github:
                ouvirAccount("https://www.linkedin.com/in/firas-abdennadher/");
                break;
        }
    }

    private void ouvirAccount(String profile_url) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(profile_url)));
    }


}