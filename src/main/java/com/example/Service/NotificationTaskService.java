package com.example.Service;

import org.springframework.stereotype.Service;
import com.example.entity.NotificationTask;
import com.example.repository.NotificationTaskRepository;

@Service
public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;


    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask) {
        notificationTaskRepository.save(notificationTask);
    }
}
