SUMMARY = "Tool for checking elf-symbols against rules"
HOMEPAGE = "https://github.com/priv-kweihmann/pysymbolcheck"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

DEPENDS += "\
            ${PYTHON_PN}-jsonmerge-native \
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pyelftools-native \
            "

SRC_URI = "git://github.com/priv-kweihmann/pysymbolcheck.git;protocol=https;branch=master;tag=${PV} \
           file://pysymcheck.sca.description"

S = "${WORKDIR}/git"

inherit native
inherit sca-sanity
inherit python3-dir

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}/pysymbolcheck
    cp -R ${B}/* ${D}${bindir}/pysymbolcheck

    install -d ${D}${datadir}
    install ${WORKDIR}/pysymcheck.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir} ${datadir}"
