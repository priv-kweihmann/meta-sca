SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.901.tgz"
SRC_URI[md5sum] = "4905ea6c9b57eacb53fd217ae3a78f3c"
SRC_URI[sha256sum] = "144849d4d6eefb77a215be053acc3d1749c579a4b08f8ab6d2b5d52f5395c95d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
