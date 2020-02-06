SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

SRC_URI = "git://github.com/composer/getcomposer.org.git;protocol=https"
SRCREV = "b5a70434f0f582468a7824418553defaf67d5299"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

FILES_${PN} += "${bindir} ${datadir}"

inherit native

do_install() {
    export COMPOSER_HOME=${D}${datadir}/composer
    mkdir -p ${D}${bindir}
    php ${S}/web/installer --install-dir=${D}${bindir}
}