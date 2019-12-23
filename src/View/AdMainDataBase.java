package View;

import java.util.ArrayList;

//定义储存数据类
public class AdMainDataBase {
	public static ArrayList<AdMainStudentinto> data = new ArrayList<AdMainStudentinto>();
	// 初始化数据
	static {
		data.add(new AdMainStudentinto("1", "《西游记》", 280, "本"));
		data.add(new AdMainStudentinto("2", "《红楼梦》", 250, "本"));
		data.add(new AdMainStudentinto("3", "《水浒传》", 180, "本"));
		data.add(new AdMainStudentinto("4", "《三国演义》", 180, "本"));
		data.add(new AdMainStudentinto("5", "《诗经》", 200, "本"));
		data.add(new AdMainStudentinto("6", "《论语》", 215, "本"));
	}
}
