SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

SRC_URI = "https://github.com/composer/getcomposer.org/archive/${SRCREV}.zip;protocol=https;downloadfilename=composer-${PV}.zip"
SRC_URI[sha256sum] = "31c4f9f27dc2d55b7dbb847203a80b650cb504b6333dc9e68a0d69700fd7f691"

SRCREV = "faf828b1635a601ba364a7ee599250b2690a91ab"

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
