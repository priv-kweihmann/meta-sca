SRC_URI += "https://proxy.golang.org/github.com/golang/glog/@v/v1.1.1.zip;srcoutput=github.com/golang/glog;srcinput=github.com/golang/glog@v1.1.1;downloadfilename=github-com-golang-glog-1.1.1.zip;name=github-com-golang-glog"
SRC_URI[github-com-golang-glog.sha256sum] = "48caf8780b6ffe91e23622eb8f6eb9eb27d30e02ebfff64663b2f65d6ef58c55"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/glog/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-glog-sources.inc"

