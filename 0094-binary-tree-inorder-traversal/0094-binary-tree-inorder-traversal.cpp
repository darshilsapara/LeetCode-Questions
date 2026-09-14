/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void inorderTraversalHelp(vector<int> &order,TreeNode* node){
        if(!node){
            return;
        }
        inorderTraversalHelp(order,node->left);
        order.push_back(node->val);
        inorderTraversalHelp(order,node->right);
    }
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> order;
        inorderTraversalHelp(order,root);
        return order;   
    }
};