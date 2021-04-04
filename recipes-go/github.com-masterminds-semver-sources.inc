SRC_URI += "https://github.com/Masterminds/semver/archive/refs/tags/v1.5.0.zip;srcoutput=github.com/Masterminds/semver;srcinput=semver-1.5.0;downloadfilename=github-com-masterminds-semver-1.5.0.zip;name=github-com-masterminds-semver"
SRC_URI[github-com-masterminds-semver.sha256sum] = "d411a891b8fa141d8f632eb9b7efd48dcea37bd63c39b085844c817849e7fda4"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/semver/LICENSE.txt;md5=4c1ffeeb02e3f8f4af042205e189b3f7 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-semver-sources.inc"

