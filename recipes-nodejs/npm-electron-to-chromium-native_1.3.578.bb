SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.578.tgz"
SRC_URI[md5sum] = "277ac5f76b21f1cbc290f6a8f2f5f295"
SRC_URI[sha256sum] = "318f159be7e2dbab579811cdc64d7e13f14b7bc960ef2e6da148f8d22794dc62"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
