package contollerTest;

import com.nyg.ssm.controller.ItemsControll;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author zjl
 * @Date 2019/6/22 9:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext.xml"} )
@WebAppConfiguration
public class ItemTest {
    @Test
    public void testItem()throws Exception{
        ItemsControll itemsControll = new ItemsControll();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(itemsControll).build();
        String responseString = mockMvc.perform(MockMvcRequestBuilders.
                get("/categories/getAllCategory").
                contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                param("pcode","root")         //添加参数
        ).andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("--------返回的json = " + responseString);
    }
}
