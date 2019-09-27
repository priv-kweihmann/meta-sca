SUMMARY = "a static analysis tool for finding vulnerabilities in C/C++ source code"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

FILES_${PN} = "${prefix}"
SRC_URI += "git://github.com/david-a-wheeler/flawfinder.git;protocol=https;tag=${PV} \
            file://flawfinder.sca.description \
            file://flawfinder.sca.score"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

inherit native

do_install() {
    oe_runmake install DESTDIR=${D} prefix=${prefix} mandir=${mandir} bindir=${bindir} datarootdir=${datadir}
    install -d ${D}${datadir}
    install ${WORKDIR}/flawfinder.sca.description ${D}${datadir}
    install ${WORKDIR}/flawfinder.sca.score ${D}${datadir}
}

do_compile() {
    :
}

do_configure() {
    :
}