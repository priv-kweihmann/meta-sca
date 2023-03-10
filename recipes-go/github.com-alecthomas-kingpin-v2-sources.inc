SRC_URI += "https://proxy.golang.org/github.com/alecthomas/kingpin/v2/@v/v2.3.2.zip;srcoutput=github.com/alecthomas/kingpin/v2;srcinput=github.com/alecthomas/kingpin/v2@v2.3.2;downloadfilename=github-com-alecthomas-kingpin-v2-2.3.2.zip;name=github-com-alecthomas-kingpin-v2"
SRC_URI[github-com-alecthomas-kingpin-v2.sha256sum] = "8f330f35ca429b669c397cf2e6b58b8cd6894fb6d6437f7099931d2d1400b909"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alecthomas/kingpin/v2/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"

GOSRC_INCLUDEGUARD += "github.com-alecthomas-kingpin-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-alecthomas-units-sources.inc', '', 'github.com-alecthomas-units-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xhit-go-str2duration-v2-sources.inc', '', 'github.com-xhit-go-str2duration-v2-sources.inc', d)}
