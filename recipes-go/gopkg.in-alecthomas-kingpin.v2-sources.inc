SRC_URI += "https://proxy.golang.org/gopkg.in/alecthomas/kingpin.v2/@v/v2.2.6.zip;srcoutput=gopkg.in/alecthomas/kingpin.v2;srcinput=gopkg.in/alecthomas/kingpin.v2@v2.2.6;downloadfilename=gopkg-in-alecthomas-kingpin-v2-2.2.6.zip;name=gopkg-in-alecthomas-kingpin-v2"
SRC_URI[gopkg-in-alecthomas-kingpin-v2.sha256sum] = "638080591aefe7d2642f2575b627d534c692606f02ea54ba89f42db112ba8839"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/alecthomas/kingpin.v2/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"

GOSRC_INCLUDEGUARD += "gopkg.in-alecthomas-kingpin.v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-alecthomas-template-sources.inc', '', 'github.com-alecthomas-template-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-alecthomas-units-sources.inc', '', 'github.com-alecthomas-units-sources.inc', d)}
