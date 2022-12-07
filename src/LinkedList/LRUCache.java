package LinkedList;

class LRUCache{
     class LRUcache {
        int maxSize;

        public LRUcache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
        }

        public void insertKeyValuePair(String key, int value) {
            // Write your code here.

        }

        public LRUResult getValueFromKey(String key) {
            // Write your code here.

            return null;
        }

        public String getMostRecentKey() {
            // Write your code here.
            return null;
        }
    }

     class LRUResult {
        boolean found;
        int value;

        public LRUResult(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }

}