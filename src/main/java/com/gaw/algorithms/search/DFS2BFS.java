package com.gaw.algorithms.search;

import java.util.LinkedList;

/**
 * @author gaopo
 * @date 2019/3/26.
 */
public class DFS2BFS {
    /**
     * 深度优先遍历
     */
    public static void dfs(Graph graph, int start, boolean[] visited) {
        System.out.println(graph.vertexes[start].data);
        visited[start] = true;
        for (int index : graph.adj[start]) {
            if (!visited[index]) {
                dfs(graph, index, visited);
            }
        }
    }


    /**
     * 广度优先遍历
     */
    public static void bfs(Graph graph, int start, boolean[] visited, LinkedList<Integer> queue) {
        queue.offer(start);
        while (!queue.isEmpty()) {
            int front = queue.poll();
            if (visited[front]) {
                continue;
            }
            System.out.println(graph.vertexes[front].data);
            visited[front] = true;
            for (int index : graph.adj[front]) {
                queue.offer(index);
            }
        }

    }

    /**
     * 图的顶点
     */
    private static class Vertex {
        int data;

        Vertex(int data) {
            this.data = data;
        }

    }


    /**
     * 图（邻接表形式）
     */

    private static class Graph {
        private int size;
        private Vertex[] vertexes;
        private LinkedList<Integer> adj[];

        Graph(int size) {
            this.size = size;
            //初始化顶点和邻接矩阵
            vertexes = new Vertex[size];
            adj = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                vertexes[i] = new Vertex(i);
                adj[i] = new LinkedList();
            }

        }

    }
}
