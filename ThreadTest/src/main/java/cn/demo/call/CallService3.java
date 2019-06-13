package cn.demo.call;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import cn.demo.context.BaseUserContext;
import cn.demo.context.UserContext3;
import cn.demo.service.UserService;

public class CallService3 extends BaseCall {

	//申明一个简单的线程池,3个核心线程
    private static final AtomicInteger threadIdCreator = new AtomicInteger(1);
    private static ExecutorService pool = Executors.newFixedThreadPool(3, (runnable) ->
         new Thread(runnable, "ThreadName-" + threadIdCreator.getAndIncrement())
    );

    public static void main(String[] args) {
    	BaseUserContext userContext = new UserContext3();
        UserService userService = new UserService(userContext);
        //同时10个调用
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
            	userContext.set(initUser(Thread.currentThread().getName()));
                //使用线程池进行调用
                pool.execute(userService::addUser);
            }, "CallService3-" + i).start();
        }
    }

}