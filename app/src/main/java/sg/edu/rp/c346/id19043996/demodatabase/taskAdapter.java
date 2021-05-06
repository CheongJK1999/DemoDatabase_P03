package sg.edu.rp.c346.id19043996.demodatabase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class taskAdapter extends ArrayAdapter<Task> {

    Context context;
    ArrayList<Task> tasks;
    int resource;
    TextView tvID, tvDesc, tvDate;

    public taskAdapter(Context context, int resource, ArrayList<Task> tasks) {
        super(context, resource, tasks);
        this.context = context;
        this.tasks = tasks;
        this.resource = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("ViewHolder") View rowView = inflater.inflate(resource, parent, false);

        tvID = rowView.findViewById(R.id.tvID);
        tvDesc = rowView.findViewById(R.id.tvDesc);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task currentTask = tasks.get(position);

        tvID.setText(currentTask.getId());
        tvDesc.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());

        return rowView;
    }
}
