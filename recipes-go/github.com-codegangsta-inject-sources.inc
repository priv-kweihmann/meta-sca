SRC_URI += "https://proxy.golang.org/github.com/codegangsta/inject/@v/v0.0.0-20150114235600-33e0aa1cb7c0.zip;srcoutput=github.com/codegangsta/inject;srcinput=github.com/codegangsta/inject@v0.0.0-20150114235600-33e0aa1cb7c0;downloadfilename=github-com-codegangsta-inject-0.0.0-20150114235600-33e0aa1cb7c0.zip;name=github-com-codegangsta-inject"
SRC_URI[github-com-codegangsta-inject.sha256sum] = "0a324d56992bffd288fa70a6d10eb9b8a9467665b0b1eb749ac6ae80e8977ee2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/codegangsta/inject/LICENSE;md5=a0cc7235249ae603a14e7092ceb784b0 \
"

GOSRC_INCLUDEGUARD += "github.com-codegangsta-inject-sources.inc"

