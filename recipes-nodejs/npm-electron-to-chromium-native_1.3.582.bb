SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.582.tgz"
SRC_URI[md5sum] = "4902c98692928a87ef649a20ea6c2b15"
SRC_URI[sha256sum] = "5e18bbc3565580973c5e6303b069fc81601d4f8e99c8c6bd8c6624cea673c033"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
