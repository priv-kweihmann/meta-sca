SUMMARY = "PHP static code analyzer"
DESCRIPTION = "PHP_CodeSniffer tokenizes PHP, JavaScript and CSS files and detects violations of a defined set of coding standards"
HOMEPAGE = "https://github.com/squizlabs/PHP_CodeSniffer"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://licence.txt;md5=562f463f305c4d32b4fad9a4b03ad678"

SRC_URI = "git://github.com/squizlabs/PHP_CodeSniffer.git;protocol=https \
           file://phpcodesniffer.sca.description"
SRCREV = "e97627871a7eab2f70e59166072a6b767d5834e0"
PHPCOMPOSER_PKGS_NAME = "squizlabs/php_codesniffer=${PV}"

S = "${WORKDIR}/git"

inherit native
inherit phpcomposer
inherit sca-description

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phpcodesniffer.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
