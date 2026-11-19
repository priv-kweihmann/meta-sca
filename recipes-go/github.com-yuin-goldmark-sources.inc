SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.8.7.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.8.7;downloadfilename=github-com-yuin-goldmark-1.8.7.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "6f535e479535715264fa2032f70667aeae07420ab835956925b2ec59e0fc7b3f"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

