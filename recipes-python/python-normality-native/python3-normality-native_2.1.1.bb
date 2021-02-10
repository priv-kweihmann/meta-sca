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

SRC_URI[md5sum] = "702461c74714ebf195e64df614c0f6ad"
SRC_URI[sha256sum] = "2c7cdb95737113d8f27ba287575945d6603ee3df4e847691839a71a53e1d1a95"

inherit pypi
inherit setuptools3
inherit native
