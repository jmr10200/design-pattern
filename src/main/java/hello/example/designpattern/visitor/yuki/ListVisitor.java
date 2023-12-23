package hello.example.designpattern.visitor.yuki;

public class ListVisitor extends Visitor {
    // 현재 주목하는 디렉토리 이름
    private String currentDir = "";

    // File 방문 시 File 클래스의 accept 메소드 안에서 호출 됨
    @Override
    public void visit(File file) {
        // File 클래스의 인스턴스에 해야할 처리
        System.out.println(currentDir + "/" + file);
    }

    // Directory 방문 시 Directory 클래스의 accept 메소드 안에서 호출 됨
    @Override
    public void visit(Directory directory) {
        // Directory 클래스의 인스턴스에 해야할 처리
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        for (Entry entry : directory) {
            // accept()는 visit() 호출, visit()는 accept() 호출 : 재귀적 메소드 호출
            // Visitor 패턴에서는 visit() 메소드와 accept() 메소드가 서로 상대방을 호출한다.
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
