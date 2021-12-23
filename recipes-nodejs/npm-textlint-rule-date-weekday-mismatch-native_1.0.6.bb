SUMMARY = "NPM: textlint-rule-date-weekday-mismatch"
DESCRIPTION = "textlint rule that found mismatch between date and weekday."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-date-weekday-mismatch"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-chrono-node-native \
           npm-moment-native \
           npm-textlint-tester-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-date-weekday-mismatch/-/textlint-rule-date-weekday-mismatch-1.0.6.tgz"
SRC_URI[md5sum] = "46ea1e25dc628e7fdd79b329ac42fc23"
SRC_URI[sha256sum] = "1d8cbd269b9347b57051c43a73f605bf0aa7b7934c908b941573337d67bad1b6"

NPM_PKGNAME = "textlint-rule-date-weekday-mismatch"

inherit npmhelper
inherit native
