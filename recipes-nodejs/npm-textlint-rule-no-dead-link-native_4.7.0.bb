SUMMARY = "NPM: textlint-rule-no-dead-link"
DESCRIPTION = "A textlint rule to check if all links are alive"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-dead-link"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ReadMe.md;beginline=165;md5=355b64b34f8b0e8810c4e72a77859cc2"

DEPENDS = "npm-fs-extra-native \
           npm-get-url-origin-native \
           npm-minimatch-native \
           npm-node-fetch-native \
           npm-p-memoize-native \
           npm-p-queue-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-dead-link/-/textlint-rule-no-dead-link-4.7.0.tgz"
SRC_URI[md5sum] = "5f02ecbf80a260f9e1e3c6563e68f81f"
SRC_URI[sha256sum] = "00d876b33717f49e25be9de264b29910772712921a9b7d74e8eb5192bc7b5f11"

NPM_PKGNAME = "textlint-rule-no-dead-link"

inherit npmhelper
inherit native
