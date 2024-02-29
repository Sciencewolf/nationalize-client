package nationalize;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Nationality(long count, String name){
    public record Country(){}
}