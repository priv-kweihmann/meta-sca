SUMMARY = "NPM: textlint-rule-write-good"
DESCRIPTION = "textlint rule to check your English style with write good"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-write-good"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ReadMe.md;beginline=59;md5=355b64b34f8b0e8810c4e72a77859cc2"

DEPENDS = "npm-textlint-rule-helper-native \
           npm-write-good-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-write-good/-/textlint-rule-write-good-2.0.0.tgz"
SRC_URI[md5sum] = "a4b5047fbcac501a79aaf52347a94cd1"
SRC_URI[sha256sum] = "aac60b0e34226c2ab7fb2a76dd35cce6ab9ad0c626abb8daf8960883823e1ad0"

NPM_PKGNAME = "textlint-rule-write-good"

inherit npmhelper
inherit native
