SUMMARY = "NPM: textlint-rule-max-comma"
DESCRIPTION = "textlint rule that limit maxinum comma(,) count of sentence."
HOMEPAGE = "https://github.com/azu/textlint-rule-max-comma#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-sentence-splitter-native \
           npm-textlint-util-to-string-native \
           npm-unist-util-filter-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-max-comma/-/textlint-rule-max-comma-2.0.2.tgz"
SRC_URI[md5sum] = "f86c1cd0b5d4b68436df0808ce1223d4"
SRC_URI[sha256sum] = "dbca3d6abb91b5b773c624f14021cc4b6ef1bdce5bbc564e1f2c43fd9a91f72d"

NPM_PKGNAME = "textlint-rule-max-comma"

inherit npmhelper
inherit native
