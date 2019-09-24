SUMMARY = "Tool for checking elf-symbols against rules"
HOMEPAGE = "https://github.com/priv-kweihmann/pysymbolcheck"

SRC_URI = "git://github.com/priv-kweihmann/pysymbolcheck.git;protocol=http;branch=master;tag=${PV} \
           file://pysymcheck.sca.description \
           file://pysymcheck.sca.score"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

RDEPENDS_${PN} += "${PYTHON_PN}-core-native ${PYTHON_PN}-jsonmerge-native \
                   ${PYTHON_PN}-pyelftools-native ${PYTHON_PN}-ctypes-native"
FILES_${PN} = "${bindir} ${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    mkdir -p ${D}${bindir}/pysymbolcheck
    cp -R ${B}/* ${D}${bindir}/pysymbolcheck

    install -d ${D}${datadir}
    install ${WORKDIR}/pysymcheck.sca.description ${D}${datadir}
    install ${WORKDIR}/pysymcheck.sca.score ${D}${datadir}
}
