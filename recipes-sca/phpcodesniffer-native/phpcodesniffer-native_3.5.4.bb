SUMMARY = "PHP_CodeSniffer tokenizes PHP, JavaScript and CSS files and detects violations of a defined set of coding standards"

HOMEPAGE = "https://github.com/squizlabs/PHP_CodeSniffer"

SRC_URI = " git://github.com/squizlabs/PHP_CodeSniffer.git;protocol=https;nobranch=1;tag=${PV} \
            file://phpcodesniffer.sca.description"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://licence.txt;md5=562f463f305c4d32b4fad9a4b03ad678"

S = "${WORKDIR}/git"

PHPCOMPOSER_PKGS_NAME = "squizlabs/php_codesniffer=${PV}"

inherit native
inherit phpcomposer
inherit sca-sanity

FILES_${PN} = "${bindir} ${datadir}"

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/phpcodesniffer.sca.description ${D}${datadir}/
}

