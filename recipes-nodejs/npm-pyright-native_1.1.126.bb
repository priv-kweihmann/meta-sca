SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.126.tgz"
SRC_URI[md5sum] = "913599f201055cf8d5ddcf56f8f8fe8e"
SRC_URI[sha256sum] = "18427b5c697cc67cf1abad2e244414bcc1160dc8fe16913a4814f20cda682651"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
