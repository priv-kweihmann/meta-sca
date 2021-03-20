SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.693.tgz"
SRC_URI[md5sum] = "a587962a2336a7286896e1eb05ef335b"
SRC_URI[sha256sum] = "923bfc9d22135be33ded67572aa9d96579760e7627863bbc89f182f7eb4a4089"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
