package main.java.dataStructure.graph;

/*
 * 定义图的结构
 */
public class Graph {
	//节点数目
	protected int size=20;
	//定义数组，保存顶点信息
	protected String[] nodes;

	//定义矩阵保存顶点信息
	protected int[][] edges;

	protected int[] visit;            //遍历标志

	/**
	 *      vo v1 v2 v3
	 *   vo  0  1  1  1
	 *   v1  1  0  1  0
	 *   v2  1  1  0  1
	 *   v3  1  0  1  0
	 */
	public Graph(){
		size=4;

		//初始化顶点
		nodes = new String[size];
		for (int i=0;i<size;i++){
			nodes[i] = String.valueOf(i);
		}

		//初始化边
		edges = new int[size][size];
		edges[0][1] = 1;
		edges[0][2] = 1;
		edges[0][3] = 1;
		edges[1][0] = 1;
		edges[1][2] = 1;
		edges[2][0] = 1;
		edges[2][1] = 1;
		edges[2][3] = 1;
		edges[3][0] = 1;
		edges[3][2] = 1;
	}

	public static void main(String[] args) {
		Graph graph = new Graph();

	}
}