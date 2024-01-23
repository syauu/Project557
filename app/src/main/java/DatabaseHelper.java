import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context){
        super(context, "Login.db", null, 1);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table user(username text primary key, password text, name text)");
    }

}
