SUMMARY = "Splint - annotation-assisted static program checker"
HOMEPAGE = "https://github.com/splintchecker/splint"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b931e8e52482b68bdefacc87a3d98c10"

DEPENDS += "bison-native"

SRC_URI = "git://github.com/splintchecker/splint.git;protocol=https \
           file://0001-Strip-usr-include.patch \
           file://0001-bison-fix-deprecation-warnings.patch \
           file://splint.sca.description"

## This version is 3.12 plus some commit which addresses
## build issues
SRCREV = "a28a60fd537cb0271a43a54f1f09870e03c2ba1a"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit autotools
inherit native
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/splint.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
