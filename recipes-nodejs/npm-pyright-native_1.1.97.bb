SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.97.tgz"
SRC_URI[md5sum] = "1ffc2996d850efaafaafbf493448024f"
SRC_URI[sha256sum] = "2ecbe51b32f6b4360485fd853d28002bd014daa99ae0d103b2eeb5457b4ce2b9"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
