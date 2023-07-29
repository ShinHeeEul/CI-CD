package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {

    private Member member;
    @Test
    @DisplayName("검증")
    void getName() {
        member = new Member("희을", "0102222010");

        Assertions.assertEquals(member.getName(), "희을");
        Assertions.assertEquals(member.getPhone(), "0102222010");
    }
}