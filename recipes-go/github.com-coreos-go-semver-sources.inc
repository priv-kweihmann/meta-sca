SRC_URI += "https://proxy.golang.org/github.com/coreos/go-semver/@v/v0.3.0.zip;srcoutput=github.com/coreos/go-semver;srcinput=github.com/coreos/go-semver@v0.3.0;downloadfilename=github-com-coreos-go-semver-0.3.0.zip;name=github-com-coreos-go-semver"
SRC_URI[github-com-coreos-go-semver.sha256sum] = "b2fc075395ffc34cff4b964681d0ae3cd22096cfcadd2970eeaa877596ceb210"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/coreos/go-semver/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-coreos-go-semver-sources.inc"

