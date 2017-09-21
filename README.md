# Tornado
Tiny analytics system (java client)

### Tracking

Identify user

```java
TornadoAnalytics analytics = TornadoManager.getAnalyticsInstance();
analytics.identify(userOrDeviceId);
```

Single event

```java
TornadoAnalytics analytics = TornadoManager.getAnalyticsInstance();
analytics.track("Clicked 'Sign in'"); // Event key
```

Event with parameters

```java
TornadoAnalytics analytics = TornadoManager.getAnalyticsInstance();
// TODO
```
