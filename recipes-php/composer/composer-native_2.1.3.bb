SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

SRC_URI = "https://github.com/composer/getcomposer.org/archive/${SRCREV}.zip;protocol=https;downloadfilename=composer-${PV}.zip"
SRC_URI[sha256sum] = "2f78be9e862c39455f2411203179e08b57fa88cd933684227263b63330209e21"

SRCREV = "7c82360a69c44616cb7633521a27fea292708d70"

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

FILES_${PN} += "${bindir} ${datadir}"
