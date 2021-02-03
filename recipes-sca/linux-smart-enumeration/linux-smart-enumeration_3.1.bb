SUMMARY = "Linux enumeration tool for pentesting and CTFs with verbosity levels"
HOMEPAGE = "https://github.com/diego-treitos/linux-smart-enumeration"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/diego-treitos/linux-smart-enumeration.git;protocol=https \
           file://lse.sca.description"
SRCREV = "c721f31b74fabfb74bf7aace7655ffa72adc3ff7"

S = "${WORKDIR}/git"

inherit sca-description

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/lse.sh ${D}${bindir}/lse.sh
}

do_install_append_class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/lse.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir}"
FILES_${PN}_class-native += "${datadir}"

# We don't really care about debug package for this one
# also because of the issue mentioned below
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

BBCLASSEXTEND = "native"
