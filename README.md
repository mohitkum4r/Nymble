
## Components

### Controllers
- **CaptureController**: Handles HTTP requests for image capture.

### Models
- **CaptureRequest**: Represents a request to capture an image.
- **CaptureResult**: Represents the result of an image capture.
- **Log**: Represents a log entry.
- **Metric**: Represents a performance metric.
- **RequestLog**: Represents a log of a capture request.

### Services
- **AsyncCaptureManager**: Manages asynchronous image capture.
- **CameraHardwareInterface**: Interfaces with the camera hardware.
- **CaptureService**: Processes capture requests and enqueues them based on priority.
- **CallbackSystem**: Notifies clients of capture results.
- **MonitoringAndLogs**: Tracks performance and logs system activities.
- **PriorityQueue**: Manages high-priority capture requests.
- **PrioritizationService**: Determines the priority of capture requests.
- **RequestProcessor**: Processes capture requests from the queues.
- **ResultDispatcher**: Dispatches capture results to the appropriate callbacks.
- **StandardQueue**: Manages standard-priority capture requests.
- **StorageAndLogs**: Stores captured images and logs.

### Factories
- **CaptureRequestFactory**: Creates instances of `CaptureRequest`.
- **CaptureResultFactory**: Creates instances of `CaptureResult`.

### Strategies
- **QueueStrategy**: Interface for queue strategies.
- **PriorityQueueStrategy**: Strategy for handling high-priority requests.
- **StandardQueueStrategy**: Strategy for handling standard-priority requests.

## Diagram

For a visual representation of the system's architecture, refer to the following Excalidraw diagram:

[Excalidraw Diagram](https://excalidraw.com/#json=a9wBRZCy4xjoTopvhxgUN,PtVJekFe85mYjpWoifCy8g)
