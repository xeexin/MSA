package quiz_answer;

enum Grade {
    LOW,NORM,OVERWEIGHT,OBESE
}

public class BMI {  // model
    String name;
    int weight,height,sex;
    double BMI;
    Grade grade;


    //18.5> 저체중 18.5<= bmi< 23 정상 23<=bmi<25 과체중 25<=비만
    //BMI = weight / (((height-100)*0.9/ 100.0)*((height-100)*0.9/100))
    //남자의 경우 곱셈 계수 0.9 여자의 경우 0.85


    public BMI(String name ,int weight, int height, int sex) {
        this.name =name;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.grade = this.Calculate();
    }
    
    private Grade Calculate(){
        double factor =0.0;
        if(sex==1){ //남성
            factor = 0.9;
        }else{ //여성
            factor = 0.85;
        }
        
        this.BMI = this.weight/((double)this.height*this.height/10000);
        
        if(this.BMI<18.5){
            return Grade.LOW;
        } else if (this.BMI<23) {
            return Grade.NORM;
        } else if (this.BMI<25) {
            return Grade.OVERWEIGHT;
        }else {
            return Grade.OBESE;
        }
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", sex=" + sex +
                ", BMI=" + BMI +
                ", grade=" + grade +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

//collection,file,io사용하여 비만도 측정 프로그램 작성
//추가/삭제/출력/수정처리할 것.

