SUMMARY = "NPM: @cspell/dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/html#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-html/-/dict-html-3.0.1.tgz"
SRC_URI[md5sum] = "3b8092bb6d2583e24073ba6591bb067f"
SRC_URI[sha256sum] = "4679ee6f3e17f86be91cf8216ee626e166b25bca3950fb80b12e7eafcd2f5fe9"

NPM_PKGNAME = "@cspell/dict-html"

inherit npmhelper
inherit native
