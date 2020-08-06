SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.523.tgz"
SRC_URI[md5sum] = "ec03fc8ff76898f94f3d47d3d05072d6"
SRC_URI[sha256sum] = "f19c545ed52beb7bf5c9191b3bec0775cdf4f67dc294e23d7b8b6486c327eded"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
