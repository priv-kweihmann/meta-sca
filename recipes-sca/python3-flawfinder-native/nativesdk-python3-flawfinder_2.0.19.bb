SUMMARY = "a static analysis tool for finding vulnerabilities in C/C++ source code"
HOMEPAGE = "https://github.com/david-a-wheeler/flawfinder"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

DEPENDS += "nativesdk-python3"

SRC_URI += "git://github.com/david-a-wheeler/flawfinder.git;nobranch=1;protocol=https"
SRCREV = "c57197cd6061453f10a496f30a732bc1905918d1"

inherit sca-description
inherit setuptools3
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "flawfinder"
PIP_INSTALL_PACKAGE = "flawfinder"
do_configure:prepend() {
    # Remove the data_files section from setup, as
    # it isn't really needed
    sed -i "/data_files/d" ${S}/setup.py
}
FILES:${PN} += "${prefix}"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-json \
    nativesdk-python3-pickle \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
"
