package com.example.lenovo.sqliteandroidstudio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.List;

public class NoteAdapter extends ArrayAdapter<Note>
{
    public NoteAdapter(Context context, List<Note> notes)
    {
        super(context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Note note = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_cell, parent, false);

        TextView title =(TextView) convertView.findViewById(R.id.cellTitle);
        TextView desc =(TextView) convertView.findViewById(R.id.cellDesc);

        title.setText(note.getTitle());
        desc.setText(note.getDescription());

        return convertView;
    }
}
