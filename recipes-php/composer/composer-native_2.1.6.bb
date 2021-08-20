SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

SRC_URI = "https://github.com/composer/getcomposer.org/archive/${SRCREV}.zip;protocol=https;downloadfilename=composer-${PV}.zip"
SRC_URI[sha256sum] = "d8b33e89f5a6eafa707758247098c8ada26d3239308d2f62be92552a3f7ed684"

SRCREV = "c19391050a3d81f65e61049ebc30dbd4f5a99603"

UPSTREAM_CHECK_URI = "https://github.com/composer/composer/tags"
UPSTREAM_CHECK_REGEX ?= "/composer/composer/releases/tag/(?P<pver>(\d+[\.]*)+)$"
S = "${WORKDIR}/getcomposer.org-${SRCREV}"

inherit sca-nonet-sanity
inherit native

do_install() {
    export COMPOSER_HOME=${D}${datadir}/composer
    install -d ${D}${bindir}
    php ${S}/web/installer --version=${PV} --install-dir=${D}${bindir}
}

FILES:${PN} += "${bindir} ${datadir}"
