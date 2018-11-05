# Pure config sandbox

This project defines:
- a dummy library with a default config file
- a dummy app using such a library, and overriding some config

## How to test

### Publish the lib locally

```
sbt lib/publishLocal
```

### Run the app

```
sbt app/run
```

