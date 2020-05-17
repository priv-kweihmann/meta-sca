SUMMARY = "NPM: color-convert"
DESCRIPTION = "Plain color conversion functions"
HOMEPAGE = "https://github.com/Qix-/color-convert#readme"

DEPENDS = "npm-color-name-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811"

SRC_URI = "https://registry.npmjs.org/color-convert/-/color-convert-2.0.1.tgz"
SRC_URI[md5sum] = "0248ebc952524207e296a622372faa1f"
SRC_URI[sha256sum] = "920fa43538c019a085dbbf04cb6f72cc337624e5f5217519f0e7b2ef784e7ce1"

NPM_PKGNAME = "color-convert"

inherit npmhelper
inherit native
