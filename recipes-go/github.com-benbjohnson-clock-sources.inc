SRC_URI += "https://proxy.golang.org/github.com/benbjohnson/clock/@v/v1.3.1.zip;srcoutput=github.com/benbjohnson/clock;srcinput=github.com/benbjohnson/clock@v1.3.1;downloadfilename=github-com-benbjohnson-clock-1.3.1.zip;name=github-com-benbjohnson-clock"
SRC_URI[github-com-benbjohnson-clock.sha256sum] = "20b882283fcc4c9e6ff62a13da2487bf35931993688a5e05c4f3483cb632ddc7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/benbjohnson/clock/LICENSE;md5=b812f1e4ef9067011cad556daf595138 \
"

GOSRC_INCLUDEGUARD += "github.com-benbjohnson-clock-sources.inc"

