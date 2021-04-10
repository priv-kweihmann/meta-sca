SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.712.tgz"
SRC_URI[md5sum] = "f44d4b1d46338f3d6c04c865e346eb69"
SRC_URI[sha256sum] = "318593acb294c08e3e4d59ccf56f3ed2970add1e401793e459ddb298d8432ca6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
