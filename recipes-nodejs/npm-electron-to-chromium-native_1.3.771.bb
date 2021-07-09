SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.771.tgz"
SRC_URI[md5sum] = "fdcffc63ec9fcec5a413ca92ceb1872e"
SRC_URI[sha256sum] = "a78b8861ecc0dc1a78aea182e0dee84abe0404999f7f0da449f96ac5d77c5953"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
