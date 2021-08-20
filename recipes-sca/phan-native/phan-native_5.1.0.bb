SUMMARY = "Phan is a static analyzer for PHP"
HOMEPAGE = "https://github.com/phan/phan"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fbdcd3d0ec03d3c2e54b19846ad2b027"

DEPENDS += "php-ast-native"

SRC_URI = "git://github.com/phan/phan.git;protocol=https;branch=v5 \
           file://phan.sca.description"
SRCREV = "561be81e281acbba75780c4f5392d56dfa5028ab"
PHP_EXTENSION += "ast"
PHPCOMPOSER_PKGS_NAME = "phan/phan:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit php-ext
inherit sca-description
inherit native

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/phan.sca.description ${D}${datadir}/
}

FILES:${PN} = "${bindir} ${datadir}"
