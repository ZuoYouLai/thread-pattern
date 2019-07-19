## 第一种线程模式： Single Thread Execution 单一线程执行
### 例子类：共享资源
 + Main 创建门 并让三个人不断地通过地类
 + Gate 表示门地类 通过门地时候记录姓名 跟 出生地
 + UserThread 人类，不断地通过过门
 
### 延伸阅读 
#### 关于 synchronized 
+ 可以上面地例子可以看出，为了保证单一线程进行操作地时候 使用 synchronized 修饰方法与代码库 
+ 其实还可以通过锁地方式进行操作：lock
  ```text
    void method{
      lock();
      if(xxx){
          return;  //这里直接返回了，unlock()就不会被调用啦
      }
      unlock();
    }
    
    修改如下：
  
    void method{
        lock();
        try{
            if(xxx){
                return;  //这里直接返回了，unlock()就不会被调用啦
            }
         }finaly{
            unlock();
       }
    }
  
  ```

### juc 包和计数信号量的例子延伸  

  
 
 
 
 

