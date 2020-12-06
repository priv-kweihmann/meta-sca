SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.616.tgz"
SRC_URI[md5sum] = "c1bf64cca81378bfc7a1c1addf3a5ffe"
SRC_URI[sha256sum] = "02519a1c4117a670f6b889b84bb11ece7aacff48d6634e152c9f7ca698332992"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
