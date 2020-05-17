SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.437.tgz"
SRC_URI[md5sum] = "f651535c9372a0245fa1c51f097ab8b4"
SRC_URI[sha256sum] = "f74231930f995dcac6941247e0ebbcf251e9adb1a479627a42ac0dea8c77f3f3"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
