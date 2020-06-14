SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.473.tgz"
SRC_URI[md5sum] = "7c35935d7a2ff17772b830ce23b09d11"
SRC_URI[sha256sum] = "a202d4c7c407488ffd801a817e43a9f35ed25883632bd3c4671539bc313f2ae1"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
