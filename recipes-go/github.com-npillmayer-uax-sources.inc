SRC_URI += "https://proxy.golang.org/github.com/npillmayer/uax/@v/v0.2.0.zip;srcoutput=github.com/npillmayer/uax;srcinput=github.com/npillmayer/uax@v0.2.0;downloadfilename=github-com-npillmayer-uax-0.2.0.zip;name=github-com-npillmayer-uax"
SRC_URI[github-com-npillmayer-uax.sha256sum] = "eb76926bb8ab9492415c6b71d517ce04f03f24ec164b1603ec6818cbe6a823bd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/npillmayer/uax/LICENSE;md5=5e97458ade886a0cf900dd8e53dbea42 \
"

GOSRC_INCLUDEGUARD += "github.com-npillmayer-uax-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cloudfoundry-jibber-jabber-sources.inc', '', 'github.com-cloudfoundry-jibber-jabber-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-emirpasic-gods-sources.inc', '', 'github.com-emirpasic-gods-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jolestar-go-commons-pool-sources.inc', '', 'github.com-jolestar-go-commons-pool-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-npillmayer-schuko-sources.inc', '', 'github.com-npillmayer-schuko-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
