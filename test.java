public class test {
    public static void main(String[] args) {

        //4. ������� ������ �� 5 �����������
        employer[] emp = new employer[5];
        emp[0] = new employer("������ ����", "�������", "ivanov@mail.ru",
                "943-456-21-44", 50000, 27);
        emp[1] = new employer("������� �������", "��������� �������������", "sidorov@list.ru",
                "943-873-21-44", 45000, 37);
        emp[2] = new employer("�������� �����", "���������", "nikitina@gmail.com",
                "954-873-21-44", 35000, 43);
        emp[3] = new employer("������� ��������", "�������������", "andreev@gmail.com",
                "987-232-24-54", 47000, 45);
        emp[4] = new employer("����� ���������", "������� �������", "ivkov@box.ru",
                "987-242-26-654", 55000, 40);


        for (employer employer : emp) {
            if (employer.getAge() > 40)
                System.out.println(employer.toString());
        }

    }
}