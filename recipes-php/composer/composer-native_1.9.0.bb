SUMMARY = "Dependency Manager for PHP"
HOMEPAGE = "https://github.com/composer/composer"

SRC_URI = "https://raw.githubusercontent.com/composer/getcomposer.org/ba13e3fc70f1c66250d1ea7ea4911d593aa1dba5/web/installer;name=installer \
           https://raw.githubusercontent.com/composer/getcomposer.org/ba13e3fc70f1c66250d1ea7ea4911d593aa1dba5/LICENSE;name=lic"

SRC_URI[installer.md5sum] = "0b121e650774d9fb3aae3eca88831a31"
SRC_URI[installer.sha256sum] = "cda07c5b4a786bbd9dbb7612de1341b7e20006ebf8eace7a6a91b90cbe61c2fc"
SRC_URI[lic.md5sum] = "db4ebb1057458d039cb8f6edcc5d756e"
SRC_URI[lic.sha256sum] = "82c3c0c0d1f0f268a9fec4904e79dd2dc9aa8ad3a901319f743da07bfdd5d92a"

S = "${WORKDIR}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db4ebb1057458d039cb8f6edcc5d756e"

DEPENDS += "php-native"

FILES_${PN} += "${bindir}"

inherit native

do_install() {
    mkdir -p ${D}${bindir}
    php ${WORKDIR}/installer --install-dir=${D}${bindir}
}