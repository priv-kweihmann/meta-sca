SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

SRC_URI = "https://github.com/composer/getcomposer.org/archive/${SRCREV}.zip;protocol=https;downloadfilename=composer-${PV}.zip"
SRC_URI[sha256sum] = "1e94760fcb4cbcbcaa786f24e3d64443586628f29083b88a745722e7d0b64b5f"

SRCREV = "11a3bc677c1e6f2b120578d61b780aed7bfdff58"

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
