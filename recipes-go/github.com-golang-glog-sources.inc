SRC_URI += "https://proxy.golang.org/github.com/golang/glog/@v/v1.1.0.zip;srcoutput=github.com/golang/glog;srcinput=github.com/golang/glog@v1.1.0;downloadfilename=github-com-golang-glog-1.1.0.zip;name=github-com-golang-glog"
SRC_URI[github-com-golang-glog.sha256sum] = "668beb5dd923378b00fda4ba0d965000f3f259be5ba05ebd341a2949e8f20db6"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/glog/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-glog-sources.inc"

