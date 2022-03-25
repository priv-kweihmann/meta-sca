SUMMARY = "PHP code metrics"
DESCRIPTION = "PHPMD can be seen as an user friendly frontend application for the raw metrics stream measured by PHP Depend"
HOMEPAGE = "https://github.com/phpmd/phpmd"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=102189a3104d17e4cdd01198fef36372"

SRC_URI = "git://github.com/phpmd/phpmd.git;branch=master;protocol=https"
SRCREV = "c0b678ba71902f539c27c14332aa0ddcf14388ec"
PHPCOMPOSER_PKGS_NAME = "phpmd/phpmd:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "phpmd"

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

FILES:${PN} = "${bindir}"
