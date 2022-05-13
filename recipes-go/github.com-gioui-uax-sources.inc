SRC_URI += "https://proxy.golang.org/github.com/gioui/uax/@v/v0.2.0.zip;srcoutput=github.com/gioui/uax;srcinput=github.com/gioui/uax@v0.2.0;downloadfilename=github-com-gioui-uax-0.2.0.zip;name=github-com-gioui-uax"
SRC_URI[github-com-gioui-uax.sha256sum] = "31c08654126f4734fbb9789a3b0edadf19031cfdfec3b965b88e1f1109fa1176"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gioui/uax/LICENSE;md5=5e97458ade886a0cf900dd8e53dbea42 \
"

GOSRC_INCLUDEGUARD += "github.com-gioui-uax-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cloudfoundry-jibber-jabber-sources.inc', '', 'github.com-cloudfoundry-jibber-jabber-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-emirpasic-gods-sources.inc', '', 'github.com-emirpasic-gods-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jolestar-go-commons-pool-sources.inc', '', 'github.com-jolestar-go-commons-pool-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-npillmayer-schuko-sources.inc', '', 'github.com-npillmayer-schuko-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-npillmayer-uax-sources.inc', '', 'github.com-npillmayer-uax-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
