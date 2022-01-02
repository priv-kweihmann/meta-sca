SRC_URI += "git://github.com/Masterminds/semver;nobranch=1;protocol=https;srcinput=github.com/Masterminds/semver;srcoutput=github.com/Masterminds/semver;destsuffix=github.com/Masterminds/semver;name=github-com-masterminds-semver"
SRCREV_github-com-masterminds-semver = "805c489aa98f412e79eb308a37996bf9d8b1c91e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/semver/LICENSE.txt;md5=4c1ffeeb02e3f8f4af042205e189b3f7 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-semver-sources.inc"

