SUMMARY = "NPM: textlint-rule-write-good"
DESCRIPTION = "textlint rule to check your English style with write good"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-write-good"

DEPENDS = "npm-textlint-rule-helper-native npm-write-good-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ReadMe.md;beginline=59;md5=355b64b34f8b0e8810c4e72a77859cc2"

SRC_URI = "https://registry.npmjs.org/textlint-rule-write-good/-/textlint-rule-write-good-1.6.2.tgz"
SRC_URI[md5sum] = "a638790c48d94c51c7913ed914e0ec74"
SRC_URI[sha256sum] = "898faf1f76a641392bf874d573dd291d346966338fdb77b419f6e52e44285e5f"

NPM_PKGNAME = "textlint-rule-write-good"

inherit npmhelper
inherit native
