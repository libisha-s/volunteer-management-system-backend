package com.vserve.project.repository;

import com.vserve.project.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
//@DataJpaTest
class OtpRepositoryDummyTest {

    @Mock
    OtpRepositoryDummy otpRepositoryDummy;

    @Test
    void test1() {
//        otpRepositoryDummy.recentOtp(new User());
        assertEquals(1,0);
    }

}