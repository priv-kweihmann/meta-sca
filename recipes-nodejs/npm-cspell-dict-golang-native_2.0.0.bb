SUMMARY = "NPM: @cspell/dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/golang#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-golang/-/dict-golang-2.0.0.tgz"
SRC_URI[md5sum] = "01b6b3d8801f02ecbf946c8a444b43a4"
SRC_URI[sha256sum] = "9f6a19e4973287ceffa76be927371c32d5b7ac878923e0dd8f1ee8973067489d"

NPM_PKGNAME = "@cspell/dict-golang"

inherit npmhelper
inherit native
