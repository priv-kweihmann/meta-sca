SUMMARY = "Phan is a static analyzer for PHP"
HOMEPAGE = "https://github.com/phan/phan"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fbdcd3d0ec03d3c2e54b19846ad2b027"

DEPENDS += "php-ast-native"

SRC_URI = "git://github.com/phan/phan.git;protocol=https;branch=v5"
SRCREV = "777fb4781068af411ce153bd839d8856149fa4b7"
PHP_EXTENSION += "ast"
PHPCOMPOSER_PKGS_NAME = "phan/phan:${PV}"

S = "${WORKDIR}/git"

inherit phpcomposer
inherit php-ext
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "phan"

do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}

FILES:${PN} = "${bindir}"
