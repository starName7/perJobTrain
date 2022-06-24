package date0623.java7.studyAbroad;

public abstract class StudyAbroad {
    public void TemplateMethod(){
        LookingForSchool();
        ApplyForEnrol();
        ApplyForPassport();
        ApplyForVisa();
        ReadyGoAbroad();
        Arriving();
    }
    public void LookingForSchool(){

    }
    public void ApplyForEnrol(){

    }
    public void ApplyForPassport(){
        System.out.println("办理因私出国护照，处境卡和公正");
        System.out.println(" 1）持录取通知书、本⼈户⼝簿或身份证向户⼝所在地公安机关申请办理因私出国护照和出境卡。");
        System.out.println(" 2）办理出⽣公证书，学历、学位和成绩公证，经历证书，亲属关系公证，经济担保公证。");
    }
    public void ApplyForVisa(){
        System.out.println("申请签证");
        System.out.println(" 1）准备申请国外境签证所需的各种资料，包括个⼈学历、成绩单、⼯作经历的证明；个⼈及家庭收⼊、资⾦和财产证明；家庭成员的关系证明等；");
        System.out.println(" 2）向拟留学国家驻华使(领)馆申请⼊境签证。申请时需按要求填写有关表格，递交必需的证明材料，缴纳签证。有的国家(⽐如美国、英国、加拿⼤等)在申请签证时会要求申请⼈前往使(领)馆进⾏⾯试。");
    }
    public void ReadyGoAbroad(){
        System.out.println("体检、订机票、准备行装");
        System.out.println(" 1）进⾏身体检查、免疫检查和接种传染病疫苗；");
        System.out.println(" 2）确定机票时间、航班和转机地点。");
    }
    public void Arriving(){

    }
}
