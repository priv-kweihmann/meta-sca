SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

SRC_URI = "git://github.com/composer/getcomposer.org.git;protocol=https"
SRCREV = "32ab9260d00d792106f1e43a9ed332ec1c05d5d2"

S = "${WORKDIR}/git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

FILES_${PN} += "${bindir}"

inherit native

do_install() {
    mkdir -p ${D}${bindir}
    php ${S}/web/installer --install-dir=${D}${bindir}
}