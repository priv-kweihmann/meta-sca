SUMMARY = "a static analysis tool for finding vulnerabilities in C/C++ source code"
HOMEPAGE = "https://github.com/david-a-wheeler/flawfinder"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

DEPENDS += "python3-native"

SRC_URI += "git://github.com/david-a-wheeler/flawfinder.git;protocol=https \
            file://flawfinder.sca.description"
SRCREV = "0cba711317ff8029addf7d3aba377432b5e31faa"
S = "${WORKDIR}/git"

inherit native
inherit sca-description
inherit setuptools3

do_install_prepend() {
    # Remove the data_files section from setup, as
    # it isn't really needed
    sed -i "/data_files/d" ${S}/setup.py
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flawfinder.sca.description ${D}${datadir}
}

FILES_${PN} += "${prefix}"
