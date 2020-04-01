SUMMARY = "PHP code analyzer"
DESCRIPTION = "Analyzer of PHP code to search issues with deprecated functionality in newer interpreter versions"
HOMEPAGE = "https://github.com/wapmorgan/PhpCodeFixer"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c98596cdc7ad2b3b9a3a84255a83cb9f"

SRC_URI = "git://github.com/wapmorgan/PhpCodeFixer.git;protocol=https;tag=${PV} \
           file://phpcodefixer.sca.description"

PHPCOMPOSER_PKGS_NAME = "wapmorgan/php-code-fixer:${PV}"

S = "${WORKDIR}/git"

inherit native
inherit phpcomposer
inherit sca-sanity

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpcodefixer.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
