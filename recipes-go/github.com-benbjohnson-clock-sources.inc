SRC_URI += "https://proxy.golang.org/github.com/benbjohnson/clock/@v/v1.3.5.zip;srcoutput=github.com/benbjohnson/clock;srcinput=github.com/benbjohnson/clock@v1.3.5;downloadfilename=github-com-benbjohnson-clock-1.3.5.zip;name=github-com-benbjohnson-clock"
SRC_URI[github-com-benbjohnson-clock.sha256sum] = "b615224e45f86907cfb0acc2b198dacea85ced624ed6c497ca2e7e705a53f2f9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/benbjohnson/clock/LICENSE;md5=b812f1e4ef9067011cad556daf595138 \
"

GOSRC_INCLUDEGUARD += "github.com-benbjohnson-clock-sources.inc"

