SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.92.tgz"
SRC_URI[md5sum] = "89c7fb417d567ec4de45c84e417af11e"
SRC_URI[sha256sum] = "f06d10f0b0228bd5f4cabc6a00a556cfa23e96beae058a4d20f0d4460a56a536"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
