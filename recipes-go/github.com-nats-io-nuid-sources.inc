SRC_URI_append = " https://proxy.golang.org/github.com/nats-io/nuid/@v/v1.0.1.zip;srcoutput=github.com/nats-io/nuid;srcinput=github.com/nats-io/nuid@v1.0.1;downloadfilename=github-com-nats-io-nuid-1.0.1.zip;name=github-com-nats-io-nuid"
SRC_URI[github-com-nats-io-nuid.sha256sum] = "809d144fbd16f91651a433e28d2008d339e19dafc450c5995e2ed92f1c17c1f3"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/nats-io/nuid/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
