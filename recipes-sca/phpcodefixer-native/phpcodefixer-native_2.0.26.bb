SUMMARY = "PHP code analyzer"
DESCRIPTION = "Analyzer of PHP code to search issues with deprecated functionality in newer interpreter versions"
HOMEPAGE = "https://github.com/wapmorgan/PhpCodeFixer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c98596cdc7ad2b3b9a3a84255a83cb9f"

SRC_URI = "git://github.com/wapmorgan/PhpCodeFixer.git;branch=master;protocol=https \
           file://phpcodefixer.sca.description"
SRCREV = "7120d33f0ffe7a4bb140aaf454b6b4b9c1dddc98"
PHPCOMPOSER_PKGS_NAME = "wapmorgan/php-code-fixer:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit sca-description
inherit native

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpcodefixer.sca.description ${D}${datadir}/
}

FILES:${PN} = "${bindir} ${datadir}"
