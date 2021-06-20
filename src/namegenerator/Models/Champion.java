package namegenerator.Models;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Champion {
    @Expose
    public String version;
    @Expose
    public String id;
    @Expose
    public String key;
    @Expose
    public String name;
    @Expose
    public String title;
    @Expose
    public String blurb;
    @Expose
    public Info info;
    @Expose
    public Image image;
    @Expose
    public List<String> tags;
    @Expose
    public String partype;
    @Expose
    public Stats stats;
}