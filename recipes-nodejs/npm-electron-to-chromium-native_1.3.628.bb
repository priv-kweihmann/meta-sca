SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.628.tgz"
SRC_URI[md5sum] = "84a4dd9eb8caf70ad2b02c805f13ac7f"
SRC_URI[sha256sum] = "1dfe6c71a27d74b3bccf04ff44214a74b0074d7eec1831218b8f917466151f9a"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
