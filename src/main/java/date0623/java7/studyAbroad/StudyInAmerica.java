package date0623.java7.studyAbroad;

public class StudyInAmerica extends StudyAbroad{
    @Override
    public void LookingForSchool() {
        System.out.println("索取学校资料");
        System.out.println(" 1）对美国的政治、经济、文化背景和教育体制、学术⽔平进⾏较为全⾯的了解；");
        System.out.println(" 2）全⾯了解和掌握美国学校的情况，包括历史、学费、学制、专业、师资配备、教学设施、学术地位、学⽣⼈数等；");
        System.out.println(" 3）了解该学校的住宿、交通、医疗保险情况如何；");
        System.out.println(" 4）该学校在中国是否有授权代理招⽣的留学中介公司？");
        System.out.println(" 5）掌握留学签证情况；");
        System.out.println(" 6）美国政府是否允许留学⽣合法打⼯？");
        System.out.println(" 8）毕业之后可否移⺠？");
        System.out.println(" 9）⽂凭是否受到我国认可");
    }
    @Override
    public void ApplyForEnrol(){
        System.out.println("入学申请");
        System.out.println(" 1）填写报名表；");
        System.out.println(" 2）将报名表、个⼈学历证明、最近的学习成绩单、推荐信、个⼈简历、托福或雅思语言考试成绩单等资料寄往所申请的学校；");
        System.out.println(" 3）等待学校的审批");
        System.out.println(" 4）为了给签证办理留有充裕的时间，建议越早申请越好，⼀般提前1年就⽐较从容。~");
    }
    @Override
    public void Arriving(){
        System.out.println("抵达");
        System.out.println(" 1）安排住宿；");
        System.out.println(" 2）了解校园及周边环境。");
        System.out.println(" 3) 学校组织留学生活动");
    }
}
