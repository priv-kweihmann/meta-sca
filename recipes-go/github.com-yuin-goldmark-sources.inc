SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.12.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.12;downloadfilename=github-com-yuin-goldmark-1.4.12.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "116721e67a48174d6e1c02439de40328b544d4b2dd43afe9b62b63f63116c339"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

