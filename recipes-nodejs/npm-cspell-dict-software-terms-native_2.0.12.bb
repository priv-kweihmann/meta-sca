SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.12.tgz"
SRC_URI[md5sum] = "699f2bd93b47980c4ea49fc4515bf5f5"
SRC_URI[sha256sum] = "2d1fae5afa47d536869460ed4a04fdc1fb082d9e74cb102af15c2234a80df23a"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
