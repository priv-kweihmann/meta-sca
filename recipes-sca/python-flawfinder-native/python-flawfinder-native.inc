SUMMARY = "a static analysis tool for finding vulnerabilities in C/C++ source code"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

FILES_${PN} = "${prefix}"
SRC_URI += "git://github.com/david-a-wheeler/flawfinder.git;protocol=https;tag=${PV} \
            file://flawfinder.sca.description"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

inherit native
inherit sca-sanity

do_install_prepend() {
    # Somehow there should have been a zipped version of the 
    # tools sources - but as we don't need them
    # we are going to ship an stub text file instead
    echo "Intentionally empty" > ${B}/flawfinder.1.gz
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flawfinder.sca.description ${D}${datadir}
}
