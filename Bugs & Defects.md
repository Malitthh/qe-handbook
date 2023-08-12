# Bug Tracking and Resolution Process

### Bug is a fault in software that is detected during testing time.
### Defect is a variation or deviation of the software application from end user's requirements or original business requirements.

### Why do faults occur in software?
- Software is written by humans
- Under increasing pressure to deliver to strict deadlines
- Common reasons:
  - Incomplete code
  - Errors in design
  - Poor test coverage

### Bug Report
A bug report is a detailed document about bugs found in the software application. It helps developers, testers, project managers, and other individuals involved in the project to stay updated on the bugs and make the software more reliable.

Bug report should contain:
- Defect ID
- Defect Summary
- Version
- Steps to replicate
- Status
- Detected by
- Fixed by
- Severity (refers to the impact of the bug on the software)
- Priority (refers to the order in which the defect should be resolved)

### Hot Fix
A hot fix is a fix done on an immediate basis for impacted areas.

### Steps to Follow When Discovering a Bug at the Time of Release
1. Prioritize the bug
2. Document & replicate
3. Communicate
4. Calculate the risk
5. Work with dev team to resolve the issue
6. Perform regression tests
7. Validate the fix

### Bug Status Flow:
- New
- Assigned
- Open (Duplicate/Rejected/Defined/Not a Bug)         
- Fixed                                               
- Pending Retest                                      
- Retest                                              
- (Retest Failed) --> Reopened 
- Verified
- Closed
