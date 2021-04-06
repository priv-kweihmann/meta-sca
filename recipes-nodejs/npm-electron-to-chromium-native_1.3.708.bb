SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.708.tgz"
SRC_URI[md5sum] = "804160420ad5114a2e6f1eb9d5abaced"
SRC_URI[sha256sum] = "ac18011df8fdb57e69c8aaadf062f2a8b0b04dfad73de938264b988c4851c9e5"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
