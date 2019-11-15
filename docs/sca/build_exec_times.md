# How are the statistics of a tool calculated?

If you've asked yourself how the scales at the tool configuration pages are determined,
here the answer

## Build time

The needed build time is calculated from the recipe and all of it's dependencies.
This means the scale gives a hint how much time is needed to build the component from scratch
so the first recipe using this tool is waiting as least so long before being processed.

**NOTE**: This calculation assumes that everything is done sequentially, which isn't the case
with bitbake. So a lot of the tools are actually building much faster, esp. when you need some
of the tools for your build anyways.
This type of calculation is only applied to be able to compare the tools.

Following table it used to define the scaling

| needed time in s | scale
| ------------- |:--:
| < 60s         | 10
| 60-180s       | 9
| 180-300s      | 8
| 300-600s      | 7
| 600-1200s     | 6
| 1200-3600s    | 5
| 3600-7200s    | 4
| 7200-12000    | 3
| 12000-20000   | 2
| 20000-30000   | 1
| 30000-inf.    | 0

## Execution time

The needed time for the tool to be executed is calculated from the average of all runs which
lasted at least 2s

Following scaling is applied

| avg. time in s | scale
| --------- |:--:
| < 2s      | 10
| 2-5s      | 9
| 5-10s     | 8
| 10-30s    | 7
| 30-60s    | 6
| 60-120s   | 5
| 120-240s  | 4
| 240-480s  | 3
| 480-960s  | 2
| 960-1920s | 1
| >1920s    | 0
