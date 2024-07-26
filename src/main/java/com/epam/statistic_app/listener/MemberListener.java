package com.epam.statistic_app.listener;

//import com.epam.statistic_app.model.Member;
//import com.epam.statistic_app.model.MembersList;
//import com.epam.statistic_app.repository.MemberRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;

//@Slf4j
//@Component
public class MemberListener {
//    private final MemberRepository memberRepository;
//    private final JmsTemplate jmsTemplate;
//
//    @Autowired
//    public MemberListener(
//            MemberRepository memberRepository,
//            JmsTemplate jmsTemplate
//    ) {
//        this.memberRepository = memberRepository;
//        this.jmsTemplate = jmsTemplate;
//    }
//
//    @JmsListener(destination = "addMemberQueue")
//    public void addMember(String username) {
//        log.info("Adding member: {}", username);
//        Member member = new Member();
//        member.setUsername(username);
//        member = memberRepository.save(member);
//        log.info("Added member: {}", member);
//    }
//
//    @JmsListener(destination = "deleteMemberQueue")
//    public void deleteMember(String memberId) {
//        log.info("Deleting member " + memberId);
//        memberRepository.deleteById(memberId);
//    }
//
//    @JmsListener(destination = "requestMembersQueue")
//    public void processRequest(String message) {
//        if ("Request for members".equals(message)) {
//            try {
//                log.info("Received request for members, fetching data...");
//
//                List<Member> members = memberRepository.findAll();
//                log.info("Members fetched: {}", members);
//
//                MembersList membersList = new MembersList(members);
//                String listJson = membersList.toJson();
//                jmsTemplate.convertAndSend("responseMembersQueue", listJson);
//            } catch (Exception e) {
//                log.error("Error processing request", e);
//            }
//        } else {
//            log.warn("Received unexpected message: {}", message);
//        }
//    }
}
