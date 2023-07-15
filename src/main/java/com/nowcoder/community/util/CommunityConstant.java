package com.nowcoder.community.util;

public interface CommunityConstant {

    int ACTIVATION_SUCCESS = 0;

    int ACTIVATION_REPEAT = 1;

    int ACTIVATION_FAIL = 2;

    int DEFAULT_EXPIRED_SECOND = 3600 * 12;

    int REMEMBER_EXPIRED_SECOND = 3600 * 24 * 100;

    int ENTITY_TYPE_POST = 1;

    int ENTITY_TYPE_COMMENT = 2;

    int ENTITY_TYPE_USER = 3;

    String TOPIC_COMMENT = "comment";

    String TOPIC_LIKE = "like";

    String TOPIC_FOLLOW = "follow";

    int SYSTEM_USERID = 1;

    String TOPIC_PUBLISH = "publish";

    String TOPIC_DELETE = "delete";

    String TOPIC_SHARE = "share";

    String AUTHORITY_USER = "user";

    String AUTHORITY_ADMIN = "admin";

    String AUTHORITY_MODERATOR = "moderator";


}
