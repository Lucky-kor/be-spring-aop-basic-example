package com.codeit.aoppractice;

import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    public Member findMember() {
        return new Member("김러키", 7);
    }
}
