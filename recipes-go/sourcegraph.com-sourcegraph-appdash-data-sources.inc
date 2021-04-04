SRC_URI += "https://proxy.golang.org/sourcegraph.com/sourcegraph/appdash-data/@v/v0.0.0-20151005221446-73f23eafcf67.zip;srcoutput=sourcegraph.com/sourcegraph/appdash-data;srcinput=sourcegraph.com/sourcegraph/appdash-data@v0.0.0-20151005221446-73f23eafcf67;downloadfilename=sourcegraph-com-sourcegraph-appdash-data-0.0.0-20151005221446-73f23eafcf67.zip;name=sourcegraph-com-sourcegraph-appdash-data"
SRC_URI[sourcegraph-com-sourcegraph-appdash-data.sha256sum] = "382adefecd62bb79172e2552bcfb7d45f47122f9bd22259b0566b26fb2627b87"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/sourcegraph.com/sourcegraph/appdash-data/data/Caged/d3-tip/LICENSE;md5=eb7a2c2e9c548bab783d42f549d09055 \
"

GOSRC_INCLUDEGUARD += "sourcegraph.com-sourcegraph-appdash-data-sources.inc"

