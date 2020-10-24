package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
        // do nothing
    }

    public int getPostQuantity() {
        // return 100 temporarily
        return posts.size();
    }

    public int getCommentsQuantity() {
        // return 100
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()){
            thePost = posts.get(postNumber);
        }
        //returning null means that the operation was unsuccessful
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < posts.size()){
            theComment = comments.get(commentNumber);
        }
        //returning null means that the operation was unsuccessful
        return theComment;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
            // return true temporarily
        }
        return result;
    }
       public boolean removeComment(ForumComment theComment){
           boolean result = false;
            if (comments.contains(theComment)){
                comments.remove(theComment);
                result = true;
            }
            return result;
    }

    public String getName(){
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public void getPostsQuantity() {
    }
}
