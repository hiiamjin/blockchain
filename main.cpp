#include <ctime>
#include <vector>

using namespace std;

// Transaction Data
struct Transaction {
    double amount;
    string senderKey;
    string receiverKey;
    time_t timestamp;
}


// Block class
class Block {
    private:
        int index;
        size_t blockHash;
        size_t previousHash;
        size_t generateHash();

    public:
        // Constructor
        Block(int idx, TransactionData d, size_t prevHash);

        // Get Original Hash
        size_t getHash();

        // Get Previous Hash
        size_t getPreviousHash();

        // Trajscation Data
        TransactionData data;

        // Validate Hash
        bool isHashValid();
}


