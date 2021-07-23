SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.785.tgz"
SRC_URI[md5sum] = "953bb0f16153f369426dbcc2fa87fc30"
SRC_URI[sha256sum] = "fd5a68b2e1cde40ee3c20da811b87d2797e9d4f16f9ee511e6c22791f901ca6d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
