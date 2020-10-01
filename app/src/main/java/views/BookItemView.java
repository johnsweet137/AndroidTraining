package views;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import models.Book;

public class BookItemView extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textViewName;
    private TextView textViewAuthor;
    private RatingBar ratingBar;
    private TextView textViewDescription;
    private View bottomView;
    private Book book;
    public BookItemView(@NonNull View itemView) {
        super(itemView);
        // map tu file xml sang BookItemView
        imageView = itemView.findViewById(R.id.imageUrl);
        textViewName = itemView.findViewById(R.id.TextViewName);
        textViewAuthor = itemView.findViewById(R.id.TextViewAuthor);
        ratingBar = itemView.findViewById(R.id.ratingBarRating);
        textViewDescription = itemView.findViewById(R.id.TextViewDescription);
        bottomView = itemView.findViewById(R.id.bottomView);
    }

    public void setBook(Book book,int position) {
        this.book = book;
//        imageView.setImageURI(Uri.parse(book.getImageUrl()));
        Picasso.get().load(book.getImageUrl()).into(imageView);
        textViewName.setText(book.getName());
        textViewAuthor.setText(book.getAuthor());
        ratingBar.setNumStars(book.getRate());
        textViewDescription.setText(book.getDescription());
        bottomView.setBackgroundColor(position % 2 == 0 ?
                    itemView.getResources().getColor(R.color.colorRed,null):
                    itemView.getResources().getColor(R.color.colorDodgerBlue,null));
    }
}
