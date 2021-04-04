SRC_URI += "https://github.com/Masterminds/semver/archive/refs/tags/v3.1.1.zip;srcoutput=github.com/Masterminds/semver/v3;srcinput=semver-3.1.1;downloadfilename=github-com-masterminds-semver-v3-3.1.1.zip;name=github-com-masterminds-semver-v3"
SRC_URI[github-com-masterminds-semver-v3.sha256sum] = "b17ce81f8bcbf8677e65cbbd83c42ec3b4331383c9617736c912034af4ee4a94"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/semver/v3/LICENSE.txt;md5=4c1ffeeb02e3f8f4af042205e189b3f7 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-semver-v3-sources.inc"

