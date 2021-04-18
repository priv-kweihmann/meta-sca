SUMMARY = "NPM: registry-url"
DESCRIPTION = "Get the set npm registry URL"
HOMEPAGE = "https://github.com/sindresorhus/registry-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-rc-native"

SRC_URI = "https://registry.npmjs.org/registry-url/-/registry-url-6.0.0.tgz"
SRC_URI[md5sum] = "ded1ca19d025e17616d9c328cb26a495"
SRC_URI[sha256sum] = "57ad450064992e126de9e74817cd87acb2d5256edcb50781aa7830ae435e32fb"

NPM_PKGNAME = "registry-url"

inherit npmhelper
inherit native
