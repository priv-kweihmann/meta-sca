SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.681.tgz"
SRC_URI[md5sum] = "e523c192cb33403f61fd5556546e8293"
SRC_URI[sha256sum] = "1e1626085782f9bcb43acacbc203e2149239b243d8661e7095d78665b77f2f8b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
