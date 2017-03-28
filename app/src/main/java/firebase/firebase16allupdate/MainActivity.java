package firebase.firebase16allupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    EditText mValueField;
    EditText evalue;

    Button msaveButton;

    private Firebase mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mref=new Firebase("https://fir-all-d9884.firebaseio.com/");

        mValueField=(EditText) findViewById(R.id.valu_xml);
        msaveButton=(Button)findViewById(R.id.add_value);
        evalue=(EditText)findViewById(R.id.key_xml);

        msaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value=mValueField.getText().toString();

                String key=evalue.getText().toString();

                Firebase mrefchild=mref.child(key);

                mrefchild.setValue(value);


            }
        });



    }
}
