package Com.Test;



import Marksheet.Vo.MarksheetVo;
import MarksheetService.MarksheetService;

public class MarksheetTest {
  public static void main(String[] args) throws Exception {
	MarksheetVo vo=new MarksheetVo();
	vo.setRollNo(22);
	/*vo.setName("dhe");
	vo.setPhysics(34);
	vo.setMaths(23);
	vo.setChemistry(34);
	vo.setHindi(45);
	vo.setEnglish(34);
	
	*/MarksheetService service=new MarksheetService();
	service.get(vo);
	System.out.println(vo.getRollNo());
System.out.println(vo.getName());
System.out.println(vo.getPhysics());
System.out.println(vo.getMaths());
System.out.println(vo.getChemistry());
System.out.println(vo.getHindi());
System.out.println(vo.getEnglish());

  }
}
