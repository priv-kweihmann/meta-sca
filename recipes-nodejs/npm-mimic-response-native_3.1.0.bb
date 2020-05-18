SUMMARY = "NPM: mimic-response"
DESCRIPTION = "Mimic a Node.js HTTP response stream"
HOMEPAGE = "https://github.com/sindresorhus/mimic-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mimic-response/-/mimic-response-3.1.0.tgz"
SRC_URI[md5sum] = "f36e6c8ca66f3adff9739988552f7e76"
SRC_URI[sha256sum] = "321e9b7c155cd47183de9d9cdbd6c37bca8187e15b11a42443883330c063dd54"

NPM_PKGNAME = "mimic-response"

inherit npmhelper
inherit native
