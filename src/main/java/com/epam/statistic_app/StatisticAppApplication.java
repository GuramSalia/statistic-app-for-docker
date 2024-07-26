package com.epam.statistic_app;

import com.epam.statistic_app.model.Member;
import com.epam.statistic_app.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@EnableJms
public class StatisticAppApplication {
    //public class StatisticAppApplication implements CommandLineRunner {

    //	@Autowired
    //	private MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(StatisticAppApplication.class, args);
    }

    //	@Override
    //	public void run(String... args) throws Exception {
    //		System.out.println("Retrieving all members:");
    //
    //		// Fetch all members
    //		Iterable<Member> members = memberRepository.findAll();
    //
    //		for (Member member : members) {
    //			System.out.println("ID: " + member.getId() + ", Username: " + member.getUsername());
    //		}
    //
    //		System.out.println("Adding a new member:");
    //
    //		// Create a new Member instance
    //		Member newMember = new Member();
    //		newMember.setUsername("newUser");
    //		// Set other properties as needed
    //		// newMember.setOtherProperty(value);
    //
    //		// Save the new Member to the database
    //		memberRepository.save(newMember);
    //
    //		// Verify that the new Member was saved
    //		System.out.println("Retrieving all members after saving a new one:");
    //
    //		// Fetch all members again
    //		members = memberRepository.findAll();
    //
    //		for (Member member : members) {
    //			System.out.println("ID: " + member.getId() + ", Username: " + member.getUsername());
    //		}
    //	}
}
