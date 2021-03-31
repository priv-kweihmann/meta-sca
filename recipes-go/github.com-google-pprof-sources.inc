SRC_URI_append = " https://proxy.golang.org/github.com/google/pprof/@v/v0.0.0-20210323184331-8eee2492667d.zip;srcoutput=github.com/google/pprof;srcinput=github.com/google/pprof@v0.0.0-20210323184331-8eee2492667d;downloadfilename=github-com-google-pprof-0.0.0-20210323184331-8eee2492667d.zip;name=github-com-google-pprof"
SRC_URI[github-com-google-pprof.sha256sum] = "aa64db655cea5127862542999ce21fb3393b257185581ab3bb90343cabb6e28e"

MOD_LICENSE_append = " \
    Apache-2.0 \
    BSD-2-Clause-Views \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/google/pprof/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/google/pprof/third_party/d3/LICENSE;md5=0679931d76eb2f1dd1915249da84a722 \
    file://src/github.com/google/pprof/third_party/d3flamegraph/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
    file://src/github.com/google/pprof/third_party/svgpan/LICENSE;md5=d461adb153ae3553b5106ae77fd4d1db \
"
