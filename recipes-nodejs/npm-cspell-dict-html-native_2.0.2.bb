SUMMARY = "NPM: @cspell/dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/html#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-html/-/dict-html-2.0.2.tgz"
SRC_URI[md5sum] = "65fae6cd2b8868e060b7469075651376"
SRC_URI[sha256sum] = "b259385607ffc5b79778070ad4c5398020aaee9d51951cebbd5e4c4498ae57a2"

NPM_PKGNAME = "@cspell/dict-html"

inherit npmhelper
inherit native
