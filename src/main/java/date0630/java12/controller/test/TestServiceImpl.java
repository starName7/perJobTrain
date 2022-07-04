package date0630.java12.controller.test;

@Service(value = "Don")
public class TestServiceImpl implements ITestService{
    @Resource
    ITestService testService;
}
