SUMMARY = "PHPMD can be seen as an user friendly frontend application for the raw metrics stream measured by PHP Depend"

HOMEPAGE = "https://github.com/phpmd/phpmd"

SRC_URI = " git://github.com/phpmd/phpmd.git;protocol=https;nobranch=1;tag=${PV} \
            file://phpmd.sca.description"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=102189a3104d17e4cdd01198fef36372"

S = "${WORKDIR}/git"

PHPCOMPOSER_PKGS_NAME = "phpmd/phpmd:${PV}"

inherit native
inherit phpcomposer
inherit sca-sanity

FILES_${PN} = "${bindir} ${datadir}"

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/phpmd.sca.description ${D}${datadir}/
}

