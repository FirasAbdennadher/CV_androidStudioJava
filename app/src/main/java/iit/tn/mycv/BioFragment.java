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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BioFragment extends Fragment implements View.OnClickListener {
    private Button linkedin1;
    private Button codeforces1;
    private Button github1;
    private TextView bioid;

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_bio, container, false);
        linkedin1 = (Button) view.findViewById(R.id.linkedin1);
        codeforces1 = (Button) view.findViewById(R.id.codeforces1);
        github1 = (Button) view.findViewById(R.id.github1);

        bioid=view.findViewById(R.id.bioid);
     linkedin1.setOnClickListener(this);
        codeforces1.setOnClickListener(this);
        github1.setOnClickListener(this);
        Animation a =AnimationUtils.loadAnimation(getContext(),android.R.anim.slide_in_left);
        bioid.setAnimation(a);
        a.setDuration(1500);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linkedin1:
                 ouvirAccount("https://www.linkedin.com/in/firas-abdennadher/");
               break;
            case R.id.codeforces1:
                ouvirAccount("http://codeforces.com/profile/firasabdennadher82");
                break;
           case R.id.github1:
              ouvirAccount("http://github.com/FirasAbdennadher/");
                break;
        }
    }

    private void ouvirAccount(String profile_url) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(profile_url)));
    }


}