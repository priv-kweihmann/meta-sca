SUMMARY = "NPM: widest-line"
DESCRIPTION = "Get the visual width of the widest line in a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/widest-line#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/widest-line/-/widest-line-4.0.0.tgz"
SRC_URI[md5sum] = "f35908d20481a1dc2e67991962bb1e6e"
SRC_URI[sha256sum] = "4af4cbc801c9d97c1979cf244a125ee4f34a10ecdd77842341471156f7c6b397"

NPM_PKGNAME = "widest-line"

inherit npmhelper
inherit native
