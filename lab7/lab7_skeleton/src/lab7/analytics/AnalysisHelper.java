/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {
     
    
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    //Find the post with most liked comments
    public void getPostMostLikeComments(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Post,Integer> postAns = new HashMap<>();
        int likeCount=0;
        int maxCount=0;
        for(Post p: posts.values() ){
            List<Comment> comList = p.getComments();
            for(Comment c:comList)
            {
                likeCount+=c.getLikes();
            }
            if(maxCount<likeCount)
            {
                maxCount=likeCount;
            }
            postAns.put(p,likeCount);
        }
        //Collections.sort(postAns);
        //sort on basis of likecount
        //sortByValue(postAns);
        System.out.println("Maxcount ="+ maxCount);
        System.out.println("Map-> " +postAns);
        Post p=null;
        for (Map.Entry<Post, Integer> e : postAns.entrySet()) {
            p=e.getKey();
            Integer count=e.getValue();
            //System.out.println(p.getPostId() +" -> "+count);
            if(count==maxCount)
            {
                break;
            }
            
        }
        //printMap(postAns);
        System.out.println("post with most liked comments is postid = "+p.getPostId() );
    }
    
    
  //  3). Find the post with most comments.
    public void getPostByMostComments(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Post,Integer> postAns = new HashMap<>();
        int commentCount=0;
        int maxCount=0;
        for(Post p: posts.values() ){
            commentCount=p.getComments().size();
            postAns.put(p,commentCount);
            if(maxCount<commentCount)
            {
                maxCount=commentCount;
            }
        }
         System.out.println("Maxcount ="+ maxCount);
         //sort on basis of commentCount
         //printMap(postAns);
         System.out.println("Map ->"+postAns);
        Post p=null;
        for (Map.Entry<Post, Integer> e : postAns.entrySet()) {
            p=e.getKey();
            Integer count=e.getValue();
            //System.out.println(p.getPostId() +" -> "+count);
            if(count==maxCount)
            {
                System.out.println("post with most comments postid = "+p.getPostId() );
            }            
        }           
        
    }
    
    
    
//4). Top 5 inactive users based on total posts number.
    
    public void getTop5InactiveUsrBasedOnPostNum(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,Integer> userMap = new HashMap<>();
        for(Post p: posts.values()){
            int userId=p.getUserId();
            if(userMap.containsKey(userId))
            {
                int count=userMap.get(userId);
                userMap.put(userId, ++count);
            }
            else{
                userMap.put(userId,1);
            }
        }
        //sort
        System.out.println("Top 5 inactive users based on total posts number ->");
        userMap=sortByValue(userMap);
        System.out.println("Map ->"+userMap);
        //for(int i=0;i<5;i++){
        int loop=0;
            for(Integer id: userMap.keySet()){
            System.out.println("User -> "+ getUserByUserId(id));
            loop++;
            if(loop==5){
                break;
            }
            }
        //}
              
    }
    
    public User getUserByUserId(int uid){
        User user = null;
        Map<Integer, User> userList =DataStore.getInstance().getUsers();
        for(User u : userList.values())
        {
            if(u.getId()==uid)
            {
                user=u;
                break;
            }
        }
        
        return user;
    }
    
    
//5). Top 5 inactive users based on total comments they created.
    public void getTop5InactiveUsrBasedOnComments(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer,Integer> userMap = new HashMap<>();
        for(User u: users.values()){
            int userId=u.getId();
            int cmntCount =u.getComments().size();
            userMap.put(userId,cmntCount);
        }
        //sort
        System.out.println("Top 5 inactive users based on total comments number ->");
        userMap=sortByValue(userMap);
        System.out.println("Map ->"+userMap);
        //for(int i=0;i<5;i++){
        int loop=0;
            for(Integer id: userMap.keySet()){
            System.out.println("User -> "+ getUserByUserId(id));
            loop++;
            if(loop==5){
                break;
            }
            }
    }
    
    
    
    
//6). Top 5 inactive users overall (sum of comments, posts and likes)
    public void getTop5InactiveUsrOverAll(){
        Map<Integer,Integer> userMapPost = getInActvUsrByPostHelper();
        Map<Integer,Integer> userMapComment = getInActvUsrByCommentHelper();
        Map<Integer,Integer> userMapLikes = getInActvUsrByLikes();
        Map<Integer,Integer> userAnsList = new HashMap<>();
        System.out.println("Post Map-> "+ userMapPost);
        System.out.println("Comment Map-> "+ userMapComment);
        System.out.println("Likes Map-> "+ userMapLikes);
        
        for(Integer userid: userMapPost.keySet())
        {
            if(userAnsList.containsKey(userid))
            {
                int count= userMapPost.get(userid) + userAnsList.get(userid);
                userAnsList.put(userid, count);
            }
            else{
                int count= userMapPost.get(userid);
                userAnsList.put(userid, count);
            }
        }
        
        for(Integer userid: userMapComment.keySet())
        {
            if(userAnsList.containsKey(userid))
            {
                int count= userMapComment.get(userid) + userAnsList.get(userid);
                userAnsList.put(userid, count);
            }
            else{
                int count= userMapComment.get(userid);
                userAnsList.put(userid, count);
            }
        }
        
        
        
        for(Integer userid: userMapLikes.keySet())
        {
            if(userAnsList.containsKey(userid))
            {
                int count= userMapLikes.get(userid) + userAnsList.get(userid);
                userAnsList.put(userid, count);
            }
            else{
                int count= userMapLikes.get(userid);
                userAnsList.put(userid, count);
            }
        }
        
        System.out.println("Before sort Map-> "+ userAnsList);
        
        userAnsList=sortByValue(userAnsList);
        
        System.out.println("After sort Map ->"+userAnsList);
        //for(int i=0;i<5;i++){
        int loop=0;
            for(Integer id: userAnsList.keySet()){
            //System.out.println("Userid -> "+ id);
            System.out.println("User -> "+ getUserByUserId(id));
            loop++;
            if(loop==5){
                break;
            }
            }
        
        
        
    }
    
    public Map<Integer,Integer> getInActvUsrByPostHelper(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,Integer> userMap = new HashMap<>();
        for(Post p: posts.values()){
            int userId=p.getUserId();
            if(userMap.containsKey(userId))
            {
                int count=userMap.get(userId);
                userMap.put(userId, ++count);
            }
            else{
                userMap.put(userId,1);
            }
        }
        return userMap;
    }
    
    
    public Map<Integer,Integer> getInActvUsrByCommentHelper(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer,Integer> userMap = new HashMap<>();
        for(User u: users.values()){
            int userId=u.getId();
            int cmntCount =u.getComments().size();
            userMap.put(userId,cmntCount);
        }
        //sort
        //System.out.println("Top 5 inactive users based on total comments number ->");
        //userMap=sortByValue(userMap);
        //System.out.println("Map ->"+userMap);
        return userMap;
    }
    
    
    
    
    
//7). Top 5 proactive users overall (sum of comments, posts and likes)
    public void getTop5ActiveUsrOverAll(){
        Map<Integer,Integer> userMapPost = getInActvUsrByPostHelper();
        Map<Integer,Integer> userMapComment = getInActvUsrByCommentHelper();
        Map<Integer,Integer> userMapLikes = getInActvUsrByLikes();
        Map<Integer,Integer> userAnsList = new HashMap<>();
        System.out.println("Post Map-> "+ userMapPost);
        System.out.println("Comment Map-> "+ userMapComment);
        System.out.println("Likes Map-> "+ userMapLikes);
        
        for(Integer userid: userMapPost.keySet())
        {
            if(userAnsList.containsKey(userid))
            {
                int count= userMapPost.get(userid) + userAnsList.get(userid);
                userAnsList.put(userid, count);
            }
            else{
                int count= userMapPost.get(userid);
                userAnsList.put(userid, count);
            }
        }
        
        for(Integer userid: userMapComment.keySet())
        {
            if(userAnsList.containsKey(userid))
            {
                int count= userMapComment.get(userid) + userAnsList.get(userid);
                userAnsList.put(userid, count);
            }
            else{
                int count= userMapComment.get(userid);
                userAnsList.put(userid, count);
            }
        }
        
        
        
        for(Integer userid: userMapLikes.keySet())
        {
            if(userAnsList.containsKey(userid))
            {
                int count= userMapLikes.get(userid) + userAnsList.get(userid);
                userAnsList.put(userid, count);
            }
            else{
                int count= userMapLikes.get(userid);
                userAnsList.put(userid, count);
            }
        }
        
        System.out.println("Before sort Map-> "+ userAnsList);
        
        userAnsList=sortByValueDesc((HashMap<Integer, Integer>) userAnsList);
        
        System.out.println("After sort Map ->"+userAnsList);
        //for(int i=0;i<5;i++){
        int loop=0;
            for(Integer id: userAnsList.keySet()){
            //System.out.println("Userid -> "+ id);
            System.out.println("User -> "+ getUserByUserId(id));
            loop++;
            if(loop==5){
                break;
            }
            }
        
        
        
    }
    

public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    

public static HashMap<Integer, Integer> sortByValueDesc(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    



    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {

    List<Map.Entry<K, V>> list =
            new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

    Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
        public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
            return (o1.getValue()).compareTo(o2.getValue());
        }
    });

    Map<K, V> result = new LinkedHashMap<K, V>();
    for (Map.Entry<K, V> entry : list) {
        result.put(entry.getKey(), entry.getValue());
    }

    return result;

}
     public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
				+ " Value : " + entry.getValue());
        }
    }

    public Map<Integer, Integer> getInActvUsrByLikes() {
        Map<Integer, Integer> userMap = new HashMap<>();
        
        Map<Integer, Comment> commentMap = DataStore.getInstance().getComments();
        
        for(Comment u: commentMap.values()){
            int userId=u.getUserId();
            int likeCount =u.getLikes();
            userMap.put(userId,likeCount);
        }
        //sort
        //System.out.println("Top 5 inactive users based on total comments number ->");
        //userMap=sortByValue(userMap);
        //System.out.println("Map ->"+userMap);
        
        
        return userMap;
    }
    
}
