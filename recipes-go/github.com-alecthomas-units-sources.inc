SRC_URI += "https://proxy.golang.org/github.com/alecthomas/units/@v/v0.0.0-20211218093645-b94a6e3cc137.zip;srcoutput=github.com/alecthomas/units;srcinput=github.com/alecthomas/units@v0.0.0-20211218093645-b94a6e3cc137;downloadfilename=github-com-alecthomas-units-0.0.0-20211218093645-b94a6e3cc137.zip;name=github-com-alecthomas-units"
SRC_URI[github-com-alecthomas-units.sha256sum] = "b62437d74a523089af46ba0115ece1ce11bca5e321fe1e1d4c976ecca6ee78aa"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alecthomas/units/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"

GOSRC_INCLUDEGUARD += "github.com-alecthomas-units-sources.inc"

