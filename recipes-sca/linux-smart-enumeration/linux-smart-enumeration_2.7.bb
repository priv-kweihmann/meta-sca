SUMMARY = "Linux enumeration tool for pentesting and CTFs with verbosity levels"
HOMEPAGE = "https://github.com/diego-treitos/linux-smart-enumeration"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/diego-treitos/linux-smart-enumeration.git;protocol=https \
           file://lse.sca.description"
SRCREV = "145dc4fb4fe3cc54afba75db0c0ae01bb45c9aa1"

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
