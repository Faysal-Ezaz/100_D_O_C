class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> tria = new ArrayList<>(rowIndex + 1);
        int colNum = 1;
        for (int r = 0; r <= rowIndex; r++) {
            List<Integer> row = new ArrayList<>(colNum);
            for (int i = 0; i < colNum; i++) {
                row.add(1);
            }
            tria.add(row);
            for (int c = 1; c < colNum - 1; c++) {
                tria.get(r).set(c, tria.get(r - 1).get(c - 1) + tria.get(r - 1).get(c));
            }
            colNum++;
        }
        return tria.get(rowIndex);
    }
}
