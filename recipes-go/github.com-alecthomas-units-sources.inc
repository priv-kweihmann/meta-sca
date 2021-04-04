SRC_URI += "https://proxy.golang.org/github.com/alecthomas/units/@v/v0.0.0-20210208195552-ff826a37aa15.zip;srcoutput=github.com/alecthomas/units;srcinput=github.com/alecthomas/units@v0.0.0-20210208195552-ff826a37aa15;downloadfilename=github-com-alecthomas-units-0.0.0-20210208195552-ff826a37aa15.zip;name=github-com-alecthomas-units"
SRC_URI[github-com-alecthomas-units.sha256sum] = "461b05eb19b6023664d6502cb4fbf093a99a9ee2a36c43b4da5ca1287c495ff7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alecthomas/units/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"

GOSRC_INCLUDEGUARD += "github.com-alecthomas-units-sources.inc"

