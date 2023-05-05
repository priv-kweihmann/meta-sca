SRC_URI += "https://proxy.golang.org/github.com/benbjohnson/clock/@v/v1.3.3.zip;srcoutput=github.com/benbjohnson/clock;srcinput=github.com/benbjohnson/clock@v1.3.3;downloadfilename=github-com-benbjohnson-clock-1.3.3.zip;name=github-com-benbjohnson-clock"
SRC_URI[github-com-benbjohnson-clock.sha256sum] = "390dc61870391f92c69da75a603208305e7675315136582455ca59186edbfa54"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/benbjohnson/clock/LICENSE;md5=b812f1e4ef9067011cad556daf595138 \
"

GOSRC_INCLUDEGUARD += "github.com-benbjohnson-clock-sources.inc"

