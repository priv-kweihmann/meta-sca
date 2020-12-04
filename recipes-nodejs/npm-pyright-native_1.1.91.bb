SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.91.tgz"
SRC_URI[md5sum] = "acd3ce0ff4a1e96b617d461224dff440"
SRC_URI[sha256sum] = "d8fcd1848ef324296e4687516fb62ea6a1cee85e9cfaeb6cc00b32eb472cab5d"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
