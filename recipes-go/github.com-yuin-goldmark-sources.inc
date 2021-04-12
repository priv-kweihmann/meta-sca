SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.4.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.4;downloadfilename=github-com-yuin-goldmark-1.3.4.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "23fd4c7514d78e4ca1231fbb2f064977a57d664aecc261c857dc46316cd8b778"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

