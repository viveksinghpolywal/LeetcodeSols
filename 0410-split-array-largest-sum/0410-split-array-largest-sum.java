class Solution {

    public int splitArray(int[] pages, int m) {

        int n = pages.length;

        if (m > n) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int page : pages) {

            low = Math.max(low, page);
            high += page;
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int students = countStudents(pages, mid);

            if (students <= m) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }

    private int countStudents(int[] pages,
                              int limit) {

        int students = 1;

        int pagesAllocated = 0;

        for (int page : pages) {

            if (pagesAllocated + page <= limit) {

                pagesAllocated += page;

            } else {

                students++;

                pagesAllocated = page;
            }
        }

        return students;
    }
}