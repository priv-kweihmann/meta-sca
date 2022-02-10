SUMMARY = "NPM: @cspell/dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/html#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-html/-/dict-html-3.0.0.tgz"
SRC_URI[md5sum] = "c6a9813d6f4a99f35494b3b1da686e90"
SRC_URI[sha256sum] = "ecfea60ddde92edee54d594d719ac20999fad1eab0320777ff1ab94da017210c"

NPM_PKGNAME = "@cspell/dict-html"

inherit npmhelper
inherit native
