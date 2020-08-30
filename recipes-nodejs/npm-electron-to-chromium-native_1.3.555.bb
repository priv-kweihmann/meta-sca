SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.555.tgz"
SRC_URI[md5sum] = "3023749d4410a04e99648f7edffc2431"
SRC_URI[sha256sum] = "eb8d3ab0e161a242218f14fa2048e593f9f8615789219cc8b02de47c9e853117"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
