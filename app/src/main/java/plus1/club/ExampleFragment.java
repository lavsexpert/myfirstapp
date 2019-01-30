package plus1.club;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExampleFragment extends Fragment {

    private TextView mExampleText;

    public static ExampleFragment newInstance(){
        return new ExampleFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment, container, false);
        mExampleText = view.findViewById(R.id.textView);
        mExampleText.setText("Example text");
        return view;
    }
}
