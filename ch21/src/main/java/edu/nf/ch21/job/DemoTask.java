package edu.nf.ch21.job;

import edu.nf.ch21.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2020/12/9
 * 定时任务处理类
 */
@Component
public class DemoTask {

    /**
     * 定时任务需要反复执行TaskService中的业务逻辑
     * 因此将它注入进来
     */
    @Autowired
    private TaskService taskService;

    /**
     * 定时备份
     */
    @Scheduled(cron = "0/3 * * * * ?")
    public void executeBackup(){
        taskService.backup();
    }

    /**
     * 定时清理
     */
    @Scheduled(cron = "0/3 * * * * ?")
    public void executeClean(){
        taskService.clean();
    }
}
