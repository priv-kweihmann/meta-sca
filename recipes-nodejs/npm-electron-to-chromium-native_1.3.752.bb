SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.752.tgz"
SRC_URI[md5sum] = "8a478777b36b4fae58e5b38aefd4283d"
SRC_URI[sha256sum] = "316c2681f225d68d4b0fba989a18a7bf77d15c02fd19f722c3ce8d8f35dc9204"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
