SUMMARY = "Ultra-lightweight pure Python package to check if a file is binary or text"
HOMEPAGE = "https://github.com/audreyr/binaryornot"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=af7e06443f7547a320d0a05120f33bca"

DEPENDS += "python3-chardet-native"

PYPI_PACKAGE = "binaryornot"

SRC_URI[md5sum] = "a809b2e789aed22876a2bcc71f765713"
SRC_URI[sha256sum] = "cc8d57cfa71d74ff8c28a7726734d53a851d02fad9e3a5581fb807f989f702f0"

inherit pypi
inherit python_hatchling
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-chardet"
