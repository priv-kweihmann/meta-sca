SUMMARY = "NPM: @cspell/dict-ada"
DESCRIPTION = "Ada Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/dictionaries/ada#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-ada/-/dict-ada-1.1.1.tgz"
SRC_URI[md5sum] = "62f74b53b5f5be5fe0935398ad4496af"
SRC_URI[sha256sum] = "4529183df5d134d269dfb2cdfaa7a1eefe3d24ae180a9e235f26c666df6690a8"

NPM_PKGNAME = "@cspell/dict-ada"

inherit npmhelper
inherit native
