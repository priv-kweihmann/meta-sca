SRC_URI += "https://proxy.golang.org/github.com/golang/glog/@v/v0.0.0-20210429001901-424d2337a529.zip;srcoutput=github.com/golang/glog;srcinput=github.com/golang/glog@v0.0.0-20210429001901-424d2337a529;downloadfilename=github-com-golang-glog-0.0.0-20210429001901-424d2337a529.zip;name=github-com-golang-glog"
SRC_URI[github-com-golang-glog.sha256sum] = "677f7912d32cb417cfb59cbab9b9e924224a53679aa384b0526df2eda96d8775"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/glog/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-glog-sources.inc"

