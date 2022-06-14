package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
   private int quantityOfUsers;
   private int quantityOfPosts;
   private int quantityOfComments;
   private double averagePostPerUser;
   private double averageCommentsPerUser;
   private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        quantityOfUsers = statistics.usersNames().size();
        if(statistics.usersNames().size() != 0) {
            averagePostPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
            averageCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averagePostPerUser = statistics.postsCount();
            averageCommentsPerUser = statistics.commentsCount();
        }
        if(statistics.postsCount() != 0)
        averageCommentsPerPost = (double) (statistics.commentsCount()) / (statistics.postsCount());
        else
            averageCommentsPerPost = statistics.commentsCount();
    }

    public void showStatistics(){

    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public void setQuantityOfUsers(int quantituOfUsers) {
        this.quantityOfUsers = quantituOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public void setQuantityOfPosts(int quantituOfPosts) {
        this.quantityOfPosts = quantituOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public void setQuantityOfComments(int quantityOfComments) {
        this.quantityOfComments = quantityOfComments;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public void setAveragePostPerUser(double averagePostPerUser) {
        this.averagePostPerUser = averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public void setAverageCommentsPerUser(double averageCommentsPerUser) {
        this.averageCommentsPerUser = averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void setAverageCommentsPerPost(double averageCommentsPerPost) {
        this.averageCommentsPerPost = averageCommentsPerPost;
    }
}
