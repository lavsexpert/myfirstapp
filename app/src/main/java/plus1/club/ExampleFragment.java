package plus1.club;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExampleFragment extends Fragment {
    private TextView mExampleText;
    public static String newText;

    public static ExampleFragment newInstance(String textForTextView) {
        ExampleFragment fragment = new ExampleFragment();
        newText = textForTextView;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        mExampleText = view.findViewById(R.id.textView);
        mExampleText.setText(newText);
        return view;
    }
}
