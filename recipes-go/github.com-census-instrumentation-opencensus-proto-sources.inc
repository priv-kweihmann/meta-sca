SRC_URI_append = " https://proxy.golang.org/github.com/census-instrumentation/opencensus-proto/@v/v0.3.0.zip;srcoutput=github.com/census-instrumentation/opencensus-proto;srcinput=github.com/census-instrumentation/opencensus-proto@v0.3.0;downloadfilename=github-com-census-instrumentation-opencensus-proto-0.3.0.zip;name=github-com-census-instrumentation-opencensus-proto"
SRC_URI[github-com-census-instrumentation-opencensus-proto.sha256sum] = "579ab1ff19403579c3b438ab95528dfc691f0ff6076829f4ed2b2d2dc5b72552"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/census-instrumentation/opencensus-proto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
