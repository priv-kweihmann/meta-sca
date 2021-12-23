SUMMARY = "a static analysis tool for finding vulnerabilities in C/C++ source code"
HOMEPAGE = "https://github.com/david-a-wheeler/flawfinder"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

DEPENDS += "python3-native"

SRC_URI += "git://github.com/david-a-wheeler/flawfinder.git;branch=master;protocol=https \
            file://flawfinder.sca.description"
SRCREV = "51c988dc47885f525022b4d393ff4479024499f7"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install:prepend() {
    # Remove the data_files section from setup, as
    # it isn't really needed
    sed -i "/data_files/d" ${S}/setup.py
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flawfinder.sca.description ${D}${datadir}
}

FILES:${PN} += "${prefix}"
