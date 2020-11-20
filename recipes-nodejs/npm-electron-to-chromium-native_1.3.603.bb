SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.603.tgz"
SRC_URI[md5sum] = "a3774cc81ba490bec8d3c7c4477063f2"
SRC_URI[sha256sum] = "dacc5b92abd477683027759ce40c729ffb6494016a351ea58e54ccd120111196"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
