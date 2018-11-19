class Solution(object):
    def numUniqueEmails(self, emails):
        """
        :type emails: List[str]
        :rtype: int
        """
        if len(emails) == 0 or len(emails) > 100:
            return 0
        emailSet = set()
        for email in emails:
            if len(email) > 100:
                return 0
            local,domain = email.split("@")
            if("+" in local):
                local=local.split("+",1)[0]
            newLocal = local.replace(".","")
            emailSet.add(newLocal+domain)
        return len(emailSet)