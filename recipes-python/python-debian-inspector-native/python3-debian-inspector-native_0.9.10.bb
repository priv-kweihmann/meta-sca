SUMMARY = "Utilities to parse Debian package, copyright and control files"
HOMEPAGE = "https://github.com/nexB/debian-inspector"

LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://bsd-new.LICENSE;md5=7bdbf9caf4687a7e5803382ed7f2dcf6 \
    file://mit.LICENSE;md5=8d18be6409468bae48b33b87db85824a \
"

DEPENDS += "\
            python3-attrs-native \
            python3-chardet-native \
           "

PYPI_PACKAGE = "debian_inspector"

SRC_URI[md5sum] = "1e836df561b49c233912baadd4688445"
SRC_URI[sha256sum] = "fd29a02b925a4de0d7bb00c29bb05f19715a304bc10ef7b9ad06a93893dc3a8c"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_URI = "https://pypi.org/project/debian-inspector/"
UPSTREAM_CHECK_REGEX = "/debian-inspector/(?P<pver>(\d+[\.\-_]*)+)/"
