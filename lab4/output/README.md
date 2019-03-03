The CRC Clases are as below:

Customer:

Responsibilities:
Knows Name, Phone No and Number of people for the party
Signs up for waitlist on the QueueHandler
Responds with Confirm/Leave to Receiver when a table is available
Messages to stop receiving messages from QueueHandler

Collaborators:
QueueHandler
Receiver


QueueHandler:

Responsibilities:
Adds a customer to the Queue of receivers when a customer makes a request.
Receives message from TableHandler that a table is available.
Signals chain (queue) of receivers with the available table and it’s quantity. 
Receives message from Receiver when a customer Accepts. Deletes receiver object. Informs TableHandler that the table is booked.
Deletes corresponding customer object from Receiver queue when a customer sends Stop message.

Collaborators:
Customer
TableHandler
Receiver


TableHandler:
Responsibilities:
Knows the available and occupied tables with their capacity
Informs QueueHandler when a table becomes available

Collaborators:
QueueHandler


Receiver:
Responsibilities:
Knows a waitlisted customer with name, phone and required capacity.
Knows the successor Receiver object if customer does not accept.
Receives a message from QueueHandler or it’s predecessor when a table is available
Notifies the customer with available table and it’s capacity

Collaborators:
Customer
QueueHandler



I used 2 Design patterns:
Observer Pattern
Chain of responsibility

The Observer Pattern can be observed between QueueHandler (observer) and TableHandler (subject). The QueueHandler subscribes for table availability event. Whenever a table is available, TableHandler informs QueueHandler of the event. QueueHandler subsequently informs the Receivers which notify customer for table availability.

The Chain of responsibility pattern can be observed between QueueHandler (Sender), Receiver 1 and Receiver 2. QueueHandler sends a message to Receiver1 that a table is available. Receiver1 notifies a waitlisted customer of the availability. If customer accepts, then table is marked as booked and corresponding customer record deleted. If the customer replies as Leave, then Receiver paases the message to it's successor (Receiver2) which handles the message in the same way.  
