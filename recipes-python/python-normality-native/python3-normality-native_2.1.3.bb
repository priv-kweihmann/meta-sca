SUMMARY = "micro-package that contains a small set of text normalization"
HOMEPAGE = "http://github.com/pudo/normality"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac24567f92cb0c2380157fd45299ceb3"

DEPENDS += "\
            python3-banal-native \
            python3-chardet-native \
            python3-text-unidecode-native \
           "

PYPI_PACKAGE = "normality"

SRC_URI[md5sum] = "10b6dd5fb37b1918a237051f803044bf"
SRC_URI[sha256sum] = "58b89457fd38651868623b60c275cb7c3e06eb7867e37220bbc744bda71c6ea6"

inherit pypi
inherit setuptools3
inherit native
