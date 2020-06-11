package iit.tn.mycv;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    View view;
    private EditText to;
    private EditText msg;
    private EditText sub;
    private Button envoyer;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_profil,container,false);

        envoyer = (Button) view.findViewById(R.id.envoyer);

        to= view.findViewById(R.id.to);
        msg= view.findViewById(R.id.msg);
        sub= view.findViewById(R.id.sub);
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });


        return view;
    }

    private void sendEmail() {

        String recipientList = to.getText().toString();
        String[] recipients = recipientList.split(",");
        String subject = sub.getText().toString();
        String message = msg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));

    }

}
