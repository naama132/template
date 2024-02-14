package com.ashcollege.responses;


import com.ashcollege.entities.Note;
import com.ashcollege.responses.models.NoteModel;

import java.util.LinkedList;
import java.util.List;

public class NotesResponse extends BasicResponse{
    private List<NoteModel> noteList;

    public NotesResponse(boolean success, Integer errorCode, List<Note> noteList) {
        super(success, errorCode);
//        this.noteList = noteList.stream().map(NoteModel::new).toList();
        this.noteList = new LinkedList<>();
        for (Note note : noteList) {
            this.noteList.add(new NoteModel(note));
        }
    }

    public List<NoteModel> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<NoteModel> noteList) {
        this.noteList = noteList;
    }
}
