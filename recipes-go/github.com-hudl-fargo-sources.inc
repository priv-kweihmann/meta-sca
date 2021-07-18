SRC_URI += "https://proxy.golang.org/github.com/hudl/fargo/@v/v1.4.0.zip;srcoutput=github.com/hudl/fargo;srcinput=github.com/hudl/fargo@v1.4.0;downloadfilename=github-com-hudl-fargo-1.4.0.zip;name=github-com-hudl-fargo"
SRC_URI[github-com-hudl-fargo.sha256sum] = "fa1ad4e9957f49e5896a51baa29365c9e144de14ec4d584d460b3022741b1dfe"
GOSRC_REMOVEDIRS += "github.com/hudl/fargo/tests"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hudl/fargo/LICENSE;md5=2bab2691dae04185fedadccb181f63dc \
"

GOSRC_INCLUDEGUARD += "github.com-hudl-fargo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cenkalti-backoff-v4-sources.inc', '', 'github.com-cenkalti-backoff-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-clbanning-mxj-sources.inc', '', 'github.com-clbanning-mxj-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-franela-goreq-sources.inc', '', 'github.com-franela-goreq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-miekg-dns-sources.inc', '', 'github.com-miekg-dns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-op-go-logging-sources.inc', '', 'github.com-op-go-logging-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-gcfg.v1-sources.inc', '', 'gopkg.in-gcfg.v1-sources.inc', d)}
