SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

SRC_URI = "https://github.com/composer/getcomposer.org/archive/${SRCREV}.zip;protocol=https;downloadname=composer-${PV}.zip"
SRC_URI[sha256sum] = "e6cad190dc921977b8334b31287946773b516caa96e3d758070259f12d1b397b"

SRCREV = "a5874d7ceecca18772d44ed19e7da5fd267ba0a4"

UPSTREAM_CHECK_URI = "https://github.com/composer/composer/tags"
UPSTREAM_CHECK_REGEX ?= "/composer/composer/releases/tag/(?P<pver>(\d+[\.\-_]*)+)"
S = "${WORKDIR}/getcomposer.org-${SRCREV}"

inherit native

do_install() {
    export COMPOSER_HOME=${D}${datadir}/composer
    install -d ${D}${bindir}
    php ${S}/web/installer --version=${PV} --install-dir=${D}${bindir}
}

FILES_${PN} += "${bindir} ${datadir}"
