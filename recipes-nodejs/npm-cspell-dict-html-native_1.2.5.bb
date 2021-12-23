SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/html#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.2.5.tgz"
SRC_URI[md5sum] = "3882d9501e444fc91f635dc4e65c250e"
SRC_URI[sha256sum] = "753614e9fa1c3f6290b9e88e3b479619bbe257ddbf198a88ad2c2f2841606a77"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
