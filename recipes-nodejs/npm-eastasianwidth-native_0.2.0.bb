SUMMARY = "NPM: eastasianwidth"
DESCRIPTION = "Get East Asian Width from a character."
HOMEPAGE = "https://github.com/komagata/eastasianwidth#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eastasianwidth/-/eastasianwidth-0.2.0.tgz"
SRC_URI[md5sum] = "3188b05d988506ac5096226f0559bc27"
SRC_URI[sha256sum] = "eccfa12bbda71f9f8e09de7ad1a4e554369a6b4d43d7f86085e85055a8694c27"

NPM_PKGNAME = "eastasianwidth"

inherit npmhelper
inherit native
