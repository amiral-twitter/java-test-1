Create an insurance contract API to:
- create a contract
  - a beneficiary can only have one open contract of each type
  - beneficiary and tyoe are required
  - status is intialized to "opened"
- cancel a contract
  - must exists
  - can't close an already closed contract
  - status is set to "closed"

Contract properties:
- beneficiary of the contract
- type ("life" or "death")
- status ("opened" or "closed")
