SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-colorette-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.4.tgz"
SRC_URI[md5sum] = "25e194f7c96931e8936a4952b80697dc"
SRC_URI[sha256sum] = "e6333832a23fdd6590032a4c77ec8cb20f830c702c273384dd51129761010e94"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native
