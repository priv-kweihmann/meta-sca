SUMMARY = "NPM: @cspell/dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-python/-/dict-python-2.0.3.tgz"
SRC_URI[md5sum] = "0c16329d9ca6ec120a7fd415226bbd0b"
SRC_URI[sha256sum] = "035ce4451e820dc2da3e81ae4ca057f8de9c09777dfcc55fce3d795aa8d4d019"

NPM_PKGNAME = "@cspell/dict-python"

inherit npmhelper
inherit native
