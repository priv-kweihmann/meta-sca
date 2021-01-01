SUMMARY = "Phan is a static analyzer for PHP"
HOMEPAGE = "https://github.com/phan/phan"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fbdcd3d0ec03d3c2e54b19846ad2b027"

DEPENDS += "php-ast-native"

SRC_URI = "git://github.com/phan/phan.git;protocol=https;branch=v4 \
           file://phan.sca.description"
SRCREV = "6f7acd037847d390175e73d71b14f38da037965f"
PHP_EXTENSION += "ast"
PHPCOMPOSER_PKGS_NAME = "phan/phan:${PV}"

S = "${WORKDIR}/git"

inherit native
inherit phpcomposer
inherit php-ext
inherit sca-description

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phan.sca.description ${D}${datadir}/
}

FILES_${PN} = "${bindir} ${datadir}"
