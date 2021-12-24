SUMMARY = "PHP code metrics"
DESCRIPTION = "PHPMD can be seen as an user friendly frontend application for the raw metrics stream measured by PHP Depend"
HOMEPAGE = "https://github.com/phpmd/phpmd"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=102189a3104d17e4cdd01198fef36372"

SRC_URI = "git://github.com/phpmd/phpmd.git;branch=master;protocol=https \
           file://phpmd.sca.description"
SRCREV = "08b60a2eb7e14c23f46ff8865b510ae08b75d0fd"
PHPCOMPOSER_PKGS_NAME = "phpmd/phpmd:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpmd.sca.description ${D}${datadir}/
}

FILES:${PN} = "${bindir} ${datadir}"
