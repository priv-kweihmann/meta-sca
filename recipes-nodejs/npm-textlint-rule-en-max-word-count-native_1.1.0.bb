SUMMARY = "NPM: textlint-rule-en-max-word-count"
DESCRIPTION = "textlint rule that specify the maximum word count of a sentence."
HOMEPAGE = "https://github.com/azu/textlint-rule-en-max-word-count"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-object-assign-native \
           npm-sentence-splitter-native \
           npm-textlint-util-to-string-native \
           npm-unist-util-map-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-en-max-word-count/-/textlint-rule-en-max-word-count-1.1.0.tgz"
SRC_URI[md5sum] = "44406ddb6229e291fd57fa7dae9d5893"
SRC_URI[sha256sum] = "3ed7eede1c993c01787611826aaf58605778b8c73c68952ad36f66fc5de8f611"

NPM_PKGNAME = "textlint-rule-en-max-word-count"

inherit npmhelper
inherit native
