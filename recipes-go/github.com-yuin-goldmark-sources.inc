SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.13.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.13;downloadfilename=github-com-yuin-goldmark-1.7.13.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "88a6178916d7196838692fc41facc5429ab3bcc75d6270c180dfee36e14e6a94"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

