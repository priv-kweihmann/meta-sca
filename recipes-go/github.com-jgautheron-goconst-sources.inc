SRC_URI += "https://proxy.golang.org/github.com/jgautheron/goconst/@v/v1.5.1.zip;srcoutput=github.com/jgautheron/goconst;srcinput=github.com/jgautheron/goconst@v1.5.1;downloadfilename=github-com-jgautheron-goconst-1.5.1.zip;name=github-com-jgautheron-goconst"
SRC_URI[github-com-jgautheron-goconst.sha256sum] = "4876028bfb5f28c607984ac39c4f293f94156ce71fa4ec0e8f7a88d326a80ff3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jgautheron/goconst/LICENSE;md5=33b2be59a3a3c31e4b98ba1acce08fcb \
"

GOSRC_INCLUDEGUARD += "github.com-jgautheron-goconst-sources.inc"

