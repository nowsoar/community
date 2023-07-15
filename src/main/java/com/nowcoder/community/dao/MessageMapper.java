package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

//    查询当前用户会话列表,针对每个会话只返回最新私信
    List<Message> selectConversations(int userId, int offset, int limit);

//    查询当前用户的会话数量
    int selectConversationCount(int userId);

//    查询某个会话包含的私信列表
    List<Message> selectLetters(String conversationId, int offset, int limit);

//    查询某个会话包含的私信数量
    int selectLetterCount(String conversationId);

//    查询未读私信数量,复用,看是否传conversationID
    int selectLetterUnreadCount(int userId,String conversationId);

//    增加私信
    int insertMessage(Message message);

//    修改消息状态,已读或删除
    int updateStatus(List<Integer> ids, int status);

    //查询某个主题下最新通知
    Message selectLatestNotice(int userId,String topic);

//    查询某个主题通知数量
    int selectNoticeCount(int userId,String topic);

//    查询未读通知数
    int selectNoticeUnreadCount(int userId,String topic);

    //查询某个主题下包含的通知列表
    List<Message> selectNotices(int userId, String topic, int offset, int limit);


}
