SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.583.tgz"
SRC_URI[md5sum] = "1e029141cac5bf4ada4ff6ba176fed73"
SRC_URI[sha256sum] = "94efd4afcb14749cbd5ce05e881be7b7632f445bc39ccfc0f651da1e259ae9e6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
