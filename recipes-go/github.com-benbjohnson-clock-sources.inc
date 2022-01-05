SRC_URI += "https://proxy.golang.org/github.com/benbjohnson/clock/@v/v1.3.0.zip;srcoutput=github.com/benbjohnson/clock;srcinput=github.com/benbjohnson/clock@v1.3.0;downloadfilename=github-com-benbjohnson-clock-1.3.0.zip;name=github-com-benbjohnson-clock"
SRC_URI[github-com-benbjohnson-clock.sha256sum] = "b710f0d542532ecb521fcaeda6c09977dced8722b05956fecccc97464d3dcee8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/benbjohnson/clock/LICENSE;md5=b812f1e4ef9067011cad556daf595138 \
"

GOSRC_INCLUDEGUARD += "github.com-benbjohnson-clock-sources.inc"

