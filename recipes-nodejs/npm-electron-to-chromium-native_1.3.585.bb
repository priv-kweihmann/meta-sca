SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.585.tgz"
SRC_URI[md5sum] = "b02e417b2cbfdd8d730c487d2e8e2536"
SRC_URI[sha256sum] = "a67da782fe94ff40a0f34608113fe59c746d5a68d696b2d8c54b7b8224580afa"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
