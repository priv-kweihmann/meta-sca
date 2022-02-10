SUMMARY = "NPM: @cspell/dict-vue"
DESCRIPTION = "CSpell configuration for VUE files."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/vue#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-vue/-/dict-vue-2.0.2.tgz"
SRC_URI[md5sum] = "b147fd05e4d4e95605554b68548ae333"
SRC_URI[sha256sum] = "134b32130922c1f6c1186ea9c675f477c5b2c1c83c69beba8b5f8be1032747d6"

NPM_PKGNAME = "@cspell/dict-vue"

inherit npmhelper
inherit native
