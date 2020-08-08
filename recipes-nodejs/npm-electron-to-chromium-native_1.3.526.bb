SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.526.tgz"
SRC_URI[md5sum] = "292eeaf875b66620a6162750f8e3645c"
SRC_URI[sha256sum] = "14d67beccf4082e670584cb4a4c9ea4d0d9af0560ee1c3cd1369b0606729bfdf"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
