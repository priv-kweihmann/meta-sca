SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.595.tgz"
SRC_URI[md5sum] = "0d3054bf9984649c95d39cc81cd1c59c"
SRC_URI[sha256sum] = "e42d4f4a0e1769a12db260f64c841907b5a5bb3cfd9b11891e7bc1855ef67f26"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
