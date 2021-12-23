SUMMARY = "NPM: @cspell/dict-vue"
DESCRIPTION = "CSpell configuration for VUE files."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/vue#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-vue/-/dict-vue-2.0.1.tgz"
SRC_URI[md5sum] = "41d8795f599f3f3618176470bc88d723"
SRC_URI[sha256sum] = "517f1ef3fb04ceedd00fb5fa5a79baf1c943fd13682fa3c425e37ecf2d9c0321"

NPM_PKGNAME = "@cspell/dict-vue"

inherit npmhelper
inherit native
