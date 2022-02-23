SUMMARY = "NPM: @cspell/dict-lorem-ipsum"
DESCRIPTION = "Lorem-ipsum dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/lorem-ipsum#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-lorem-ipsum/-/dict-lorem-ipsum-2.0.0.tgz"
SRC_URI[md5sum] = "209708377dde3b700f913792bb80b3a2"
SRC_URI[sha256sum] = "4fb27abede8132bd4c1988e1f9fa7b7227bf34bfb2ad8448db646c738a6ea08a"

NPM_PKGNAME = "@cspell/dict-lorem-ipsum"

inherit npmhelper
inherit native
