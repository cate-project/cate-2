package app.com.CATE.models;

public class CommentModel {

    private String author;
    private String _index;
    private String desc;
    private String date;
    private String commentcountLike;
    private String commentcountDisLike;
    private String status;
    public CommentModel(){
    }


    public CommentModel(String author,String _index, String desc, String date, String commentcountLike, String commentcountDisLike,String status) {
        this.author = author;
        this._index = _index;
        this.desc = desc;
        this.date = date;
        this.commentcountLike = commentcountLike;
        this.commentcountDisLike = commentcountDisLike;
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public  void setAuthor(String author){
        this.author = author;
    }

    public String get_index() {
        return _index;
    }

    public void set_index(String _index) {
        this._index = _index;
    }

    public String getDesc() {
        return desc;
    }

    public  void setDesc(String desc){
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCommentcountLike() {
        return commentcountLike;
    }

    public void setCommentcountLike(String commentcountLike) {
        this.commentcountLike = commentcountLike;
    }

    public String getCommentcountDisLike() {
        return commentcountDisLike;
    }

    public void setCommentcountDisLike(String commentcountDisLike) {
        this.commentcountDisLike = commentcountDisLike;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
