int sum = 0;
StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || sum == 1; i--, j--) {
sum += i >= 0 ? a.charAt(i) - '0' : 0;
sum += j >= 0 ? b.charAt(j) - '0' : 0;
        sb.append(sum % 2);
sum /= 2;
        }
        return sb.reverse().toString();