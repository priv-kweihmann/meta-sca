SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.905.tgz"
SRC_URI[md5sum] = "d3fe355a6af04de5d9b5d56f7b1a9e6d"
SRC_URI[sha256sum] = "ead244ee1f3f4dc6fad6b3e7807610edddea275055e76e43608df9bc3b140c54"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
