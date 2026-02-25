int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        //initilization
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                dp[i][j]= -1;
            }
        }
       
        System.out.println(lcsm(str1, str2, n, m, dp));