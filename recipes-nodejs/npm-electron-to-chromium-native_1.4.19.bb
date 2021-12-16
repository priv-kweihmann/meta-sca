SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.19.tgz"
SRC_URI[md5sum] = "3269457466e011637e8354a25d9f3171"
SRC_URI[sha256sum] = "5faa5d6294e97bb04fea5f6a7ad82b596f86f26da0e66bd3ada06dd72a706f04"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
