package MarksheetTest;



import Marksheet.Vo.MarksheetVo;
import MarksheetService.MarksheetService;

public class MarksheetTest {
     public static void main(String[] args) throws Exception {
		MarksheetVo vo=new MarksheetVo();
		vo.setName("hhh");
		vo.setRollNo(22);
		vo.setPhysics(34);
	    vo.setMaths(34);
	    vo.setChemistry(34);
	    vo.setHindi(45);
	    vo.setEnglish(45);
	    MarksheetService service=new MarksheetService();
	    service.update(vo);
     }
}
