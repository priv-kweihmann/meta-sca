SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=617badd258799ff9d7a429db4837c680"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "e328272bc82ddc3170316250e37027ad"
SRC_URI[sha256sum] = "a5d6e8305c6b210849b47a6174ddf9c452b2888340b8177874b862ba6c207645"

inherit pypi
inherit setuptools3
inherit native
