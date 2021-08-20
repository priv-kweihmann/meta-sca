SUMMARY = "NPM: mimic-response"
DESCRIPTION = "Mimic a Node.js HTTP response stream"
HOMEPAGE = "https://github.com/sindresorhus/mimic-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mimic-response/-/mimic-response-4.0.0.tgz"
SRC_URI[md5sum] = "975fd2e02f6c8944cd9499f72921a89c"
SRC_URI[sha256sum] = "0d930f4d7e6aaef418ba89732b8bddd1c31992c224e593a811d5b77494074ceb"

NPM_PKGNAME = "mimic-response"

inherit npmhelper
inherit native
