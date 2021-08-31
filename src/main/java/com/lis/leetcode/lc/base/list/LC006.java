package com.lis.leetcode.lc.base.list;

import com.lis.leetcode.lc.base.common.ListNode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * LC006
 *
 * @author Lis
 * @version 1.0
 * @date 2021-8-26 10:41
 */
public class LC006 {

    /**
     * 给定一个链表，判断链表中是否有环。
     *
     * <p>如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
     *
     * <p>如果链表中存在环，则返回 true 。 否则，返回 false 。
     *
     * <p>
     *
     * <p>进阶：
     *
     * <p>你能用 O(1)（即，常量）内存解决此问题吗？
     *
     * <p>
     *
     * <p>示例 1：
     *
     * <p>输入：head = [3,2,0,-4], pos = 1 输出：true 解释：链表中有一个环，其尾部连接到第二个节点。 示例 2：
     *
     * <p>输入：head = [1,2], pos = 0 输出：true 解释：链表中有一个环，其尾部连接到第一个节点。 示例 3：
     *
     * <p>输入：head = [1], pos = -1 输出：false 解释：链表中没有环。
     *
     * <p>提示：
     *
     * <p>链表中节点的数目范围是 [0, 104] -105 <= Node.val <= 105 pos 为 -1 或者链表中的一个 有效索引 。 相关标签 哈希表 链表 双指针
     *
     * <p>Java
     *
     * <p>作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnwzei/ 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public boolean hasCycle(ListNode head) {
        //  快慢指针处理
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow.equals(fast)) {
                return true;
            }
        }
        return false;
    }

  public static void main(String[] args) {
    //
      String tjsj = "2021-08-01";
      LocalDate tjsjDate = LocalDate.parse(tjsj);
      List<String> tjsjList = new ArrayList<>();
      for(int i = 0; i < 12; i++) {
          LocalDate newTjsj = tjsjDate.minusMonths(i);
          String tjsjStr = newTjsj.format(DateTimeFormatter.ofPattern("yyyy-MM"));
          tjsjList.add(tjsjStr);
      }
    System.out.println(Arrays.toString(tjsjList.toArray()));
  }
}
