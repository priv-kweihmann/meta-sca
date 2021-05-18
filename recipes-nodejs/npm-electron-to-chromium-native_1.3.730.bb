SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.730.tgz"
SRC_URI[md5sum] = "1c39fd826a25b137a665a375309a2d58"
SRC_URI[sha256sum] = "ab5702b1745538c214bcbfef649ce92456188bf30d0f9fd3a2eb6532ef9b284d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
