SRC_URI += "https://proxy.golang.org/github.com/coreos/go-semver/@v/v0.3.1.zip;srcoutput=github.com/coreos/go-semver;srcinput=github.com/coreos/go-semver@v0.3.1;downloadfilename=github-com-coreos-go-semver-0.3.1.zip;name=github-com-coreos-go-semver"
SRC_URI[github-com-coreos-go-semver.sha256sum] = "e72820542b5913afe0a52e956e0b3834e9fbb080641fed183117f862fab74e8a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/coreos/go-semver/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-coreos-go-semver-sources.inc"

