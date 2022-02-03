class Solution(object):
    def checkIfPangram(self, sentence):
        ABCD = "abcdefghijklmnopqrstuvwxyz"
        for alphabet in ABCD:
            if alphabet not in sentence:
                return False

        return True
        