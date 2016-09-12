# AndroidUtils 一个封装的工具库



#使用说明
    在应用程序build.gradle加入
    compile 'com.lichanghu:androidutils:1.1.0'
    
#打印输入类使用
    
    public static AndroidUtilsApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //使用AndroidUtils.Klog打印信息 false是关闭信息
        KLog.init(true);
    }
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KLog.d("-------------------------");
        KLog.d("tag","--------------------");
    }
    

#activity管理
    在父类中增加统一管理activity
    
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExitAppUtils.getInstance().addActivity(this);
    }
   
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ExitAppUtils.getInstance().delActivity(this);
    }
    
#    
    
  
  
  
    
    
    
    
    
