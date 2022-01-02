SRC_URI += "git://github.com/cactus/go-statsd-client;nobranch=1;protocol=https;srcinput=github.com/cactus/go-statsd-client;srcoutput=github.com/cactus/go-statsd-client;destsuffix=github.com/cactus/go-statsd-client;name=github-com-cactus-go-statsd-client"
SRCREV_github-com-cactus-go-statsd-client = "7eb0950793aa9a679bc468eb1da9b5520f73b16f"
GOSRC_REMOVEDIRS += "github.com/cactus/go-statsd-client/test-client"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cactus/go-statsd-client/LICENSE.md;md5=777c3f326093fa1917927de63bfe8cc1 \
"

GOSRC_INCLUDEGUARD += "github.com-cactus-go-statsd-client-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jessevdk-go-flags-sources.inc', '', 'github.com-jessevdk-go-flags-sources.inc', d)}
