package teste.junit;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {

	@Test
	public void testData() {

		try {
			
			// System.out.println(DateUtils.getDateAtualReportName());			
			assertEquals("27052018", DateUtils.getDateAtualReportName());
			
			assertEquals("'2018-05-27'", DateUtils.formatDateSql(Calendar.getInstance().getTime()));
			
			assertEquals("2018-05-27", DateUtils.formatDateSqlSimple(Calendar.getInstance().getTime()));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
