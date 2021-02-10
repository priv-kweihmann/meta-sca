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

SRC_URI_append = " file://0001-setup.py-remove-chardet-version-limitation.patch"

SRC_URI[md5sum] = "06e89ee95281c712d4d796983be17020"
SRC_URI[sha256sum] = "b353e1d826d0be80a7268762efd99ba05f9d1df1aef0553fb7ea17c670bee85c"

inherit pypi
inherit setuptools3
inherit native
