package com.ketech.learnfreemarker;

import com.ketech.bo.Address;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnFreemarkerApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Hello World");
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
		try {
			cfg.setDirectoryForTemplateLoading(new File("templates"));
			Map root = new HashMap();
			root.put("user", "Peter");
			root.put("random", new Random().nextInt(100));

			List list = new ArrayList();
			list.add(new Address("中国","北京"));
			list.add(new Address("中国","上海"));
			list.add(new Address("美国","纽约"));
			root.put("lst", list);

			Template t1 = cfg.getTemplate("a.ftl");
			Writer out = new OutputStreamWriter(System.out);
			t1.process(root, out);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
