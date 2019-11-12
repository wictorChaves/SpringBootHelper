# Apache AB

Apache AB é uma ferramenta para benchmarking 

## Exemplo

    C:\Users\wictor>cd C:\wamp64\bin\apache\apache2.4.39\bin> ab -n 1000 -c 100 http://localhost:8080/api/exemplo/teste%20gdfdg
    
**Saída**

    This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
    Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
    Licensed to The Apache Software Foundation, http://www.apache.org/
    
    Benchmarking localhost (be patient)
    Completed 100 requests
    Completed 200 requests
    Completed 300 requests
    Completed 400 requests
    Completed 500 requests
    Completed 600 requests
    Completed 700 requests
    Completed 800 requests
    Completed 900 requests
    Completed 1000 requests
    Finished 1000 requests
    
    
    Server Software:
    Server Hostname:        localhost
    Server Port:            8080
    
    Document Path:          /api/exemplo/teste%20gdfdg
    Document Length:        16 bytes
    
    Concurrency Level:      100
    Time taken for tests:   0.196 seconds
    Complete requests:      1000
    Failed requests:        0
    Total transferred:      149000 bytes
    HTML transferred:       16000 bytes
    Requests per second:    5096.79 [#/sec] (mean)
    Time per request:       19.620 [ms] (mean)
    Time per request:       0.196 [ms] (mean, across all concurrent requests)
    Transfer rate:          741.62 [Kbytes/sec] received
    
    Connection Times (ms)
                  min  mean[+/-sd] median   max
    Connect:        0    0   0.3      0       1
    Processing:     4   18   3.8     18      29
    Waiting:        2   14   4.7     14      26
    Total:          4   18   3.9     18      29
    
    Percentage of the requests served within a certain time (ms)
      50%     18
      66%     19
      75%     20
      80%     20
      90%     23
      95%     26
      98%     27
      99%     27
     100%     29 (longest request)