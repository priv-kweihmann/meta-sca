SRC_URI += "https://proxy.golang.org/github.com/alecthomas/units/@v/v0.0.0-20210927113745-59d0afb8317a.zip;srcoutput=github.com/alecthomas/units;srcinput=github.com/alecthomas/units@v0.0.0-20210927113745-59d0afb8317a;downloadfilename=github-com-alecthomas-units-0.0.0-20210927113745-59d0afb8317a.zip;name=github-com-alecthomas-units"
SRC_URI[github-com-alecthomas-units.sha256sum] = "71ef317174b820e38af120856c33136602f4ed54a46cbe5f8d0353bd2072515b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alecthomas/units/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"

GOSRC_INCLUDEGUARD += "github.com-alecthomas-units-sources.inc"

