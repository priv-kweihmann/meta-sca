SRC_URI += "git://github.com/Masterminds/semver;nobranch=1;protocol=https;srcinput=github.com/Masterminds/semver;srcoutput=github.com/Masterminds/semver/v3;destsuffix=github.com/Masterminds/semver;name=github-com-masterminds-semver-v3"
SRCREV_github-com-masterminds-semver-v3 = "7bb0c843b53d6ad21a3f619cb22c4b442bb3ef3e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/semver/v3/LICENSE.txt;md5=4c1ffeeb02e3f8f4af042205e189b3f7 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-semver-v3-sources.inc"

