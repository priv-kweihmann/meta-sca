SUMMARY = "Phan is a static analyzer for PHP"

HOMEPAGE = "https://github.com/phan/phan"

SRC_URI = " git://github.com/phan/phan.git;protocol=https;tag=${PV} \
            file://phan.sca.description"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fbdcd3d0ec03d3c2e54b19846ad2b027"

S = "${WORKDIR}/git"

DEPENDS += "php-ast-native"
PHP_EXTENSION += "ast"
PHPCOMPOSER_PKGS_NAME = "phan/phan:${PV}"

inherit native
inherit phpcomposer
inherit php-ext
inherit sca-sanity

FILES_${PN} = "${bindir} ${datadir}"

do_compile_prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install_append() {
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/phan.sca.description ${D}${datadir}/
}

