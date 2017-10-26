package com.ketech.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 包名: com.ketech.controller <br/>
 * 类名: UploadController <br/>
 * 版本: version 1.0 <br/>
 * 作者: 武国华 <br/>
 *
 * @author: WuGuoHua <br/>
 * 创建日期: 2017年10月26日 <br/>
 * 描述: UploadController <br/>.
 */

@Controller
public class UploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){
        try {
            FileUtils.writeByteArrayToFile(new File("e:/upload/" + file.getOriginalFilename()), file.getBytes());
            return "OK";
        } catch (IOException e) {
            e.printStackTrace();
            return "WRONG";
        }
    }
}
