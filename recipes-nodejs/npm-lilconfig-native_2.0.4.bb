SUMMARY = "NPM: lilconfig"
DESCRIPTION = "A zero-dependency alternative to cosmiconfig"
HOMEPAGE = "https://github.com/antonk52/lilconfig#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lilconfig/-/lilconfig-2.0.4.tgz"
SRC_URI[md5sum] = "166348ff62d578d503706cd25f4655fa"
SRC_URI[sha256sum] = "9252cf9d555e7775c8c33d9ab5b0502d71f5b8f767c19fb8ccac1bfe69d1e445"

NPM_PKGNAME = "lilconfig"

inherit npmhelper
inherit native
