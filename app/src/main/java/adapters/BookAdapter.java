package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import java.util.ArrayList;

import models.Book;
import views.BookItemView;

public class BookAdapter extends RecyclerView.Adapter<BookItemView> {
    private ArrayList<Book> books;
    private Context context;
    public BookAdapter(Context context, ArrayList<Book> books) {
        this.books = books;
        this.context = context;
    }

    @NonNull
    @Override
    public BookItemView onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.book_item_view,viewGroup,false);
        return  new BookItemView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookItemView bookItemView, int position) {
        bookItemView.setBook(this.books.get(position),position);
    }

    @Override
    public int getItemCount() {
        return this.books.size();
    }
}
