SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.627.tgz"
SRC_URI[md5sum] = "6cc39c3bdb52e6f826dfd7d98b46ceab"
SRC_URI[sha256sum] = "1a8a01f59bd6a3e779b361f02fcfc96c8fd67a47edfbcf22a718bcd6246398ab"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
