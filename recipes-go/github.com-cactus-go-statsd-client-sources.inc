SRC_URI += "https://github.com/cactus/go-statsd-client/archive/refs/tags/v5.0.0.zip;srcoutput=github.com/cactus/go-statsd-client;srcinput=go-statsd-client-5.0.0;downloadfilename=github-com-cactus-go-statsd-client-5.0.0.zip;name=github-com-cactus-go-statsd-client"
SRC_URI[github-com-cactus-go-statsd-client.sha256sum] = "1faa133546e1eb16969ebe61b8fdb6c4f9d545f636fa1252bde92a2870009cc3"
GOSRC_REMOVEDIRS += "github.com/cactus/go-statsd-client/test-client"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cactus/go-statsd-client/LICENSE.md;md5=777c3f326093fa1917927de63bfe8cc1 \
"

GOSRC_INCLUDEGUARD += "github.com-cactus-go-statsd-client-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jessevdk-go-flags-sources.inc', '', 'github.com-jessevdk-go-flags-sources.inc', d)}
