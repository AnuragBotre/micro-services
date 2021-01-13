package com.trendcore.user.service;

import com.trendcore.user.entity.User;
import com.trendcore.user.repository.UserRepository;
import com.trendcore.user.vo.Department;
import com.trendcore.user.vo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        User save = userRepository.save(user);
        return save;
    }

    public UserDepartmentVO getUserWithDepartment(Long userId) {
        User user = userRepository.findUserById(userId);
        UserDepartmentVO userDepartmentVO = new UserDepartmentVO();
        userDepartmentVO.setUser(user);
        if (user != null) {

            /*
                If we use IP and port every where in the code then it is problematic
                Hence Spring provided service-registry.
             */
            /*
                //Initial Code - not able to load balance
                RestTemplate restTemplate = new RestTemplate();
                Department department = restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), Department.class);
             */

            Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
            userDepartmentVO.setDepartment(department);
        }
        return userDepartmentVO;
    }

}
