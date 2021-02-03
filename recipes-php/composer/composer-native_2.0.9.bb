SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

SRC_URI = "https://github.com/composer/getcomposer.org/archive/${SRCREV}.zip;protocol=https;downloadfilename=composer-${PV}.zip"
SRC_URI[sha256sum] = "4e339738624920bce30f3110ae4893716035d91f1e6026a80f1c999f4823d8ce"

SRCREV = "fa8ea54c9ba4dc3b13111fb4707f9c3b2d4681f6"

UPSTREAM_CHECK_URI = "https://github.com/composer/composer/tags"
UPSTREAM_CHECK_REGEX ?= "/composer/composer/releases/tag/(?P<pver>(\d+[\.]*)+)$"
S = "${WORKDIR}/getcomposer.org-${SRCREV}"

inherit native
inherit sca-nonet-sanity

do_install() {
    export COMPOSER_HOME=${D}${datadir}/composer
    install -d ${D}${bindir}
    php ${S}/web/installer --version=${PV} --install-dir=${D}${bindir}
}

FILES_${PN} += "${bindir} ${datadir}"
