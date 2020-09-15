SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.568.tgz"
SRC_URI[md5sum] = "16e4234edc3395256404a31b22d0f97f"
SRC_URI[sha256sum] = "a701cc22f02cbadd83af508fc8016655937282e69c6c8e456af210d015ccc70f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
