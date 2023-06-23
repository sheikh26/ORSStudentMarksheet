package Com.Test;



import Marksheet.Vo.RagistrationVo;
import MarksheetService.RagistrationService;

public class RagistrationTest {

	public static void main(String[] args) throws Exception {
		RagistrationVo vo=new RagistrationVo();
		vo.setFirstName("dhaparam");
	vo.setLastName("gujre");
	vo.setFatherName("GC.gujre");
	vo.setEmailId("Dg.dg@gmail.com");
	vo.setCirruntAdd("fgdkjsagfjsag");
	vo.setParmanentAdd("hjgfjhdfg");
	vo.setCatagary("st");
	vo.setGender("male");
	vo.setDob("23/23/23");
	vo.setCity("indore");
	vo.setPhoneNo("254325613562");
	vo.setCourse("agsgha");
	vo.setState("ytewu");
	RagistrationService service=new RagistrationService();
	service.submit(vo);
	}
}
