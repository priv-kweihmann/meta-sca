SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.822.tgz"
SRC_URI[md5sum] = "9380968208cc426d16f88f8552b2270d"
SRC_URI[sha256sum] = "230cab8a9ec615877c0876ab413afd4ba6ee07c5112bef394f885607d4ab7c6f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
