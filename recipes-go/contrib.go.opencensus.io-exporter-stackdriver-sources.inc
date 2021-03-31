SRC_URI_append = " https://proxy.golang.org/contrib.go.opencensus.io/exporter/stackdriver/@v/v0.13.5.zip;srcoutput=contrib.go.opencensus.io/exporter/stackdriver;srcinput=contrib.go.opencensus.io/exporter/stackdriver@v0.13.5;downloadfilename=contrib-go-opencensus-io-exporter-stackdriver-0.13.5.zip;name=contrib-go-opencensus-io-exporter-stackdriver"
SRC_URI[contrib-go-opencensus-io-exporter-stackdriver.sha256sum] = "733e3c5d605f561a8e563fa060d0efc3a7b4e295f57614465e6d9d19b09a0bb4"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/contrib.go.opencensus.io/exporter/stackdriver/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
