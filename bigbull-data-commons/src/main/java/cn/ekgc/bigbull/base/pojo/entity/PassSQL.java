package cn.ekgc.bigbull.base.pojo.entity;

import javax.print.DocFlavor;
import java.io.*;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/8
 */
public class PassSQL {
	public static void main(String[] args) throws IOException {
		String srcPath="C:\\Users\\Lixubo\\Desktop\\2020年12月中华人民共和国县以上行政区划代码.txt";
		String dosePath="C:\\Users\\Lixubo\\Desktop\\行政区划.sql";
		BufferedReader br = new BufferedReader(new FileReader(new File(srcPath)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(dosePath)));
		String magess= "";
		while ((magess=br.readLine())!=null){
		String code=magess.substring(0,6);
		String name=magess.substring(6,magess.length()).trim();
		String sql="";
			if (code.substring(2,6).equals("0000")){
				sql="insert into sys_admin_division(name,code) values('"+name+"','"+code+"');";
			bw.write(sql);
			bw.newLine();
			} else if (code.substring(4,code.length()).equals("00")
					||code.substring(0,2).equals("11")
					||code.substring(0,2).equals("12")
					||code.substring(0,2).equals("31")||code.substring(0,2).equals("50")) {
				String parent=code.substring(0,2)+"0000";
				sql="insert into sys_admin_division(parent,name,code) values('"+parent+"','"+name+"','"+code+"');";
				bw.write(sql);
				bw.newLine();
			}else {
				String parent=code.substring(0,4)+"00";
				sql="insert into sys_admin_division(parent,name,code) values('"+parent+"','"+name+"','"+code+"');";
				bw.write(sql);
				bw.newLine();
			}

		}
		bw.close();
		System.out.println("写入成功！");
	}
}
