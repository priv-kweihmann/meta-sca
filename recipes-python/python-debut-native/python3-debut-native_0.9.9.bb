SUMMARY = "collection of utilities to parse various Debian package manifests"
HOMEPAGE = "https://github.com/nexB/debut"

LICENSE = "MIT & Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
                    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://bsd-new.LICENSE;md5=7bdbf9caf4687a7e5803382ed7f2dcf6 \
                    file://mit.LICENSE;md5=8d18be6409468bae48b33b87db85824a \
                   "

DEPENDS += "\
            python3-attrs-native \
            python3-chardet-native \
           "

PYPI_PACKAGE = "debut"

SRC_URI[md5sum] = "c0d5fb172c3b7052c53161ae4b756560"
SRC_URI[sha256sum] = "a3a71e475295f4cf4292440c9c7303ebca0309d395536d2a7f86a5f4d7465dc1"

inherit pypi
inherit setuptools3
inherit native
