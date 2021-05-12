SUMMARY = "PHP code metrics"
DESCRIPTION = "PHPMD can be seen as an user friendly frontend application for the raw metrics stream measured by PHP Depend"
HOMEPAGE = "https://github.com/phpmd/phpmd"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=102189a3104d17e4cdd01198fef36372"

SRC_URI = "git://github.com/phpmd/phpmd.git;protocol=https \
           file://phpmd.sca.description"
SRCREV = "bd5ef43d1dcaf7272605027c959c1c5ff3761f7a"
PHPCOMPOSER_PKGS_NAME = "phpmd/phpmd:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpmd.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
